
/*
 * Copyright (c) 2013.
 * Code written by Jasper Reddin
 */

package tenny1028.ActionListeners;

import tenny1028.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Processor implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.process();
	}
}
