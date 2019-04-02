package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

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
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class GamePlayPage {

	public JFrame frame;
	JLabel lblErrorMessage;
	int level;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePlayPage window = new GamePlayPage();
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
	public GamePlayPage() {
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
		Font projectfont32 = projectfont.deriveFont(32f);
		
		JDesktopPane layeredPane_1 = new JDesktopPane();
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane_1.setLayer(layeredPane, 50);
		layeredPane.setBounds(0, 0, 624, 485);
		layeredPane_1.add(layeredPane);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setForeground(new Color(204, 255, 255));
		lblErrorMessage.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.MAGENTA);
		panel_20.setBounds(0, 0, 76, 18);
		layeredPane_5.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.YELLOW);
		panel_21.setBounds(76, 0, 76, 18);
		layeredPane_5.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(0, 204, 255));
		panel_22.setBounds(152, 0, 76, 18);
		layeredPane_5.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(51, 255, 0));
		panel_23.setBounds(228, 0, 76, 18);
		layeredPane_5.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(102, 0, 153));
		panel_24.setBounds(304, 0, 76, 18);
		layeredPane_5.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.MAGENTA);
		panel_25.setBounds(380, 0, 76, 18);
		layeredPane_5.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.YELLOW);
		panel_26.setBounds(456, 0, 76, 18);
		layeredPane_5.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(0, 204, 255));
		panel_27.setBounds(532, 0, 76, 18);
		layeredPane_5.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(51, 255, 0));
		panel_28.setBounds(608, 0, 76, 18);
		layeredPane_5.add(panel_28);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(layeredPane_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(layeredPane_6, GroupLayout.PREFERRED_SIZE, 682, GroupLayout.PREFERRED_SIZE)
								.addGap(781))
							.addComponent(layeredPane_5, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(259)
							.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(683)
							.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(layeredPane_4, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(layeredPane_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(100)
							.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(105)
							.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 254, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(layeredPane_6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
								.addComponent(layeredPane_3, 0, 0, Short.MAX_VALUE))
							.addGap(18)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setBounds(0, 0, 776, 54);
		layeredPane_6.add(lblGame);
		try {
			lblGame.setText(Block223Controller.getCurrentDesignableGame().getName());
		} catch (InvalidInputException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lblGame.setFont(projectfont52);
		lblGame.setForeground(new Color(224,255,255));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 76, 18);
		layeredPane_4.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 204, 255));
		panel_1.setBounds(76, 0, 76, 18);
		layeredPane_4.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 255, 0));
		panel_2.setBounds(152, 0, 76, 18);
		layeredPane_4.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 0, 153));
		panel_3.setBounds(228, 0, 76, 18);
		layeredPane_4.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.MAGENTA);
		panel_4.setBounds(304, 0, 76, 18);
		layeredPane_4.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.YELLOW);
		panel_5.setBounds(380, 0, 76, 18);
		layeredPane_4.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 204, 255));
		panel_6.setBounds(456, 0, 76, 18);
		layeredPane_4.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 255, 0));
		panel_7.setBounds(532, 0, 76, 18);
		layeredPane_4.add(panel_7);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(102, 0, 153));
		panel_17.setBounds(608, 0, 76, 18);
		layeredPane_4.add(panel_17);

		
		
		JLabel lblLevel = new JLabel("");
		lblLevel.setForeground(new Color(224, 255, 255));
		lblLevel.setFont(projectfont32);
		lblLevel.setText("LEVEL "+(level));
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay.setFont(projectfont15);
		
		JButton btnPause = new JButton("PAUSE");
		btnPause.setFont(projectfont15);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(projectfont15);
		
		JButton btnQuit = new JButton("QUIT");
		btnQuit.setFont(projectfont15);
		
		JButton btnLogout_1 = new JButton("LOGOUT");
		btnLogout_1.setFont(projectfont15);
		
		JPanel panel_19 = new JPanel();
		
		JLabel lblLives = new JLabel("LIVES");
		lblLives.setFont(projectfont15);
		lblLives.setForeground(new Color(224, 255, 255));
		GroupLayout gl_layeredPane_3 = new GroupLayout(layeredPane_3);
		gl_layeredPane_3.setHorizontalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_3.createSequentialGroup()
							.addGap(72)
							.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
								.addComponent(btnPause, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLogout_1)))
						.addGroup(gl_layeredPane_3.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblLevel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblLives))))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		gl_layeredPane_3.setVerticalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLevel)
					.addGap(18)
					.addComponent(btnPlay)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnPause)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSave)
					.addGap(34)
					.addComponent(btnQuit)
					.addGap(18)
					.addComponent(btnLogout_1)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(lblLives)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		layeredPane_3.setLayout(gl_layeredPane_3);
		//panel_18.setLayout(null);
		
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 750, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}
