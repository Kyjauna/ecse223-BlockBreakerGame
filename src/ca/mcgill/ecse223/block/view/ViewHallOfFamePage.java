
package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

//import ca.mcgill.ecse223.block.application.Block223Application;
import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;
//import ca.mcgill.ecse223.block.controller.TOGame;
import ca.mcgill.ecse223.block.controller.TOGame;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;

// import java.awt.Choice;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
//import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ViewHallOfFamePage {

	public JFrame frame;
	JLabel lblErrorMessage;
	int level;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHallOfFamePage window = new ViewHallOfFamePage();
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
	public ViewHallOfFamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
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
		Font projectfont32 = projectfont.deriveFont(32f);
		Font projectfont22 = projectfont.deriveFont(22f);
		
		/* The comboBox needs to have a list of all the names of the existing games. */
		
		JLabel lblGame = new JLabel("Game");
		try {
			lblGame.setText(Block223Controller.getCurrentDesignableGame().getName());
		} catch (InvalidInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblGame.setFont(projectfont52);
		lblGame.setForeground(new Color(224,255,255));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 255, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 0, 153));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.MAGENTA);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.YELLOW);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 204, 255));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.YELLOW);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 204, 255));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(51, 255, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(102, 0, 153));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.MAGENTA);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.YELLOW);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 204, 255));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(51, 255, 0));
		
		JDesktopPane layeredPane_1 = new JDesktopPane();
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane_1.setLayer(layeredPane, 50);
		layeredPane.setBounds(0, 0, 624, 485);
		layeredPane_1.add(layeredPane);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setForeground(new Color(204, 255, 255));
		lblErrorMessage.setFont(new Font("Monospaced", Font.BOLD, 12));

		
		/* Logout Button */
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Logging out will take you back to the Welcome Page */
				Block223Controller.logout();
				
				WelcomePage homePage = new WelcomePage();
				homePage.frame.setVisible(true);
				frame.setVisible(false);
				Block223Controller.logout();
				
			}
		});
		btnLogout.setFont(projectfont15);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(102, 0, 153));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(51, 255, 0));
		
		JLabel lblHallOfFame = new JLabel("HALL OF FAME");
		lblHallOfFame.setForeground(new Color(224, 255, 255));
		lblHallOfFame.setFont(projectfont32);
		
		JLabel lblTopTen = new JLabel("TOP TEN");
		lblTopTen.setForeground(new Color(224, 255, 255));
		lblTopTen.setFont(projectfont22);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(259)
								.addComponent(lblHallOfFame)
								.addGap(96)
								.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
										.addGap(69))))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblGame)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
								.addGap(390)))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(322)
					.addComponent(lblTopTen)
					.addContainerGap(683, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addComponent(lblGame)
							.addGap(39)
							.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addComponent(lblHallOfFame)))
					.addGap(31)
					.addComponent(lblTopTen)
					.addPreferredGap(ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
					.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addComponent(panel_15, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 728, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}

