package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

public class PopUpWindowUpdate {

	public JFrame frame;
	public int blockId;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void PopUpWindowUpdate(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUpWindowUpdate window = new PopUpWindowUpdate(0);
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
	public PopUpWindowUpdate(int blockId) {
		this.blockId = blockId;
		initialize();
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

		Font projectfont15 = projectfont.deriveFont(15f);
		Font projectfont24 = projectfont.deriveFont(24f);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 247, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setVisible(false);
		lblErrormessage.setFont(new Font("Monospaced", Font.PLAIN, 10));
		lblErrormessage.setVisible(false);
		
		JLabel label = new JLabel("RED");
		label.setForeground(Color.RED);
		label.setFont(projectfont15);
		
		JLabel label_2 = new JLabel("POINTS");
		label_2.setForeground(new Color(0, 0, 51));
		label_2.setFont(projectfont15);
		
		JLabel label_3 = new JLabel("BLUE");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(projectfont15);
		
		JLabel label_4 = new JLabel("GREEN");
		label_4.setForeground(Color.GREEN);
		label_4.setFont(projectfont15);
		
		try {
		textField = new JTextField(""+Block223Controller.getBlockOfCurrentDesignableGame(blockId).getBlue());
		textField_1 = new JTextField(""+Block223Controller.getBlockOfCurrentDesignableGame(blockId).getPoints());
		textField_2 = new JTextField(""+Block223Controller.getBlockOfCurrentDesignableGame(blockId).getGreen());
		textField_3 = new JTextField(""+Block223Controller.getBlockOfCurrentDesignableGame(blockId).getRed());
		}
		catch(InvalidInputException a){
			lblErrormessage.setText(a.getMessage());
			lblErrormessage.setVisible(true);	
		}
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		
		
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		
		
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		
		
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String red =textField_3.getText();
				Integer red1 = Integer.parseInt(red);
				
				String blue =textField.getText();
				Integer blue1 = Integer.parseInt(blue);
				
				String green =textField_2.getText();
				Integer green1 = Integer.parseInt(green);
				
				String points =textField_1.getText();
				Integer points1 = Integer.parseInt(points);
				
				try {
					Block223Controller.updateBlock(blockId, red1, green1, blue1, points1);
					frame.setVisible(false);
				} catch (InvalidInputException e) {
					lblErrormessage.setText(e.getMessage());
					lblErrormessage.setVisible(true);
				}
				
			}
		});
		btnUpdate.setFont(projectfont15);
		
		JLabel lblUpdateBlock = new JLabel("UPDATE BLOCK");
		lblUpdateBlock.setForeground(new Color(0, 0, 51));
		lblUpdateBlock.setFont(projectfont24);
		lblUpdateBlock.setBackground(new Color(224, 255, 255));
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblUpdateBlock, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addGap(26)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(btnUpdate)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUpdateBlock, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdate)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
