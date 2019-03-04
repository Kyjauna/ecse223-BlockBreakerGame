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
//		Font projectfont24 = projectfont.deriveFont(24f);
//		Font projectfont10 = projectfont.deriveFont(10f);
		
		JLabel lblYouAreAn = new JLabel("YOU ARE AN ADMIN");
		lblYouAreAn.setFont(projectfont52);
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
		
		JDesktopPane layeredPane_1 = new JDesktopPane();
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane_1.setLayer(layeredPane, 50);
		layeredPane.setBounds(0, 0, 624, 485);
		layeredPane_1.add(layeredPane);
		
		JLabel lblErrorMessage = new JLabel("");
		lblErrorMessage.setForeground(new Color(204, 255, 255));
		lblErrorMessage.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		NewGameNameTxt = new JTextField();
		NewGameNameTxt.setToolTipText("");
		NewGameNameTxt.setFont(new Font("Monospaced", Font.PLAIN, 12));
		NewGameNameTxt.setForeground(new Color(0, 0, 0));
		NewGameNameTxt.setColumns(10);
				
		/* Drop Down Menu */
		
		JComboBox<String> comboBoxExistingGame = new JComboBox<String>();
		comboBoxExistingGame.setBackground(new Color(204, 255, 255));
		comboBoxExistingGame.setMaximumRowCount(12);
		comboBoxExistingGame.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		/* The comboBox needs to have a list of all the names of the existing games. */
		
		List<TOGame> designableGames = null;
		try {
			designableGames = Block223Controller.getDesignableGames();
		} catch (InvalidInputException e2) {
			lblErrorMessage.setText(e2.getMessage());
		}
		String[] designableGame = designableGames.toArray(new String[0]);
		for (int i = 0; i < designableGames.size(); i++)
		{
			comboBoxExistingGame.addItem(designableGame[i]);
		}
		
		/* Create New Game Button */
		
		JButton btnCreateNewGame = new JButton("CREATE   NEW   GAME");
		btnCreateNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String newGameName = NewGameNameTxt.getText();
				
				/* Actually create the game */
				try {
					Block223Controller.createGame(newGameName);
					/* Add game name to comboBox when it's created */
					comboBoxExistingGame.addItem(newGameName);
					/* Creating a new game will take you to the updateGamePage */
					UpdateGamePage createGame = new UpdateGamePage();
					createGame.frame.setVisible(true);
					
				} catch (InvalidInputException e1) {
					lblErrorMessage.setText(e1.getMessage());
				}				
				
			}
		});
		btnCreateNewGame.setFont(projectfont15);

		
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
		
		/* Delete button */
		
		JButton button = new JButton("DELETE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Deleting a game will remove the name from the drop down menu; stay on AdminPage */
				// This gets the selected item
				String gameToRemove = (String) comboBoxExistingGame.getSelectedItem();

				/* Actually delete a game */
				try {
					Block223Controller.deleteGame(gameToRemove);
					// This removes the selected item from the menu
					comboBoxExistingGame.removeItem(gameToRemove);
					System.out.println("HELLO WORLD");

				} catch (InvalidInputException e1) {
					lblErrorMessage.setText(e1.getMessage());
				}
			
			}
		});
		
		button.setFont(projectfont15);
		
		/* Update Button */
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* Updating an existing game should take you to the UpdateGamePage */
				String gameToUpdate = (String) comboBoxExistingGame.getSelectedItem();
				
				// How to get all the information of the game I want to update?
				try {
					Block223Controller.selectGame(gameToUpdate);
					System.out.println("hello world");
					// How do I get to the update game page with the correct game???
					UpdateGamePage updateGame = new UpdateGamePage();
					updateGame.frame.setVisible(true);
				
				} catch (InvalidInputException e) {
					lblErrorMessage.setText(e.getMessage());
				}
			}
		});
		
		btnUpdate.setFont(projectfont15);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
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
							.addGap(246)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBoxExistingGame, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCreateNewGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(NewGameNameTxt, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(288)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(164, Short.MAX_VALUE)
					.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(137)
					.addComponent(lblYouAreAn)
					.addContainerGap(153, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
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
		frame.setBounds(100, 100, 704, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
