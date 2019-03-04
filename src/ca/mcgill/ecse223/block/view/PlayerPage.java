package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

import ca.mcgill.ecse223.block.controller.Block223Controller;

import javax.swing.JButton;

public class PlayerPage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerPage window = new PlayerPage();
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
	public PlayerPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Font projectfont = null;
		try {
			projectfont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/ARCADECLASSIC.TTF"));
		} catch (FontFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Font projectfont52 = projectfont.deriveFont(52f);
		Font projectfont15 = projectfont.deriveFont(15f);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(75, 0, 130));
		frame.setBounds(100, 100, 704, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel = new JLabel("YOU   ARE   A   PLAYER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(75, 0, 130));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(projectfont52);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Logging out will take you back to the Welcome Page */
				Block223Controller.logout();
				
				WelcomePage homePage = new WelcomePage();
				frame.setVisible(false);
				homePage.frame.setVisible(true);
				
			}
		});
		btnLogout.setFont(projectfont15);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(302)
							.addComponent(btnLogout))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(53)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
