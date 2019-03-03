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

public class UpdateGamePage {

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
					UpdateGamePage window = new UpdateGamePage();	
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
	public UpdateGamePage() {
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
					Block223Controller.setGameDetails(numberOfLevels, blocksPerLevel, xBallSpeed, yBallSpeed, speedIncreaseFactor, maxPaddleLength, minPaddleLength);
					GameLevelPage gamePage = new GameLevelPage(); 	// Launches a new page (of type GameLevel)
					gamePage.frame.setVisible(true);				// this is the frame from GameLevelPage, so their classes need to be public
				
				} catch (InvalidInputException e1) {
					e1.printStackTrace();
				}
				 
			}
		});
		btnBuild.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBuild.setBackground(new Color(135, 206, 235));
		
		numberOfLevelsTxt = new JTextField();
		numberOfLevelsTxt.setForeground(new Color(169, 169, 169));
		/* try {
			numberOfLevelsTxt.setText(""+Block223Controller.getCurrentDesignableGame().getNrLevels());
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		} */
		numberOfLevelsTxt.setColumns(10);
		
		blocksPerLevelTxt = new JTextField();
		blocksPerLevelTxt.setText("28");
		blocksPerLevelTxt.setForeground(new Color(169, 169, 169));
		blocksPerLevelTxt.setColumns(10);
		
		xBallSpeedTxt = new JTextField();
		xBallSpeedTxt.setText("5");
		xBallSpeedTxt.setForeground(new Color(169, 169, 169));
		xBallSpeedTxt.setColumns(10);
		
		yBallSpeedTxt = new JTextField();
		yBallSpeedTxt.setText("5");
		yBallSpeedTxt.setForeground(new Color(169, 169, 169));
		yBallSpeedTxt.setColumns(10);
		
		speedIncreaseFactorTxt = new JTextField();
		speedIncreaseFactorTxt.setText("1.5");
		speedIncreaseFactorTxt.setForeground(new Color(169, 169, 169));
		speedIncreaseFactorTxt.setColumns(10);
		
		minPaddleLengthTxt = new JTextField();
		minPaddleLengthTxt.setText("2");
		minPaddleLengthTxt.setForeground(new Color(169, 169, 169));
		minPaddleLengthTxt.setColumns(10);
		
		maxPaddleLengthTxt = new JTextField();
		maxPaddleLengthTxt.setText("10");
		maxPaddleLengthTxt.setForeground(new Color(169, 169, 169));
		maxPaddleLengthTxt.setColumns(10);
		
		JLabel lblCreateNewGame = new JLabel("UPDATE GAME");
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
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Save the game settings
				
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
					Block223Controller.setGameDetails(numberOfLevels, blocksPerLevel, xBallSpeed, yBallSpeed, speedIncreaseFactor, maxPaddleLength, minPaddleLength);
				} catch (InvalidInputException e1) {
					e1.printStackTrace();
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
					.addGap(115)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnBuild))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNumberOfLevels)
										.addComponent(lblblocksPerLevle))
									.addGap(27))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMinXBall, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMinYBall, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMaxPaddleLength, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMinPaddleLength, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))))
					.addGap(181))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumberOfLevels))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblblocksPerLevle))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMinXBall, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMinYBall, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMinPaddleLength, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaxPaddleLength, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuild)
						.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancel))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}