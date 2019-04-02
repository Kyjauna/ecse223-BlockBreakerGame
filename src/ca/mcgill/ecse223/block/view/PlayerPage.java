package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;
import ca.mcgill.ecse223.block.controller.TOGame;
import ca.mcgill.ecse223.block.controller.TOUserMode;
import ca.mcgill.ecse223.block.controller.TOUserMode.Mode;

import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.EnumSet;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class PlayerPage {

	public JFrame frame;
	public static JComboBox<String> selectAGame;
	public static JComboBox<String> resumeAGame;
	JLabel lblError;



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
		//	refresh();
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
		Font projectfont18 =projectfont.deriveFont(18f);

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 624, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JDesktopPane layeredPane_1 = new JDesktopPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addContainerGap())
				);
		layeredPane_1.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane_1.setLayer(layeredPane, 50);
		layeredPane.setBounds(0, 0, 624, 485);
		layeredPane_1.add(layeredPane);

		JLabel lblNewLabel = new JLabel("YOU  ARE  A  PLAYER");
		lblNewLabel.setBounds(97, 38, 419, 67);
		layeredPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(175, 238, 238));
		lblNewLabel.setFont(projectfont52);

		JPanel panel_22 = new JPanel();
		layeredPane.setLayer(panel_22, 1);
		panel_22.setBounds(123, 122, 376, 242);
		layeredPane.add(panel_22);
		panel_22.setBackground(new Color(0, 0, 102,200));
		layeredPane_1.setLayer(panel_22, 10);

		//	JComboBox selectAGame = new JComboBox();
		//	selectAGame.setFont(projectfont15);

		/* ComboBox taken from AdminPage */

		selectAGame = new JComboBox<String>();
		selectAGame.setBackground(new Color(204, 255, 255));
		selectAGame.setMaximumRowCount(12);
		selectAGame.setFont(projectfont15);

		JLabel lblError = new JLabel("");
		lblError.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setForeground(Color.ORANGE);

		JLabel lblPlayableGames = new JLabel("PLAYABLE  GAMES");
		lblPlayableGames.setFont(projectfont18);
		lblPlayableGames.setForeground(new Color(175, 238, 238));

		/* View Hall of Fame */
		JButton viewHallOfFameBtn = new JButton("VIEW  HALL OF FAME");
		viewHallOfFameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String gameHallOfFame = (String) selectAGame.getSelectedItem();

				try {
					Block223Controller.selectGame(gameHallOfFame);
					ViewHallOfFamePage hallOfFame = new ViewHallOfFamePage();
					hallOfFame.frame.setVisible(true);
					frame.setVisible(false);
				}
				catch (InvalidInputException e1) {
					lblError.setText(e1.getMessage());
				}
			}
		});
		viewHallOfFameBtn.setFont(projectfont15);

		/* Start a new game */
		JButton startNewGameBtn = new JButton("START NEW GAME");
		startNewGameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gameToStart = (String) selectAGame.getSelectedItem();

				try {
					Block223Controller.selectGame(gameToStart);
					// I think instead of selectGame it should be startGame
					GamePlayPage playGame = new GamePlayPage();
					playGame.frame.setVisible(true);
					frame.setVisible(false);
					// start game
				}
				catch (InvalidInputException e1) {
					lblError.setText(e1.getMessage());
				}
			}
		});
		startNewGameBtn.setFont(projectfont15);
		
		resumeAGame = new JComboBox<String>();
		resumeAGame.setBackground(new Color(204, 255, 255));
		resumeAGame.setMaximumRowCount(12);
		resumeAGame.setFont(projectfont15);

		JLabel lblContinuePlaying = new JLabel("CONTINUE PLAYING");
		lblContinuePlaying.setFont(projectfont18);
		lblContinuePlaying.setForeground(new Color(175, 238, 238));

		

		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
				gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
						.addContainerGap(83, Short.MAX_VALUE)
						.addComponent(selectAGame, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addGap(77))
				.addGroup(gl_panel_22.createSequentialGroup()
						.addContainerGap(124, Short.MAX_VALUE)
						.addComponent(lblPlayableGames)
						.addGap(118))
				.addGroup(gl_panel_22.createSequentialGroup()
						.addGroup(gl_panel_22.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_22.createSequentialGroup()
										.addContainerGap()
										.addComponent(viewHallOfFameBtn, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(startNewGameBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
										.addGap(6))
								.addGroup(Alignment.LEADING, gl_panel_22.createSequentialGroup()
										.addGap(23)
										.addComponent(lblError, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(23, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_22.createSequentialGroup()
						.addContainerGap(82, Short.MAX_VALUE)
						.addComponent(resumeAGame, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addGap(80))
				.addGroup(gl_panel_22.createSequentialGroup()
						.addGap(111)
						.addComponent(lblContinuePlaying)
						.addContainerGap(113, Short.MAX_VALUE))
				);
		gl_panel_22.setVerticalGroup(
				gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
						.addGap(32)
						.addComponent(lblPlayableGames)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(selectAGame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_22.createParallelGroup(Alignment.BASELINE)
								.addComponent(startNewGameBtn)
								.addComponent(viewHallOfFameBtn))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblError)
						.addGap(28)
						.addComponent(lblContinuePlaying)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(resumeAGame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE))
				);
		panel_22.setLayout(gl_panel_22);

		JLabel playerUserName = new JLabel("USERNAME");
		playerUserName.setHorizontalAlignment(SwingConstants.CENTER);
		playerUserName.setFont(projectfont15);
		playerUserName.setForeground(Color.WHITE);
		playerUserName.setBounds(251, 91, 121, 28);
		layeredPane.add(playerUserName);


		JLabel lblError2 = new JLabel("");
		lblError2.setForeground(Color.ORANGE);
		lblError2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblError2.setHorizontalAlignment(SwingConstants.CENTER);
		lblError2.setBounds(155, 383, 315, 16);
		layeredPane.add(lblError2);

		
		/* Resume playing game */
		JButton btnResume = new JButton("RESUME");
		btnResume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String resumeGame = (String) resumeAGame.getSelectedItem();
				
				try {
					Block223Controller.selectGame(resumeGame);
					// I'm pretty sure I should just call startGame and not selectGame
					GamePlayPage resumedGamePage = new GamePlayPage();
					resumedGamePage.frame.setVisible(true);
					frame.setVisible(false);
				}
				catch (InvalidInputException e1) {
					lblError2.setText(e1.getMessage());
				}
			}
		});
		layeredPane.setLayer(btnResume, 40);
		btnResume.setFont(projectfont15);
		btnResume.setBounds(251, 347, 117, 29);
		layeredPane.add(btnResume);

		/* Logout */
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage logout = new WelcomePage();
				logout.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout.setBounds(251, 443, 117, 29);
		btnLogout.setFont(projectfont15);
		layeredPane.add(btnLogout);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 125, 122);
		panel.setBackground(Color.GREEN);
		layeredPane_1.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(124, 0, 125, 122);
		panel_1.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_1);

		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(0, 0, 102,200));
		layeredPane_1.setLayer(panel_21, 1);
		panel_21.setBounds(43, 26, 540, 407);
		layeredPane_1.add(panel_21);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(249, 0, 125, 122);
		panel_2.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(374, 0, 125, 122);
		panel_3.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(498, 0, 125, 122);
		panel_4.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 122, 125, 122);
		panel_5.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_5);

		JPanel panel_7 = new JPanel();
		layeredPane_1.setLayer(panel_7, 3);
		panel_7.setBounds(249, 122, 125, 122);
		panel_7.setBackground(Color.GREEN);
		layeredPane_1.add(panel_7);

		JPanel panel_8 = new JPanel();
		layeredPane_1.setLayer(panel_8, 3);
		panel_8.setBounds(374, 122, 125, 122);
		panel_8.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(498, 122, 125, 122);
		panel_9.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_9);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 242, 125, 122);
		panel_10.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_10);

		JPanel panel_11 = new JPanel();
		layeredPane_1.setLayer(panel_11, 3);
		panel_11.setBounds(124, 242, 125, 122);
		panel_11.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_11);

		JPanel panel_12 = new JPanel();
		layeredPane_1.setLayer(panel_12, 3);
		panel_12.setBounds(249, 242, 125, 122);
		panel_12.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_12);

		JPanel panel_13 = new JPanel();
		layeredPane_1.setLayer(panel_13, 3);
		panel_13.setBounds(374, 242, 125, 122);
		panel_13.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_13);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(498, 242, 125, 122);
		panel_14.setBackground(Color.GREEN);
		layeredPane_1.add(panel_14);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 363, 125, 122);
		panel_15.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_15);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(124, 363, 125, 122);
		panel_16.setBackground(Color.GREEN);
		layeredPane_1.add(panel_16);

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(249, 363, 125, 122);
		panel_17.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_17);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(374, 363, 125, 122);
		panel_18.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_18);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(498, 363, 125, 122);
		panel_19.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_19);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(0, 0, 10, 10);
		layeredPane_1.add(panel_20);

		JPanel panel_6 = new JPanel();
		layeredPane_1.setLayer(panel_6, 3);
		panel_6.setBackground(new Color(102, 255, 255));
		panel_6.setBounds(124, 122, 125, 122);
		layeredPane_1.add(panel_6);

	}

	/*	public void refresh() {
		lblError.setText("");
		System.out.println("Hello World");
		try {
			List <TOGame> availableGames = Block223Controller.getDesignableGames();
			selectAGame.removeAllItems();
			for(TOGame game : availableGames) {
				selectAGame.addItem(game.getName());
			}
		}
		catch (InvalidInputException e) {
			lblError.setText(e.getMessage());
		}
	} */
}


