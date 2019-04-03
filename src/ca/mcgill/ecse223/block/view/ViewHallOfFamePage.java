
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
import javax.swing.JTextArea;

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
		lblGame.setForeground(new Color(240, 248, 255));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		
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
		
		JLabel lblHallOfFame = new JLabel("HALL OF FAME");
		lblHallOfFame.setForeground(Color.CYAN);
		lblHallOfFame.setFont(projectfont32);
		
		JLabel lblTopTen = new JLabel("TOP TEN");
		lblTopTen.setForeground(Color.CYAN);
		lblTopTen.setFont(projectfont22);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.CYAN);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.GREEN);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(153, 50, 204));
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.MAGENTA);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 0));
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.CYAN);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.GREEN);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GREEN);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(153, 50, 204));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.YELLOW);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.MAGENTA);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.CYAN);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GREEN);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(153, 50, 204));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.MAGENTA);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(153, 50, 204));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.MAGENTA);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.YELLOW);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.CYAN);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.GREEN);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(153, 50, 204));
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.CYAN);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(153, 50, 204));
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.YELLOW);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(Color.GREEN);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.MAGENTA);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.CYAN);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.YELLOW);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(153, 50, 204));
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.GREEN);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(Color.YELLOW);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(153, 50, 204));
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.MAGENTA);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.CYAN);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.GREEN);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.YELLOW);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setForeground(new Color(100, 149, 237));
		layeredPane_3.setBackground(new Color(100, 149, 237));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
									.addGap(114)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(layeredPane_3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
											.addComponent(lblTopTen)
											.addGap(60))
										.addComponent(lblHallOfFame))
									.addGap(11)))
							.addGap(96)
							.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGame)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addGap(82)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(207))
								.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(27)
									.addComponent(lblGame)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblHallOfFame)
									.addGap(10)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8)
									.addComponent(lblTopTen)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(layeredPane_3, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
								.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
													.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
													.addGap(63)
													.addComponent(btnLogout)
													.addGap(35))
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))))
										.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(93)
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addGap(62)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		
		JLabel label = new JLabel("1.");
		label.setForeground(new Color(240, 255, 255));
		label.setBounds(6, 6, 176, 16);
		layeredPane_3.add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setForeground(new Color(240, 248, 255));
		label_1.setBounds(6, 34, 176, 16);
		layeredPane_3.add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setForeground(new Color(240, 248, 255));
		label_2.setBounds(6, 62, 176, 16);
		layeredPane_3.add(label_2);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setForeground(new Color(240, 248, 255));
		label_3.setBounds(6, 93, 176, 16);
		layeredPane_3.add(label_3);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setForeground(new Color(240, 248, 255));
		label_4.setBounds(6, 121, 176, 16);
		layeredPane_3.add(label_4);
		
		JLabel label_5 = new JLabel("6.");
		label_5.setForeground(new Color(240, 248, 255));
		label_5.setBounds(6, 149, 176, 16);
		layeredPane_3.add(label_5);
		
		JLabel label_6 = new JLabel("7.");
		label_6.setForeground(new Color(240, 248, 255));
		label_6.setBounds(6, 177, 176, 16);
		layeredPane_3.add(label_6);
		
		JLabel label_7 = new JLabel("8.");
		label_7.setForeground(new Color(240, 248, 255));
		label_7.setBounds(6, 205, 176, 16);
		layeredPane_3.add(label_7);
		
		JLabel label_8 = new JLabel("9.");
		label_8.setForeground(new Color(240, 248, 255));
		label_8.setBounds(6, 233, 176, 16);
		layeredPane_3.add(label_8);
		
		JLabel label_9 = new JLabel("10.");
		label_9.setForeground(new Color(240, 248, 255));
		label_9.setBounds(6, 261, 176, 16);
		layeredPane_3.add(label_9);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(200, 200, 746, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}

