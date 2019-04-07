
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ViewHallOfFamePage {

	public JFrame frame;
	JLabel lblErrorMessage;
	int level;
	int start=1;
	static int version;
	
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	JLabel label_9;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHallOfFamePage window = new ViewHallOfFamePage(version);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	private void refresh() {
		label.setText(""+start+".");
		label_1.setText(""+(start+1)+".");
		label_2.setText(""+(start+2)+".");
		label_3.setText(""+(start+3)+".");
		label_4.setText(""+(start+4)+".");
		label_5.setText(""+(start+5)+".");
		label_6.setText(""+(start+6)+".");
		label_7.setText(""+(start+7)+".");
		label_8.setText(""+(start+8)+".");
		label_9.setText(""+(start+9)+".");
	
	}
	
	private void refresh1() {
		//Refresh for entry from PlayerPage/gamePlayPage
		
	}
	
	private void refresh2() {
		// refresh for search for player
		
	}
	
	private void refresh3() {
		// refresh after game over
		
	}
		
	/**
	 * Create the application.
	 */
	public ViewHallOfFamePage(int version) {
		this.version=version;
		initialize();
		if (this.version==1)
			refresh1();
		if (this.version==2)
			refresh2();
		if (this.version==3)
			refresh3();
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
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			lblGame.setText(Block223Controller.getCurrentPlayableGame().getGamename());
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
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		JLabel lblHallOfFame = new JLabel("HALL OF FAME");
		lblHallOfFame.setForeground(Color.CYAN);
		lblHallOfFame.setFont(projectfont32);
		
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
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setFont(projectfont15);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			start=start+10;
			refresh();
			}
		});
		
		JButton btnPrevious = new JButton("PREVIOUS");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(start!=1)
				start=start-10;
			refresh();
			}
		});
		btnPrevious.setFont(projectfont15);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					PlayerPage pplayer = new PlayerPage();
					pplayer.frame.setVisible(true);
					frame.setVisible(false);
				
				}
		});
		btnExit.setFont(projectfont15);
		
		JLabel lblSearchPlayerName = new JLabel("Search Player Name:");
		lblSearchPlayerName.setForeground(Color.CYAN);
		
		//fix
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String playername=textField.getText();
					try {
					Block223Controller.searchHallOfFame(playername);
					refresh1();
					}
					catch (InvalidInputException e1) {
						lblErrorMessage.setText(e1.getMessage());
					}
			}
		});
		textField.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
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
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
													.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
												.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addGap(70)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblSearchPlayerName)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(btnPrevious)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(btnExit)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
											.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(layeredPane_3, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
											.addGap(81))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblHallOfFame)
											.addGap(101))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblGame, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
											.addGap(9)))))
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
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addGap(164))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
							.addGap(120))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
												.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
										.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(298)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSearchPlayerName)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnExit)
										.addComponent(btnPrevious)
										.addComponent(btnNewButton)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(lblGame)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblHallOfFame)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(layeredPane_3, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))))))
					.addGap(18)
					.addComponent(lblErrorMessage, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
					.addGap(16))
		);
		
		label = new JLabel(""+start+".");
		label.setForeground(new Color(240, 255, 255));
		label.setBounds(6, 6, 176, 16);
		layeredPane_3.add(label);
		
		label_1 = new JLabel(""+(start+1)+".");
		label_1.setForeground(new Color(240, 248, 255));
		label_1.setBounds(6, 34, 176, 16);
		layeredPane_3.add(label_1);
		
		label_2 = new JLabel(""+(start+2)+".");
		label_2.setForeground(new Color(240, 248, 255));
		label_2.setBounds(6, 62, 176, 16);
		layeredPane_3.add(label_2);
		
		label_3 = new JLabel(""+(start+3)+".");
		label_3.setForeground(new Color(240, 248, 255));
		label_3.setBounds(6, 93, 176, 16);
		layeredPane_3.add(label_3);
		
		label_4 = new JLabel(""+(start+4)+".");
		label_4.setForeground(new Color(240, 248, 255));
		label_4.setBounds(6, 121, 176, 16);
		layeredPane_3.add(label_4);
		
		label_5 = new JLabel(""+(start+5)+".");
		label_5.setForeground(new Color(240, 248, 255));
		label_5.setBounds(6, 149, 176, 16);
		layeredPane_3.add(label_5);
		
		label_6 = new JLabel(""+(start+6)+".");
		label_6.setForeground(new Color(240, 248, 255));
		label_6.setBounds(6, 177, 176, 16);
		layeredPane_3.add(label_6);
		
		label_7 = new JLabel(""+(start+7)+".");
		label_7.setForeground(new Color(240, 248, 255));
		label_7.setBounds(6, 205, 176, 16);
		layeredPane_3.add(label_7);
		
		label_8 = new JLabel(""+(start+8)+".");
		label_8.setForeground(new Color(240, 248, 255));
		label_8.setBounds(6, 233, 176, 16);
		layeredPane_3.add(label_8);
		
		label_9 = new JLabel(""+(start+9)+".");
		label_9.setForeground(new Color(240, 248, 255));
		label_9.setBounds(6, 261, 176, 16);
		layeredPane_3.add(label_9);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(200, 200, 784, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}

