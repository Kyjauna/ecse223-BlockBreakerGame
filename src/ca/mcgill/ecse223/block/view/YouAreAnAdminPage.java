package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YouAreAnAdminPage {

	public JFrame frame;
	public JTextField NewGameNameTxt;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YouAreAnAdminPage window = new YouAreAnAdminPage();
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
	public YouAreAnAdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
		JLabel lblYouAreAn = new JLabel("YOU ARE AN ADMIN");
		lblYouAreAn.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblYouAreAn.setForeground(new Color(204, 255, 255));
		
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
		
		NewGameNameTxt = new JTextField();
		NewGameNameTxt.setText("YOUR NEW GAME");
		NewGameNameTxt.setToolTipText("");
		NewGameNameTxt.setFont(new Font("Monospaced", Font.PLAIN, 12));
		NewGameNameTxt.setForeground(new Color(169, 169, 169));
		NewGameNameTxt.setColumns(10);
		
		/* Create New Game Button */
		
		JButton btnCreateNewGame = new JButton("CREATE NEW GAME");
		btnCreateNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateNewGame.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		/* Drop down menu for all existing games */
		
		JComboBox comboBoxExistingGame = new JComboBox();
		comboBoxExistingGame.setBackground(new Color(204, 255, 255));
		comboBoxExistingGame.setMaximumRowCount(12);
		comboBoxExistingGame.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		/* Logout Button */
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Logging out will take you back to the Welcome Page */
				
				WelcomePage homePage = new WelcomePage();
				homePage.frame.setVisible(true);
				
			}
		});
		btnLogout.setFont(new Font("Monospaced", Font.BOLD, 11));
		
		/* Delete button */
		
		JButton button = new JButton("DELETE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Deleting a game will remove the name from the drop down menu; stay on AdminPage */
				
			}
		});
		
		button.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		/* Update Button */
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* Updating an existing game should take you to the UpdateGamePage */
			}
		});
		
		btnUpdate.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(188)
							.addComponent(lblYouAreAn))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(246)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBoxExistingGame, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCreateNewGame, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(NewGameNameTxt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(288)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(57)
					.addComponent(lblYouAreAn)
					.addGap(63)
					.addComponent(NewGameNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCreateNewGame)
					.addGap(18)
					.addComponent(comboBoxExistingGame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 704, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
