package com.yanwann.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Exo1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exo1 window = new Exo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		frame.getContentPane().add(chckbxNewCheckBox, BorderLayout.SOUTH);
		
		JButton btnWesh = new JButton("Wesh");
		frame.getContentPane().add(btnWesh, BorderLayout.EAST);
	}

}
