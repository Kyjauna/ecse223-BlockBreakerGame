
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
import ca.mcgill.ecse223.block.controller.TOHallOfFame;
import ca.mcgill.ecse223.block.controller.TOHallOfFameEntry;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;

// import java.awt.Choice;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;

public class ViewHallOfFamePage {

	public JFrame frame;
	JLabel lblErrorMessage;
	int level;
	int start=1;
	static int version;
	static String name;
	JLayeredPane layeredPane_3 = new JLayeredPane();
	private JTextField textField;
	JLabel lblQualifyer = new JLabel("");
	JLabel headerlabel=new JLabel("Position		Player		Score");
	Font projectfont=null;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHallOfFamePage window = new ViewHallOfFamePage(version, name);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void makeFont() {
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
		Font projectfont12 = projectfont.deriveFont(12f);
		Font projectfont32 = projectfont.deriveFont(32f);
		Font projectfont22 = projectfont.deriveFont(22f);
	}
	
	
	private void refresh1() {
		//Refresh for entry from PlayerPage/gamePlayPage
		Font projectfont52 = projectfont.deriveFont(52f);
		Font projectfont15 = projectfont.deriveFont(15f);
		Font projectfont12 = projectfont.deriveFont(12f);
		Font projectfont32 = projectfont.deriveFont(32f);
		Font projectfont22 = projectfont.deriveFont(22f);
		
		layeredPane_3.removeAll();
		layeredPane_3.add(headerlabel);

		TOHallOfFame hof;
		lblQualifyer.setText("RANKING");
		try {
			hof = Block223Controller.getHallOfFameWithoutSelecting(name,start, (start+10));
			for(int i=0; i<hof.numberOfEntries(); i++) {
				TOHallOfFameEntry entry = hof.getEntry(i);
				JLabel label=new JLabel(entry.getPosition()+"	"+entry.getPlayername()+"	"+entry.getScore());
				label.setFont(projectfont12);
				label.setForeground(Color.WHITE);
				label.setVisible(true);
				layeredPane_3.add(label);
			}
		} catch (InvalidInputException e) {
			lblErrorMessage.setText(e.getMessage());
		}
		layeredPane_3.repaint();
	}

	private void refresh2(String playername) {
		// refresh for search for player

		Font projectfont12 = projectfont.deriveFont(12f);
	
		layeredPane_3.removeAll();
		layeredPane_3.add(headerlabel);
		headerlabel.setVisible(true);
		headerlabel.setForeground(Color.WHITE);
		headerlabel.setFont(projectfont12);
		lblQualifyer.setText(playername);
		try {
			//List<TOHallOfFameEntry>=new ArrayList<TOHallOfFameEntry>();
			List<TOHallOfFameEntry> hof=Block223Controller.searchHallOfFame(name, playername);
			if (hof!=null&&!hof.isEmpty()) {
				for(TOHallOfFameEntry entry:hof) {
					JLabel label=new JLabel(entry.getPosition()+"	"+entry.getPlayername()+"	"+entry.getScore());
					label.setFont(projectfont12);
					label.setForeground(Color.WHITE);
					label.setVisible(true);
					layeredPane_3.add(label);
				}
			}
			layeredPane_3.repaint();
		}
		catch (InvalidInputException e1) {
			lblErrorMessage.setText(e1.getMessage());
		}
	}

	private void refresh3() {
		// refresh after game over

		Font projectfont12 = projectfont.deriveFont(12f);
		makeFont();
		layeredPane_3.removeAll();
		TOHallOfFame hof;
		layeredPane_3.add(headerlabel);
		lblQualifyer.setText("RANKING");
		try {
			hof = Block223Controller.getHallOfFameWithMostRecentEntryWithoutSelecting(name,10);
			for(int i=0; i<hof.numberOfEntries(); i++) {
				TOHallOfFameEntry entry = hof.getEntry(i);
				JLabel label=new JLabel(entry.getPosition()+"	"+entry.getPlayername()+"	"+entry.getScore());
				label.setFont(projectfont12);
				label.setForeground(Color.WHITE);
				label.setVisible(true);
				layeredPane_3.add(label);
			}
		} catch (InvalidInputException e) {
			lblErrorMessage.setText(e.getMessage());
		}
		layeredPane_3.repaint();
	}

	/**
	 * Create the application.
	 */
	public ViewHallOfFamePage(int version, String name) {
		this.name=name;
		this.version=version;
		initialize();
		if (this.version==1)
			refresh1();
		if (this.version==3)
			refresh3();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		makeFont();
		Font projectfont52 = projectfont.deriveFont(52f);
		Font projectfont15 = projectfont.deriveFont(15f);
		Font projectfont12 = projectfont.deriveFont(12f);
		Font projectfont32 = projectfont.deriveFont(32f);

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));




		/* The comboBox needs to have a list of all the names of the existing games. */

		JLabel lblGame = new JLabel("Game");
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);

		lblGame.setText(name);

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
				refresh1();
			}
		});

		JButton btnPrevious = new JButton("PREVIOUS");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(start!=1)
					start=start-10;
				refresh1();
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
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					String playername=textField.getText();
					refresh2(playername);
				}
			}
		});
		textField.setColumns(10);
		lblQualifyer.setHorizontalAlignment(SwingConstants.CENTER);

		lblQualifyer.setFont(projectfont12);
		lblQualifyer.setForeground(Color.WHITE);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
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
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
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
												.addGroup(groupLayout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(layeredPane_3, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
														.addGap(81))
												.addGroup(groupLayout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblGame, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
														.addGap(19))
												.addGroup(groupLayout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(lblQualifyer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(lblHallOfFame, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(108)))))
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
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(119)
						.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(273, Short.MAX_VALUE))
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
														.addGap(10)
														.addComponent(lblGame)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblHallOfFame)
														.addGap(1)
														.addComponent(lblQualifyer)
														.addPreferredGap(ComponentPlacement.RELATED)
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
						.addComponent(lblErrorMessage, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addGap(16))
				);
		layeredPane_3.setLayout(new GridLayout(0, 1, 0, 0));
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(200, 200, 784, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}
}

