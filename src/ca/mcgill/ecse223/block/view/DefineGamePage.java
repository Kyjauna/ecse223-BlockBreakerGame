package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

import java.awt.Font;

public class DefineGamePage {

	public JFrame frame;
	public JTextField numberOfLevelsTxt;
	public JTextField blocksPerLevelTxt;
	public JTextField xBallSpeedTxt;
	public JTextField yBallSpeedTxt;
	public JTextField speedIncreaseFactorTxt;
	public JTextField minPaddleLengthTxt;
	public JTextField maxPaddleLengthTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefineGamePage window = new DefineGamePage();	
					window.frame.setVisible(true);
					window.frame.setSize(new Dimension(710, 500));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DefineGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
		/* Build Button */
		JLabel lblErrormessage = new JLabel(" ");
		lblErrormessage.setForeground(new Color(255, 255, 0));
		
		JButton btnBuild = new JButton("BUILD");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this action should take you to the GamePage
				// These lines assign the values of the game specifications.
				
				String stringNumberOfLevels = numberOfLevelsTxt.getText();
				int numberOfLevels = Integer.parseInt(stringNumberOfLevels);
				
				String stringBlocksPerLevel = blocksPerLevelTxt.getText();
				int blocksPerLevel = Integer.parseInt(stringBlocksPerLevel);
								
				String stringXBallSpeed = xBallSpeedTxt.getText();
				int xBallSpeed = Integer.parseInt(stringXBallSpeed);
				
				String stringYBallSpeed = yBallSpeedTxt.getText();
				int yBallSpeed = Integer.parseInt(stringYBallSpeed);
				
				String stringSpeedIncreaseFactor = speedIncreaseFactorTxt.getText();
				double speedIncreaseFactor = Double.parseDouble(stringSpeedIncreaseFactor);
				
				String stringMinPaddleLength = minPaddleLengthTxt.getText();
				int minPaddleLength = Integer.parseInt(stringMinPaddleLength);
				
				String stringMaxPaddleLength = maxPaddleLengthTxt.getText();
				int maxPaddleLength = Integer.parseInt(stringMaxPaddleLength);
				
