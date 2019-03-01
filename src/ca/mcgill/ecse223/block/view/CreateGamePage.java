package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
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
import java.awt.TextField;

public class CreateGamePage {

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
					CreateGamePage window = new CreateGamePage();
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
	public CreateGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(75, 0, 130));
		
		JButton btnNewButton = new JButton("NUMBER OF LEVELS");
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnHeightPlayArea = new JButton("#BLOCKS per level");
		btnHeightPlayArea.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnHeightPlayArea.setBackground(new Color(230, 230, 250));
		btnHeightPlayArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnMinXBall = new JButton("MIN X BALL SPEED");
		btnMinXBall.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnMinXBall.setBackground(new Color(230, 230, 250));
		btnMinXBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnMinYBall = new JButton("MIN Y BALL SPEED");
		btnMinYBall.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnMinYBall.setBackground(new Color(230, 230, 250));
		
		JButton btnSpeedIncreaseFactor = new JButton("SPEED INCREASE FACTOR");
		btnSpeedIncreaseFactor.setBackground(new Color(230, 230, 250));
		btnSpeedIncreaseFactor.setFont(new Font("Monospaced", Font.PLAIN, 9));
		
		JButton btnMinPaddleLength = new JButton("MIN PADDLE LENGTH");
		btnMinPaddleLength.setBackground(new Color(230, 230, 250));
		btnMinPaddleLength.setFont(new Font("Monospaced", Font.PLAIN, 10));
		btnMinPaddleLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnMaxPaddleLength = new JButton("MAX PADDLE LENGTH");
		btnMaxPaddleLength.setBackground(new Color(230, 230, 250));
		btnMaxPaddleLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMaxPaddleLength.setFont(new Font("Monospaced", Font.PLAIN, 10));
		
		JButton btnBuild = new JButton("BUILD");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this action should take you to the GamePage
				
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
		btnBuild.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBuild.setBackground(new Color(135, 206, 235));
		
		numberOfLevelsTxt = new JTextField();
		numberOfLevelsTxt.setForeground(new Color(169, 169, 169));
		numberOfLevelsTxt.setText("45");
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
		minPaddleLengthTxt.setText("10");
		minPaddleLengthTxt.setForeground(new Color(169, 169, 169));
		minPaddleLengthTxt.setColumns(10);
		
		maxPaddleLengthTxt = new JTextField();
		maxPaddleLengthTxt.setText("2");
		maxPaddleLengthTxt.setForeground(new Color(169, 169, 169));
		maxPaddleLengthTxt.setColumns(10);
		
		JLabel lblCreateNewGame = new JLabel("CREATE NEW GAME");
		lblCreateNewGame.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblCreateNewGame.setForeground(new Color(64, 224, 208));
		lblCreateNewGame.setBackground(new Color(175, 238, 238));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(261, Short.MAX_VALUE)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addGap(234))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnMaxPaddleLength, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnMinPaddleLength, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnSpeedIncreaseFactor, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnMinYBall, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnMinXBall, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnHeightPlayArea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
						.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
					.addGap(181))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(324)
					.addComponent(btnBuild)
					.addContainerGap(325, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblCreateNewGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(numberOfLevelsTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHeightPlayArea)
						.addComponent(blocksPerLevelTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(xBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMinXBall))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMinYBall)
						.addComponent(yBallSpeedTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(speedIncreaseFactorTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMinPaddleLength)
						.addComponent(minPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMaxPaddleLength, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(maxPaddleLengthTxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addComponent(btnBuild)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
