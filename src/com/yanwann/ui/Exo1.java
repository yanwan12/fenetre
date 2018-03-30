package com.yanwann.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

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
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(0, 372, 520, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnWesh = new JButton("Wesh");
		btnWesh.setBounds(461, 0, 59, 372);
		frame.getContentPane().add(btnWesh);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(0, 0, 97, 372);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton btnBut = new JButton("but");
		btnBut.setBounds(223, 194, 89, 23);
		frame.getContentPane().add(btnBut);
	}
}
