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
	public JTextField gameNametextField;

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
		frame.setBounds(100, 100, 704, 562);
		
		/* Build Button */
		JLabel lblErrormessage = new JLabel(" ");
		lblErrormessage.setForeground(new Color(255, 255, 0));
		
		
		int levels = 1;
		try {
			levels = Block223Controller.getCurrentDesignableGame().getNrLevels();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		int blocks = 1;
		try {
			blocks = Block223Controller.getCurrentDesignableGame().getNrBlocksPerLevel();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		int xBallSpeed = 1;
		try {
			xBallSpeed = Block223Controller.getCurrentDesignableGame().getMinBallSpeedX();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		int yBallSpeed = 1;
		try {
			yBallSpeed = Block223Controller.getCurrentDesignableGame().getMinBallSpeedY();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		double speedIncreaseFactor = 1;
		try {
			speedIncreaseFactor = Block223Controller.getCurrentDesignableGame().getBallSpeedIncreaseFactor();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		int minPaddleLength = 10;
		try {
			minPaddleLength = Block223Controller.getCurrentDesignableGame().getMinPaddleLength();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		int maxPaddleLength = 10;
		try {
			maxPaddleLength = Block223Controller.getCurrentDesignableGame().getMaxPaddleLength();
		} catch (InvalidInputException e2) {
			lblErrormessage.setText(e2.getMessage());
		}
		
		numberOfLevelsTxt = new JTextField();
		numberOfLevelsTxt.setForeground(new Color(0, 0, 153));
		/* try {
			numberOfLevelsTxt.setText(""+Block223Controller.getCurrentDesignableGame().getNrLevels());
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		} */
		numberOfLevelsTxt.setText(String.valueOf(levels));
		numberOfLevelsTxt.setColumns(10);
		
		blocksPerLevelTxt = new JTextField();
		blocksPerLevelTxt.setText(String.valueOf(blocks));
		blocksPerLevelTxt.setForeground(new Color(0, 0, 204));
		blocksPerLevelTxt.setColumns(10);
		
		xBallSpeedTxt = new JTextField();
		xBallSpeedTxt.setText(String.valueOf(xBallSpeed));
		xBallSpeedTxt.setForeground(new Color(0, 0, 204));
		xBallSpeedTxt.setColumns(10);
		
		yBallSpeedTxt = new JTextField();
		yBallSpeedTxt.setText(String.valueOf(yBallSpeed));
		yBallSpeedTxt.setForeground(new Color(0, 0, 204));
		yBallSpeedTxt.setColumns(10);
		
		speedIncreaseFactorTxt = new JTextField();
		speedIncreaseFactorTxt.setText(String.valueOf(speedIncreaseFactor));
		speedIncreaseFactorTxt.setForeground(new Color(0, 0, 204));
		speedIncreaseFactorTxt.setColumns(10);
		
		minPaddleLengthTxt = new JTextField();
		minPaddleLengthTxt.setText(String.valueOf(minPaddleLength));
		minPaddleLengthTxt.setForeground(new Color(0, 0, 204));
		minPaddleLengthTxt.setColumns(10);
		
		maxPaddleLengthTxt = new JTextField();
		maxPaddleLengthTxt.setText(String.valueOf(maxPaddleLength));
		maxPaddleLengthTxt.setForeground(new Color(0, 0, 204));
		maxPaddleLengthTxt.setColumns(10);
		
		JButton btnBuild = new JButton("BUILD");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this action should take you to the GamePage
				// These lines assign the values of the game specifications.
				
				String gameName=gameNametextField.getText();
				
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
					Block223Controller.updateGame(gameName, numberOfLevels, blocksPerLevel, xBallSpeed, yBallSpeed, speedIncreaseFactor, maxPaddleLength, minPaddleLength);
<<<<<<< HEAD
					GameLevelPage gamePage = new GameLevelPage(); 	// Launches a new page (of type GameLevel)
					gamePage.frame.setVisible(true);
					frame.setVisible(false);
=======
					GameLevelPage gamePage = new GameLevelPage(0); 	// Launches a new page (of type GameLevel)
					gamePage.frame.setVisible(true);	
>>>>>>> a0455a4216bb695ceb49c44499660ec1717b287e
				} catch (InvalidInputException e1) {
					lblErrormessage.setText(e1.getMessage());
				}
				
				 
			}
		});
		btnBuild.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBuild.setBackground(new Color(135, 206, 235));
		
		
		
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
				
				try
				{
					Block223Controller.saveGame();
				} catch (InvalidInputException e){
					lblErrormessage.setText(e.getMessage());
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
		
		JLabel gameName = new JLabel("GAME NAME");
		gameName.setForeground(new Color(204, 255, 255));
		gameName.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		gameNametextField = new JTextField();
		gameNametextField.setColumns(10);
		

		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(115)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(33)
									.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(btnBuild)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNumberOfLevels)
												.addComponent(lblblocksPerLevle)
												.addComponent(gameName, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
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
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(blocksPerLevelTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(numberOfLevelsTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(xBallSpeedTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(yBallSpeedTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(speedIncreaseFactorTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(minPaddleLengthTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(maxPaddleLengthTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
										.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
										.addComponent(gameNametextField)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(183)
							.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(gameName)
						.addComponent(gameNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
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
					.addGap(24)
					.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(btnCancel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(btnBuild, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}