				try {
					Block223Controller.setGameDetails( numberOfLevels, blocksPerLevel, xBallSpeed, yBallSpeed, speedIncreaseFactor, maxPaddleLength, minPaddleLength);
					GameLevelPage gamePage = new GameLevelPage(); 	// Launches a new page (of type GameLevel)
					gamePage.frame.setVisible(true);	
					frame.setVisible(false);
				} catch (InvalidInputException e1) {
					lblErrormessage.setText(e1.getMessage());
				}
				
				 
			}
		});
		btnBuild.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBuild.setBackground(new Color(135, 206, 235));
		
		numberOfLevelsTxt = new JTextField();
		numberOfLevelsTxt.setForeground(new Color(0, 0, 153));
		/* try {
			numberOfLevelsTxt.setText(""+Block223Controller.getCurrentDesignableGame().getNrLevels());
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		} */
		numberOfLevelsTxt.setColumns(10);
		
		blocksPerLevelTxt = new JTextField();
		blocksPerLevelTxt.setText("");
		blocksPerLevelTxt.setForeground(new Color(0, 0, 204));
		blocksPerLevelTxt.setColumns(10);
		
		xBallSpeedTxt = new JTextField();
		xBallSpeedTxt.setText("");
		xBallSpeedTxt.setForeground(new Color(0, 0, 204));
		xBallSpeedTxt.setColumns(10);
		
		yBallSpeedTxt = new JTextField();
		yBallSpeedTxt.setText("");
		yBallSpeedTxt.setForeground(new Color(0, 0, 204));
		yBallSpeedTxt.setColumns(10);
		
		speedIncreaseFactorTxt = new JTextField();
		speedIncreaseFactorTxt.setText("");
		speedIncreaseFactorTxt.setForeground(new Color(0, 0, 204));
		speedIncreaseFactorTxt.setColumns(10);
		
		minPaddleLengthTxt = new JTextField();
		minPaddleLengthTxt.setText("");
		minPaddleLengthTxt.setForeground(new Color(0, 0, 204));
		minPaddleLengthTxt.setColumns(10);
		
		maxPaddleLengthTxt = new JTextField();
		maxPaddleLengthTxt.setText("");
		maxPaddleLengthTxt.setForeground(new Color(0, 0, 204));
		maxPaddleLengthTxt.setColumns(10);
		
		JLabel lblCreateNewGame = new JLabel("DEFINE GAME SETTINGS");
		lblCreateNewGame.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblCreateNewGame.setForeground(new Color(204, 255, 255));
		lblCreateNewGame.setBackground(new Color(70, 130, 180));
		
		JLabel lblNumberOfLevels = new JLabel("Number of Levels");
		lblNumberOfLevels.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNumberOfLevels.setForeground(new Color(204, 255, 255));
		
		JLabel lblblocksPerLevle = new JLabel("#BLOCKS PER LEVEL");
		lblblocksPerLevle.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblblocksPerLevle.setForeground(new Color(204, 255, 255));
		
		JLabel lblMinXBall = new JLabel("MIN X BALL SPEED");
		lblMinXBall.setForeground(new Color(204, 255, 255));
		lblMinXBall.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		JLabel lblMinYBall = new JLabel("MIN Y BALL SPEED");
		lblMinYBall.setForeground(new Color(204, 255, 255));
		lblMinYBall.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		JLabel lblSpeedIncreaseFactor = new JLabel("SPEED INCREASE FACTOR");
		lblSpeedIncreaseFactor.setForeground(new Color(204, 255, 255));
		lblSpeedIncreaseFactor.setFont(new Font("Monospaced", Font.BOLD, 11));
		
		JLabel lblMinPaddleLength = new JLabel("MIN PADDLE LENGTH");
		lblMinPaddleLength.setForeground(new Color(204, 255, 255));
		lblMinPaddleLength.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		JLabel lblMaxPaddleLength = new JLabel("MAX PADDLE LENGTH");
		lblMaxPaddleLength.setForeground(new Color(204, 255, 255));
		lblMaxPaddleLength.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		/* Save button */
		JLabel savedGameMsg = new JLabel("");
		savedGameMsg.setFont(new Font("Monospaced", Font.PLAIN, 10));
		savedGameMsg.setForeground(new Color(0, 255, 0));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this action should take you to the GamePage
				// These lines assign the values of the game specifications.
				
				String stringNumberOfLevels = numberOfLevelsTxt.getText();
				int numberOfLevels = Integer.parseInt(stringNumberOfLevels);
				
				String stringBlocksPerLevel = blocksPerLevelTxt.getText();
				int blocksPerLevel = Integer.parseInt(stringBlocksPerLevel);
								
				String stringXBallSpeed = xBallSpeedTxt.getText();
				int xBallSpeed = Integer.parseInt(stringXBallSpeed);
				
				String stringYBallSpeed = yBallSpeedTxt.getText();
				int yBallSpeed = Integer.parseInt(stringYBallSpeed);
				
				String stringSpeedIncreaseFactor = speedIncreaseFactorTxt.getText();
				double speedIncreaseFactor = Double.parseDouble(stringSpeedIncreaseFactor);
				
				String stringMinPaddleLength = minPaddleLengthTxt.getText();
				int minPaddleLength = Integer.parseInt(stringMinPaddleLength);
				
				String stringMaxPaddleLength = maxPaddleLengthTxt.getText();
				int maxPaddleLength = Integer.parseInt(stringMaxPaddleLength);
				
				try {
					Block223Controller.setGameDetails( numberOfLevels, blocksPerLevel, xBallSpeed, yBallSpeed, speedIncreaseFactor, maxPaddleLength, minPaddleLength);
					savedGameMsg.setText("Your game settings have been saved, please proceed to build!");
					
				} catch (InvalidInputException e1) {
					lblErrormessage.setText(e1.getMessage());
				}
			
			}
		});
		
		btnSave.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnSave.setBackground(new Color(135, 206, 235));
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				WelcomePage welcomepage= new WelcomePage();	//this is how you launch a different page
				welcomepage.frame.setVisible(true);	
						frame.setVisible(false);
				
			
			}
			
		});

		btnCancel.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnCancel.setBackground(new Color(135, 206, 235));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(230)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(123)
					.addComponent(lblNumberOfLevels)
					.addGap(27)
					.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(115)
					.addComponent(lblblocksPerLevle)
					.addGap(27)
					.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(124)
					.addComponent(lblMinXBall, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(124)
					.addComponent(lblMinYBall, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(119)
					.addComponent(lblSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(124)
					.addComponent(lblMinPaddleLength)
					.addGap(18)
					.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(124)
					.addComponent(lblMaxPaddleLength)
					.addGap(18)
					.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(221)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnBuild))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNumberOfLevels))
						.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblblocksPerLevle))
						.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMinXBall, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMinYBall, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMinPaddleLength, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMaxPaddleLength, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btnCancel))
						.addComponent(btnSave)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btnBuild, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
