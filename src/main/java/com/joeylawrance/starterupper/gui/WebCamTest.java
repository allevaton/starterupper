package com.joeylawrance.starterupper.gui;

import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;

public class WebCamTest {
	public static void main(String[] args) {
		JFrame window = new JFrame("Test Webcam Panel");
		window.add(new PicturePanel());
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
