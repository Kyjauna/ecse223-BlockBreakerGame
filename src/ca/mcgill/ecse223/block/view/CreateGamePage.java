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
import java.awt.Font;

public class CreateGamePage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		JButton btnNewButton = new JButton("#BLOCKS per level");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnHeightPlayArea = new JButton("HEIGHT PLAY AREA");
		btnHeightPlayArea.setBackground(new Color(230, 230, 250));
		btnHeightPlayArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnWidthPlayArea = new JButton("WIDTH PLAY AREA");
		btnWidthPlayArea.setBackground(new Color(230, 230, 250));
		
		JButton btnMinXBall = new JButton("MIN X BALL SPEED");
		btnMinXBall.setBackground(new Color(230, 230, 250));
		btnMinXBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnMinYBall = new JButton("MIN Y BALL SPEED");
		btnMinYBall.setBackground(new Color(230, 230, 250));
		
		JButton btnSpeedIncreaseFactor = new JButton("SPEED INCREASE FACTOR");
		btnSpeedIncreaseFactor.setBackground(new Color(230, 230, 250));
		btnSpeedIncreaseFactor.setFont(new Font("Tahoma", Font.PLAIN, 7));
		
		JButton btnMinPaddleLength = new JButton("MIN PADDLE LENGTH");
		btnMinPaddleLength.setBackground(new Color(230, 230, 250));
		btnMinPaddleLength.setFont(new Font("Tahoma", Font.PLAIN, 9));
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
		btnMaxPaddleLength.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		JButton btnBuild = new JButton("BUILD");
		btnBuild.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuild.setBackground(new Color(135, 206, 235));
		
		textField = new JTextField();
		textField.setForeground(new Color(169, 169, 169));
		textField.setText("28");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("200");
		textField_1.setForeground(new Color(169, 169, 169));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("200");
		textField_2.setForeground(new Color(169, 169, 169));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("5");
		textField_3.setForeground(new Color(169, 169, 169));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("5");
		textField_4.setForeground(new Color(169, 169, 169));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("1.5");
		textField_5.setForeground(new Color(169, 169, 169));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText("10");
		textField_6.setForeground(new Color(169, 169, 169));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("2");
		textField_7.setForeground(new Color(169, 169, 169));
		textField_7.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMinYBall, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMinXBall, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnWidthPlayArea, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnHeightPlayArea, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnSpeedIncreaseFactor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnMaxPaddleLength, 0, 0, Short.MAX_VALUE)
								.addComponent(btnMinPaddleLength, GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(209, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(330, Short.MAX_VALUE)
					.addComponent(btnBuild)
					.addGap(325))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(101)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHeightPlayArea)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnWidthPlayArea)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMinXBall)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMinYBall)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSpeedIncreaseFactor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMinPaddleLength)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMaxPaddleLength, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnBuild)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
