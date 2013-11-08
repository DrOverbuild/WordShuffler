
/*
 * Copyright (c) 2013.
 * Code written by Jasper Reddin
 */

package tenny1028.ActionListeners;

import tenny1028.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class copyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String theString = MainFrame.Field.getText();
		StringSelection selection = new StringSelection(theString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		MainFrame.Field.requestFocus();
		MainFrame.Field.selectAll();
	}
}
