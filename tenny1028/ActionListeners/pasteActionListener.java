package tenny1028.ActionListeners;

import tenny1028.MainFrame;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class pasteActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		try {
			String result = (String) clipboard.getData(DataFlavor.stringFlavor);
			MainFrame.Field.setText(MainFrame.Field.getText() + result);
			MainFrame.Field.requestFocus();
			MainFrame.Field.selectAll();
		} catch (UnsupportedFlavorException ex) {
			System.out.println("UnsupportedFlavorException");
		} catch (IOException ex) {
			System.out.println("IOException");
		}
	}
}
