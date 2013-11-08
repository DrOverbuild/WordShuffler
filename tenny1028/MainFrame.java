
/*
 * Copyright (c) 2013.
 * Code written by Jasper Reddin
 */

package tenny1028;

import tenny1028.ActionListeners.Processor;
import tenny1028.ActionListeners.pasteActionListener;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

	public static JTextField Field;

	public MainFrame() {
		super();
		setLayout(new BorderLayout(10,5));
		final JLabel Label;
		final JPanel ButtonPanel;
		final JButton ProcessButton;
		final JButton Quit;
		final JButton Copy;
		final JButton Paste;

		Processor shuffler = new Processor();

		Label = new JLabel("  Enter Text: ");
		add(Label, BorderLayout.WEST);


		Field  = new JTextField(20);
		add(Field, BorderLayout.CENTER);
		Field.addActionListener(shuffler);

		ButtonPanel = new JPanel();
		ButtonPanel.setLayout(new BorderLayout(5,5));

		Quit = new JButton("Quit");
		ButtonPanel.add(Quit, BorderLayout.WEST);
		Quit.addActionListener(new tenny1028.ActionListeners.closeActionPerformed());

		Copy = new JButton("Copy");
		ButtonPanel.add(Copy, BorderLayout.EAST);
		Copy.addActionListener(new tenny1028.ActionListeners.copyActionListener());


		Paste = new JButton("Paste");
		ButtonPanel.add(Paste, BorderLayout.CENTER);
		Paste.addActionListener(new pasteActionListener());

		ProcessButton = new JButton("Shuffle");
		ButtonPanel.add(ProcessButton, BorderLayout.NORTH);
		ProcessButton.addActionListener(shuffler);

		Field.addActionListener(shuffler);


		add(ButtonPanel,BorderLayout.SOUTH);

		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);


	}
	public static void process(){
		Field.setText(tenny1028.wordshuffler.WordShuffler.shuffle(Field.getText()));
	}
}

