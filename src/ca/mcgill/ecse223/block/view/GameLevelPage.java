package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameLevelPage {

	public JFrame frame;
	public JTextField RedValue;
	public JTextField textField;
	public JTextField GreenValue;
	public JTextField BlueValue;
	int level=1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameLevelPage window = new GameLevelPage();
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
	public GameLevelPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
		JLabel lblLevel = new JLabel("LEVEL "+level);
		JLabel lblName = new JLabel("GAME NAME");
		lblLevel.setForeground(new Color(224, 255, 255));
		lblLevel.setFont(new Font("Monospaced", Font.BOLD, 26));
		
		JLabel lblAddBlocks = new JLabel("ADD BLOCKS");
		lblAddBlocks.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblAddBlocks.setForeground(new Color(224, 255, 255));
		lblAddBlocks.setBackground(new Color(224, 255, 255));
		
		JLabel lblRed = new JLabel("RED");
		lblRed.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblRed.setForeground(new Color(224,255,255));
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		
		JPanel panel_7 = new JPanel();
		
		JPanel panel_9 = new JPanel();
		
		JPanel panel_10 = new JPanel();
		
		JPanel panel_11 = new JPanel();
		
		JPanel panel_12 = new JPanel();
		
		JPanel panel_13 = new JPanel();
		
		JPanel panel_14 = new JPanel();
		
		JPanel panel_15 = new JPanel();
		
		JPanel panel_16 = new JPanel();
		
		JPanel panel_17 = new JPanel();
		
		JPanel panel_18 = new JPanel();
		
		JPanel panel_19 = new JPanel();
		
		JPanel panel_20 = new JPanel();
		
		JPanel panel_21 = new JPanel();
		
		JPanel panel_22 = new JPanel();
		
		JPanel panel_23 = new JPanel();
		
		JPanel panel_24 = new JPanel();
		
		JPanel panel_25 = new JPanel();
		
		JPanel panel_26 = new JPanel();
		
		JPanel panel_27 = new JPanel();
		
		JPanel panel_28 = new JPanel();
		
		JPanel panel_29 = new JPanel();
		
		JPanel panel_30 = new JPanel();
		
		JPanel panel_31 = new JPanel();
		
		JPanel panel_32 = new JPanel();
		
		JPanel panel_33 = new JPanel();
		
		JPanel panel_34 = new JPanel();
		
		JPanel panel_35 = new JPanel();
		
		JPanel panel_36 = new JPanel();
		
		JPanel panel_37 = new JPanel();
		
		JPanel panel_38 = new JPanel();
		
		JPanel panel_39 = new JPanel();
		
		JPanel panel_40 = new JPanel();
		
		JPanel panel_41 = new JPanel();
		
		JPanel panel_42 = new JPanel();
		
		JPanel panel_43 = new JPanel();
		
		JPanel panel_44 = new JPanel();
		
		JPanel panel_45 = new JPanel();
		
		JPanel panel_46 = new JPanel();
		
		JPanel panel_47 = new JPanel();
		
		JPanel panel_48 = new JPanel();
		
		JPanel panel_49 = new JPanel();
		
		JPanel panel_50 = new JPanel();
		
		JPanel panel_51 = new JPanel();
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(Color.WHITE);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(Color.WHITE);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(Color.WHITE);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.WHITE);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.WHITE);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.WHITE);
		
		JPanel panel_60 = new JPanel();
		
		JPanel panel_66 = new JPanel();
		panel_66.setBackground(Color.WHITE);
		
		JPanel panel_67 = new JPanel();
		panel_67.setBackground(Color.WHITE);
		
		JPanel panel_68 = new JPanel();
		panel_68.setBackground(Color.WHITE);
		
		JPanel panel_69 = new JPanel();
		panel_69.setBackground(Color.WHITE);
		
		JPanel panel_80 = new JPanel();
		panel_80.setBackground(Color.WHITE);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBackground(Color.WHITE);
		
		JPanel panel_83 = new JPanel();
		panel_83.setBackground(Color.WHITE);
		
		JPanel panel_84 = new JPanel();
		panel_84.setBackground(Color.WHITE);
		
		JPanel panel_85 = new JPanel();
		panel_85.setBackground(Color.WHITE);
		
		JPanel panel_88 = new JPanel();
		
		JPanel panel_89 = new JPanel();
		panel_89.setBackground(Color.WHITE);
		
		JPanel panel_90 = new JPanel();
		panel_90.setBackground(Color.WHITE);
		
		JPanel panel_91 = new JPanel();
		panel_91.setBackground(Color.WHITE);
		
		JPanel panel_92 = new JPanel();
		panel_92.setBackground(Color.WHITE);
		
		JPanel panel_95 = new JPanel();
		
		JPanel panel_96 = new JPanel();
		panel_96.setBackground(Color.WHITE);
		
		JPanel panel_97 = new JPanel();
		panel_97.setBackground(Color.WHITE);
		
		JPanel panel_98 = new JPanel();
		panel_98.setBackground(Color.WHITE);
		
		JPanel panel_99 = new JPanel();
		panel_99.setBackground(Color.WHITE);
		
		JPanel panel_100 = new JPanel();
		panel_100.setBackground(Color.WHITE);
		
		JPanel panel_105 = new JPanel();
		panel_105.setBackground(Color.WHITE);
		
		JPanel panel_106 = new JPanel();
		panel_106.setBackground(Color.WHITE);
		
		JPanel panel_107 = new JPanel();
		panel_107.setBackground(Color.WHITE);
		
		JPanel panel_108 = new JPanel();
		panel_108.setBackground(Color.WHITE);
		
		JPanel panel_109 = new JPanel();
		panel_109.setBackground(Color.WHITE);
		
		JPanel panel_110 = new JPanel();
		panel_110.setBackground(Color.WHITE);
		
		JPanel panel_115 = new JPanel();
		panel_115.setBackground(Color.WHITE);
		
		JPanel panel_116 = new JPanel();
		panel_116.setBackground(Color.WHITE);
		
		JPanel panel_117 = new JPanel();
		panel_117.setBackground(Color.WHITE);
		
		JPanel panel_118 = new JPanel();
		panel_118.setBackground(Color.WHITE);
		
		JPanel panel_119 = new JPanel();
		panel_119.setBackground(Color.WHITE);
		
		JPanel panel_120 = new JPanel();
		panel_120.setBackground(Color.WHITE);
		
		JPanel panel_124 = new JPanel();
		panel_124.setBackground(Color.WHITE);
		
		JPanel panel_125 = new JPanel();
		panel_125.setBackground(Color.WHITE);
		
		JPanel panel_126 = new JPanel();
		panel_126.setBackground(Color.WHITE);
		
		JPanel panel_127 = new JPanel();
		panel_127.setBackground(Color.WHITE);
		
		JPanel panel_128 = new JPanel();
		panel_128.setBackground(Color.WHITE);
		
		JPanel panel_133 = new JPanel();
		panel_133.setBackground(Color.WHITE);
		
		JPanel panel_134 = new JPanel();
		panel_134.setBackground(Color.WHITE);
		
		JPanel panel_135 = new JPanel();
		panel_135.setBackground(Color.WHITE);
		
		JPanel panel_136 = new JPanel();
		panel_136.setBackground(Color.WHITE);
		
		JPanel panel_143 = new JPanel();
		panel_143.setBackground(Color.WHITE);
		
		JPanel panel_144 = new JPanel();
		panel_144.setBackground(Color.WHITE);
		
		JPanel panel_145 = new JPanel();
		panel_145.setBackground(Color.WHITE);
		
		JPanel panel_146 = new JPanel();
		panel_146.setBackground(Color.WHITE);
		
		JPanel panel_147 = new JPanel();
		panel_147.setBackground(Color.WHITE);
		
		JPanel panel_148 = new JPanel();
		panel_148.setBackground(Color.WHITE);
		
		JPanel panel_151 = new JPanel();
		
		JPanel panel_152 = new JPanel();
		
		JPanel panel_168 = new JPanel();
		panel_168.setBackground(Color.WHITE);
		
		JPanel panel_169 = new JPanel();
		panel_169.setBackground(Color.WHITE);
		
		JPanel panel_172 = new JPanel();
		panel_172.setBackground(Color.WHITE);
		
		JPanel panel_173 = new JPanel();
		panel_173.setBackground(Color.WHITE);
		
		JPanel panel_174 = new JPanel();
		panel_174.setBackground(Color.WHITE);
		
		JPanel panel_175 = new JPanel();
		panel_175.setBackground(Color.WHITE);
		
		JPanel panel_176 = new JPanel();
		panel_176.setBackground(Color.WHITE);
		
		JPanel panel_177 = new JPanel();
		panel_177.setBackground(Color.WHITE);
		
		JPanel panel_178 = new JPanel();
		panel_178.setBackground(Color.WHITE);
		
		JPanel panel_180 = new JPanel();
		
		JPanel panel_182 = new JPanel();
		
		JPanel panel_185 = new JPanel();
		
		JPanel panel_196 = new JPanel();
		panel_196.setBackground(Color.WHITE);
		
		JPanel panel_197 = new JPanel();
		panel_197.setBackground(Color.WHITE);
		
		JPanel panel_198 = new JPanel();
		panel_198.setBackground(Color.WHITE);
		
		JPanel panel_199 = new JPanel();
		panel_199.setBackground(Color.WHITE);
		
		JPanel panel_200 = new JPanel();
		panel_200.setBackground(Color.WHITE);
		
		JPanel panel_201 = new JPanel();
		panel_201.setBackground(Color.WHITE);
		
		JPanel panel_202 = new JPanel();
		panel_202.setBackground(Color.WHITE);
		
		JPanel panel_203 = new JPanel();
		panel_203.setBackground(Color.WHITE);
		
		JPanel panel_204 = new JPanel();
		panel_204.setBackground(Color.WHITE);
		
		JPanel panel_205 = new JPanel();
		panel_205.setBackground(Color.WHITE);
		
		JPanel panel_206 = new JPanel();
		panel_206.setBackground(Color.WHITE);
		
		JPanel panel_207 = new JPanel();
		panel_207.setBackground(Color.WHITE);
		
		JPanel panel_208 = new JPanel();
		panel_208.setBackground(Color.WHITE);
		
		JPanel panel_209 = new JPanel();
		panel_209.setBackground(Color.WHITE);
		
		JPanel panel_210 = new JPanel();
		panel_210.setBackground(Color.WHITE);
		
		JPanel panel_211 = new JPanel();
		panel_211.setBackground(Color.WHITE);
		
		JPanel panel_214 = new JPanel();
		
		JPanel panel_215 = new JPanel();
		panel_215.setBackground(Color.WHITE);
		
		JPanel panel_216 = new JPanel();
		panel_216.setBackground(Color.WHITE);
		
		JPanel panel_217 = new JPanel();
		panel_217.setBackground(Color.WHITE);
		
		JPanel panel_218 = new JPanel();
		panel_218.setBackground(Color.WHITE);
		
		JPanel panel_219 = new JPanel();
		panel_219.setBackground(Color.WHITE);
		
		JPanel panel_224 = new JPanel();
		
		JPanel panel_225 = new JPanel();
		
		JPanel panel_226 = new JPanel();
		panel_226.setBackground(Color.WHITE);
		
		JPanel panel_227 = new JPanel();
		panel_227.setBackground(Color.WHITE);
		
		JPanel panel_228 = new JPanel();
		panel_228.setBackground(Color.WHITE);
		
		JPanel panel_229 = new JPanel();
		panel_229.setBackground(Color.WHITE);
		
		JPanel panel_230 = new JPanel();
		panel_230.setBackground(Color.WHITE);
		
		JPanel panel_231 = new JPanel();
		panel_231.setBackground(Color.WHITE);
		
		JPanel panel_232 = new JPanel();
		panel_232.setBackground(Color.WHITE);
		
		JPanel panel_233 = new JPanel();
		panel_233.setBackground(Color.WHITE);
		
		JPanel panel_234 = new JPanel();
		panel_234.setBackground(Color.WHITE);
		
		JPanel panel_235 = new JPanel();
		panel_235.setBackground(Color.WHITE);
		
		JPanel panel_236 = new JPanel();
		panel_236.setBackground(Color.WHITE);
		
		JPanel panel_237 = new JPanel();
		panel_237.setBackground(Color.WHITE);
		
		JPanel panel_238 = new JPanel();
		panel_238.setBackground(Color.WHITE);
		
		JPanel panel_239 = new JPanel();
		panel_239.setBackground(Color.WHITE);
		
		JPanel panel_240 = new JPanel();
		panel_240.setBackground(Color.WHITE);
		
		JPanel panel_251 = new JPanel();
		
		JPanel panel_252 = new JPanel();
		
		JPanel panel_253 = new JPanel();
		
		JPanel panel_254 = new JPanel();
		
		JPanel panel_255 = new JPanel();
		

		RedValue = new JTextField();
		RedValue.setForeground(new Color(169, 169, 169));
		RedValue.setText("#33FF33");
		RedValue.setColumns(10);

		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Monospaced", Font.BOLD, 14));
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setFont(new Font("Monospaced", Font.BOLD, 14));
		
		JLabel lblMyBlocks = new JLabel("MY BLOCKS:");
		lblMyBlocks.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblMyBlocks.setForeground(new Color(204, 255, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Monospaced", Font.BOLD, 14));
		
		JButton btnNextLevel = new JButton("NEXT LEVEL");
		btnNextLevel.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		JButton btnPreviousLevel = new JButton("PREVIOUS LEVEL");
		btnPreviousLevel.setFont(new Font("Monospaced", Font.BOLD, 10));
		
		JLabel label = new JLabel("M");
		label.setForeground(new Color(30, 144, 255));
		label.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel label_1 = new JLabel("O");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel label_2 = new JLabel("D");
		label_2.setForeground(Color.GREEN);
		label_2.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel label_3 = new JLabel("N");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel lblPoints = new JLabel("POINTS");
		lblPoints.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblPoints.setForeground(new Color(224, 255, 255));
		
		btnNextLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		GreenValue = new JTextField();
		GreenValue.setText("#33FF33");
		GreenValue.setForeground(new Color(169, 169, 169));
		GreenValue.setColumns(10);

		
		BlueValue = new JTextField();
		BlueValue.setText("#33FF33");
		BlueValue.setForeground(new Color(169, 169, 169));
		BlueValue.setColumns(10);
		
		JLabel lblGreen = new JLabel("GREEN");
		lblGreen.setForeground(new Color(102, 153, 255));
		lblGreen.setFont(new Font("Monospaced", Font.BOLD, 15));
		
		btnPreviousLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblGameBlocks = new JLabel("GAME BLOCKS");
		lblGameBlocks.setForeground(new Color(0, 255, 204));
		
		JButton btnDefineGameSettings = new JButton("DEFINE GAME SETTINGS");
		btnDefineGameSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JLabel label_4 = new JLabel("A");
		label_4.setForeground(new Color(30, 144, 255));
		label_4.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel label_5 = new JLabel("R");
		label_5.setForeground(Color.MAGENTA);
		label_5.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		lblRed.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblRed.setForeground(new Color(204, 255, 255));
		
		
		JLabel lblBlue = new JLabel("BLUE:");
		lblBlue.setForeground(new Color(204, 255, 255));
		lblBlue.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setText("#33FF33");
		textField.setForeground(new Color(169, 169, 169));
		textField.setFont(new Font("Monospaced", Font.PLAIN, 11));
		textField.setColumns(10);
		

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_57, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_85, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_92, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_100, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_110, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_120, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_148, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_178, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_211, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_218, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_219, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_236, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_237, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_238, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_239, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_240, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(278))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_56, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_84, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_91, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_99, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_109, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_119, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_128, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_147, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_177, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_215, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_217, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_231, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_232, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_233, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_234, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_235, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGap(278))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_55, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_69, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_90, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_98, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_108, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_118, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_127, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_136, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_146, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_176, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_216, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_226, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_227, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_228, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_229, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_230, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_107, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_117, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_126, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_135, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_145, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_172, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_175, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_210, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_207, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_208, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_209, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_206, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_88, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_95, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_151, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_152, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_180, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_182, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_185, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_214, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_224, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_225, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_251, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_252, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_253, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_254, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_255, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_65, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_78, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_82, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_104, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_114, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_123, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_132, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_142, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_163, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_164, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_171, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_193, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_194, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_195, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_192, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(278))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_107, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_117, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_126, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_135, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_145, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_172, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_175, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_210, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_207, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_208, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_209, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_206, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(panel_53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_81, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_96, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_106, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_116, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_125, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_134, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_144, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_169, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_174, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_205, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_202, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_203, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_204, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(panel_201, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblLevel)
												.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblGameBlocks)
														.addGroup(groupLayout.createSequentialGroup()
															.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_83, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_105, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_115, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_124, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_133, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_143, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_168, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_173, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_200, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_197, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_198, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_199, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(53)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(3)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout.createSequentialGroup()
																	.addPreferredGap(ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
																	.addComponent(lblR)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(lblA)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(lblN)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(lblD)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(lblO)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(lblM)
																	.addGap(53))
																.addGroup(groupLayout.createSequentialGroup()
																	.addGap(6)
																	.addComponent(panel_196, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
																	.addGap(620))))
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(31)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(btnPreviousLevel)
																.addComponent(btnNextLevel)
																.addComponent(btnSave)
																.addComponent(btnFinish)
																.addComponent(btnDefineGameSettings))
															.addGap(529))))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(52)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblRed)
																.addComponent(lblPoints)
																.addGroup(groupLayout.createSequentialGroup()
																	.addComponent(lblBlue)
																	.addPreferredGap(ComponentPlacement.RELATED))
																.addComponent(lblGreen))
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout.createSequentialGroup()
																	.addGap(3)
																	.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(lblAddBlocks)
																		.addPreferredGap(ComponentPlacement.RELATED, 27, GroupLayout.PREFERRED_SIZE)))
																.addGroup(groupLayout.createSequentialGroup()
																	.addGap(31)
																	.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																		.addComponent(BlueValue, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																		.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(GreenValue, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																		.addComponent(RedValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(115)
															.addComponent(btnAdd)
															.addPreferredGap(ComponentPlacement.RELATED, 40, GroupLayout.PREFERRED_SIZE)))
													.addContainerGap())))))))))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_42, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_44, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_46, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblLevel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
											.addComponent(lblMyBlocks))
										.addGap(71)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(28)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addGroup(groupLayout.createSequentialGroup()
																.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																	.addComponent(lblRed)
																	.addGroup(groupLayout.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(lblBlue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
																.addGap(10))
															.addGroup(groupLayout.createSequentialGroup()
																.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)))
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addGroup(groupLayout.createSequentialGroup()
																.addComponent(txtff, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
																.addGap(8))
															.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
																.addComponent(textField, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(btnPreviousLevel, 0, 0, Short.MAX_VALUE)
														.addComponent(btnNextLevel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnFinish, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(27)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout.createSequentialGroup()
																	.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(label, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
																.addComponent(btnAdd)))))
												.addGap(53))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblAddBlocks)
												.addGap(71))))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_83, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_105, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_115, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_124, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_133, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_143, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_168, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_173, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_200, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_197, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_198, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_199, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_196, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_81, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_96, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_106, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_116, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_125, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_134, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_144, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_169, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_174, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_205, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_202, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_203, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_204, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(panel_201, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_61, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_62, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_70, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_73, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_74, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_76, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_129, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_137, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_140, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_155, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_156, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_157, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_158, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_159, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_160, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_50, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_64, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_72, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_79, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_103, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_113, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_122, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_131, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_139, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_154, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_162, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_170, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_188, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_189, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_190, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_191, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_63, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_71, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_75, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_77, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_112, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_121, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_130, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_138, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_141, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_161, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_165, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_166, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_167, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_186, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_187, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
										.addGap(60)
										.addComponent(lblGreen, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
>>>>>>> cfdc9a58e54784c023c060a9f0e017e3b1e70e90
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblLevel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAddBlocks)
									.addGap(50))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblRed)
									.addComponent(RedValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGreen, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(GreenValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBlue)
								.addComponent(BlueValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPoints))
							.addGap(18)
							.addComponent(btnAdd)
							.addGap(40)
							.addComponent(btnDefineGameSettings)
							.addGap(62)
							.addComponent(btnNextLevel))
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnPreviousLevel)
							.addGap(18)
							.addComponent(btnSave)
							.addGap(18)
							.addComponent(btnFinish))
						.addComponent(lblGameBlocks))
					.addGap(133)
					.addGap(27)
					.addComponent(lblLevel)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddBlocks))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_46, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_44, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_42, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblRed)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_61, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_62, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_70, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_73, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_74, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_76, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_129, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_137, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_140, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_155, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_156, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_157, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_158, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_159, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_160, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_63, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_71, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_75, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_77, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_112, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_121, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_130, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_138, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_141, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_161, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_165, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_166, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_167, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_186, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_187, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_50, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_64, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_72, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_79, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_103, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_113, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_122, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_131, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_139, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_154, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_162, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_170, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_191, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_190, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_189, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_188, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBlue, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGreen, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_83, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_105, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_115, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_124, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_133, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_143, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_168, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_173, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_200, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_197, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_198, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_199, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_196, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_81, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_96, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_106, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_116, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_125, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_134, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_144, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_169, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_174, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_205, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_202, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_203, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_204, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_201, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblM)
							.addComponent(lblO)
							.addComponent(lblD)
							.addComponent(lblN)
							.addComponent(lblA)
							.addComponent(lblR)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_107, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_117, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_126, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_135, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_145, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_172, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_175, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_210, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_207, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_208, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_209, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_206, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_55, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_69, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_90, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_98, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_108, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_118, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_127, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_136, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_146, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_176, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_216, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_226, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_227, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_228, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_229, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_230, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_56, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_84, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_91, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_99, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_109, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_119, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_128, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_147, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_177, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_215, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_217, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_231, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_232, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_233, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_234, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_235, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_57, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_85, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_92, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_100, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_110, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_120, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_148, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_178, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_211, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_218, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_219, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_236, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_237, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_238, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_239, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_240, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_255, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_254, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_253, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_252, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_251, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_225, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_224, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_214, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_185, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_182, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_180, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_152, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_151, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_95, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_88, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAdd)
							.addGap(41)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_107, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_117, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_126, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_135, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_145, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_172, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_175, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_210, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_207, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_208, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_209, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_206, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_55, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_69, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_90, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_98, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_108, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_118, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_127, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_136, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_146, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_176, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_216, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_226, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_227, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_228, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_229, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_230, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_56, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_84, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_91, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_99, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_109, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_119, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_128, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_147, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_177, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_215, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_217, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_231, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_232, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_233, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_234, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_235, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_57, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_85, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_92, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_100, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_110, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_120, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_148, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_178, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_211, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_218, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_219, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_236, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_237, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_238, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_239, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_240, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addComponent(lblMyBlocks)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_255, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_254, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_253, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_252, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_251, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_225, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_224, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_214, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_185, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_182, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_180, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_152, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_151, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_95, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_88, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPreviousLevel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnNextLevel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnFinish, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(26);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(12, 0, 20, 20);
		layeredPane.add(panel_8);
		panel_8.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 0, 20, 20);
		layeredPane.add(panel);
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(62, 0, 20, 20);
		layeredPane.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(87, 0, 20, 20);
		layeredPane.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(137, 0, 20, 20);
		layeredPane.add(panel_3);
		panel_3.setBackground(Color.WHITE);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(112, 0, 20, 20);
		layeredPane.add(panel_4);
		panel_4.setBackground(Color.WHITE);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(162, 0, 20, 20);
		layeredPane.add(panel_5);
		panel_5.setBackground(Color.WHITE);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(187, 0, 20, 20);
		layeredPane.add(panel_6);
		panel_6.setBackground(Color.WHITE);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(287, 0, 20, 20);
		layeredPane.add(panel_7);
		panel_7.setBackground(Color.WHITE);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(212, 0, 20, 20);
		layeredPane.add(panel_9);
		panel_9.setBackground(Color.WHITE);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(262, 0, 20, 20);
		layeredPane.add(panel_10);
		panel_10.setBackground(Color.WHITE);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(237, 0, 20, 20);
		layeredPane.add(panel_11);
		panel_11.setBackground(Color.WHITE);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(362, 0, 20, 20);
		layeredPane.add(panel_12);
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(312, 0, 20, 20);
		layeredPane.add(panel_13);
		panel_13.setBackground(Color.WHITE);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(337, 0, 20, 20);
		layeredPane.add(panel_14);
		panel_14.setBackground(Color.WHITE);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(12, 25, 20, 20);
		layeredPane.add(panel_15);
		panel_15.setBackground(Color.WHITE);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(37, 25, 20, 20);
		layeredPane.add(panel_16);
		panel_16.setBackground(Color.WHITE);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(62, 25, 20, 20);
		layeredPane.add(panel_17);
		panel_17.setBackground(Color.WHITE);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(87, 25, 20, 20);
		layeredPane.add(panel_18);
		panel_18.setBackground(Color.WHITE);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(112, 25, 20, 20);
		layeredPane.add(panel_19);
		panel_19.setBackground(Color.WHITE);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(137, 25, 20, 20);
		layeredPane.add(panel_20);
		panel_20.setBackground(Color.WHITE);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBounds(162, 25, 20, 20);
		layeredPane.add(panel_32);
		panel_32.setBackground(Color.WHITE);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBounds(187, 25, 20, 20);
		layeredPane.add(panel_33);
		panel_33.setBackground(Color.WHITE);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(212, 25, 20, 20);
		layeredPane.add(panel_21);
		panel_21.setBackground(Color.WHITE);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(237, 25, 20, 20);
		layeredPane.add(panel_22);
		panel_22.setBackground(Color.WHITE);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBounds(262, 25, 20, 20);
		layeredPane.add(panel_23);
		panel_23.setBackground(Color.WHITE);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBounds(287, 25, 20, 20);
		layeredPane.add(panel_34);
		panel_34.setBackground(Color.WHITE);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBounds(312, 25, 20, 20);
		layeredPane.add(panel_35);
		panel_35.setBackground(Color.WHITE);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBounds(337, 25, 20, 20);
		layeredPane.add(panel_24);
		panel_24.setBackground(Color.WHITE);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBounds(362, 25, 20, 20);
		layeredPane.add(panel_25);
		panel_25.setBackground(Color.WHITE);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBounds(12, 50, 20, 20);
		layeredPane.add(panel_36);
		panel_36.setBackground(Color.WHITE);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBounds(37, 50, 20, 20);
		layeredPane.add(panel_37);
		panel_37.setBackground(Color.WHITE);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBounds(62, 50, 20, 20);
		layeredPane.add(panel_38);
		panel_38.setBackground(Color.WHITE);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBounds(87, 50, 20, 20);
		layeredPane.add(panel_26);
		panel_26.setBackground(Color.WHITE);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBounds(112, 50, 20, 20);
		layeredPane.add(panel_39);
		panel_39.setBackground(Color.WHITE);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBounds(137, 50, 20, 20);
		layeredPane.add(panel_27);
		panel_27.setBackground(Color.WHITE);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBounds(162, 50, 20, 20);
		layeredPane.add(panel_42);
		panel_42.setBackground(Color.WHITE);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBounds(187, 50, 20, 20);
		layeredPane.add(panel_28);
		panel_28.setBackground(Color.WHITE);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBounds(12, 75, 20, 20);
		layeredPane.add(panel_40);
		panel_40.setBackground(Color.WHITE);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBounds(12, 100, 20, 20);
		layeredPane.add(panel_41);
		panel_41.setBackground(Color.WHITE);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBounds(12, 125, 20, 20);
		layeredPane.add(panel_43);
		panel_43.setBackground(Color.WHITE);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBounds(12, 150, 20, 20);
		layeredPane.add(panel_29);
		panel_29.setBackground(Color.WHITE);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBounds(12, 175, 20, 20);
		layeredPane.add(panel_44);
		panel_44.setBackground(Color.WHITE);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBounds(12, 200, 20, 20);
		layeredPane.add(panel_45);
		panel_45.setBackground(Color.WHITE);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBounds(12, 225, 20, 20);
		layeredPane.add(panel_30);
		panel_30.setBackground(Color.WHITE);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBounds(212, 50, 20, 20);
		layeredPane.add(panel_31);
		panel_31.setBackground(Color.WHITE);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBounds(237, 50, 20, 20);
		layeredPane.add(panel_46);
		panel_46.setBackground(Color.WHITE);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBounds(262, 50, 20, 20);
		layeredPane.add(panel_47);
		panel_47.setBackground(Color.WHITE);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBounds(262, 125, 20, 20);
		layeredPane.add(panel_48);
		panel_48.setBackground(Color.WHITE);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBounds(62, 150, 20, 20);
		layeredPane.add(panel_61);
		panel_61.setBackground(Color.WHITE);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBounds(87, 150, 20, 20);
		layeredPane.add(panel_62);
		panel_62.setBackground(Color.WHITE);
		
		JPanel panel_70 = new JPanel();
		panel_70.setBounds(112, 150, 20, 20);
		layeredPane.add(panel_70);
		panel_70.setBackground(Color.WHITE);
		
		JPanel panel_73 = new JPanel();
		panel_73.setBounds(37, 150, 20, 20);
		layeredPane.add(panel_73);
		panel_73.setBackground(Color.WHITE);
		
		JPanel panel_74 = new JPanel();
		panel_74.setBounds(37, 125, 20, 20);
		layeredPane.add(panel_74);
		panel_74.setBackground(Color.WHITE);
		
		JPanel panel_76 = new JPanel();
		panel_76.setBounds(62, 125, 20, 20);
		layeredPane.add(panel_76);
		panel_76.setBackground(Color.WHITE);
		
		JPanel panel_129 = new JPanel();
		panel_129.setBounds(87, 125, 20, 20);
		layeredPane.add(panel_129);
		panel_129.setBackground(Color.WHITE);
		
		JPanel panel_137 = new JPanel();
		panel_137.setBounds(112, 125, 20, 20);
		layeredPane.add(panel_137);
		panel_137.setBackground(Color.WHITE);
		
		JPanel panel_140 = new JPanel();
		panel_140.setBounds(137, 125, 20, 20);
		layeredPane.add(panel_140);
		panel_140.setBackground(Color.WHITE);
		
		JPanel panel_155 = new JPanel();
		panel_155.setBounds(162, 125, 20, 20);
		layeredPane.add(panel_155);
		panel_155.setBackground(Color.WHITE);
		
		JPanel panel_156 = new JPanel();
		panel_156.setBounds(187, 125, 20, 20);
		layeredPane.add(panel_156);
		panel_156.setBackground(Color.WHITE);
		
		JPanel panel_157 = new JPanel();
		panel_157.setBounds(212, 125, 20, 20);
		layeredPane.add(panel_157);
		panel_157.setBackground(Color.WHITE);
		
		JPanel panel_158 = new JPanel();
		panel_158.setBounds(237, 125, 20, 20);
		layeredPane.add(panel_158);
		panel_158.setBackground(Color.WHITE);
		
		JPanel panel_159 = new JPanel();
		panel_159.setBounds(137, 150, 20, 20);
		layeredPane.add(panel_159);
		panel_159.setBackground(Color.WHITE);
		
		JPanel panel_160 = new JPanel();
		panel_160.setBounds(287, 125, 20, 20);
		layeredPane.add(panel_160);
		panel_160.setBackground(Color.WHITE);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBounds(37, 175, 20, 20);
		layeredPane.add(panel_49);
		panel_49.setBackground(Color.WHITE);
		
		JPanel panel_63 = new JPanel();
		panel_63.setBounds(62, 175, 20, 20);
		layeredPane.add(panel_63);
		panel_63.setBackground(Color.WHITE);
		
		JPanel panel_71 = new JPanel();
		panel_71.setBounds(87, 175, 20, 20);
		layeredPane.add(panel_71);
		panel_71.setBackground(Color.WHITE);
		
		JPanel panel_75 = new JPanel();
		panel_75.setBounds(112, 175, 20, 20);
		layeredPane.add(panel_75);
		panel_75.setBackground(Color.WHITE);
		
		JPanel panel_77 = new JPanel();
		panel_77.setBounds(137, 175, 20, 20);
		layeredPane.add(panel_77);
		panel_77.setBackground(Color.WHITE);
		
		JPanel panel_112 = new JPanel();
		panel_112.setBounds(162, 175, 20, 20);
		layeredPane.add(panel_112);
		panel_112.setBackground(Color.WHITE);
		
		JPanel panel_121 = new JPanel();
		panel_121.setBounds(187, 175, 20, 20);
		layeredPane.add(panel_121);
		panel_121.setBackground(Color.WHITE);
		
		JPanel panel_130 = new JPanel();
		panel_130.setBounds(212, 175, 20, 20);
		layeredPane.add(panel_130);
		panel_130.setBackground(Color.WHITE);
		
		JPanel panel_138 = new JPanel();
		panel_138.setBounds(237, 175, 20, 20);
		layeredPane.add(panel_138);
		panel_138.setBackground(Color.WHITE);
		
		JPanel panel_141 = new JPanel();
		panel_141.setBounds(262, 175, 20, 20);
		layeredPane.add(panel_141);
		panel_141.setBackground(Color.WHITE);
		
		JPanel panel_161 = new JPanel();
		panel_161.setBounds(287, 175, 20, 20);
		layeredPane.add(panel_161);
		panel_161.setBackground(Color.WHITE);
		
		JPanel panel_165 = new JPanel();
		panel_165.setBounds(312, 175, 20, 20);
		layeredPane.add(panel_165);
		panel_165.setBackground(Color.WHITE);
		
		JPanel panel_166 = new JPanel();
		panel_166.setBounds(337, 175, 20, 20);
		layeredPane.add(panel_166);
		panel_166.setBackground(Color.WHITE);
		
		JPanel panel_167 = new JPanel();
		panel_167.setBounds(362, 175, 20, 20);
		layeredPane.add(panel_167);
		panel_167.setBackground(Color.WHITE);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBounds(37, 200, 20, 20);
		layeredPane.add(panel_50);
		panel_50.setBackground(Color.WHITE);
		
		JPanel panel_64 = new JPanel();
		panel_64.setBounds(62, 200, 20, 20);
		layeredPane.add(panel_64);
		panel_64.setBackground(Color.WHITE);
		
		JPanel panel_72 = new JPanel();
		panel_72.setBounds(87, 200, 20, 20);
		layeredPane.add(panel_72);
		panel_72.setBackground(Color.WHITE);
		
		JPanel panel_79 = new JPanel();
		panel_79.setBounds(112, 200, 20, 20);
		layeredPane.add(panel_79);
		panel_79.setBackground(Color.WHITE);
		
		JPanel panel_103 = new JPanel();
		panel_103.setBounds(137, 200, 20, 20);
		layeredPane.add(panel_103);
		panel_103.setBackground(Color.WHITE);
		
		JPanel panel_113 = new JPanel();
		panel_113.setBounds(162, 200, 20, 20);
		layeredPane.add(panel_113);
		panel_113.setBackground(Color.WHITE);
		
		JPanel panel_122 = new JPanel();
		panel_122.setBounds(187, 200, 20, 20);
		layeredPane.add(panel_122);
		panel_122.setBackground(Color.WHITE);
		
		JPanel panel_131 = new JPanel();
		panel_131.setBounds(212, 200, 20, 20);
		layeredPane.add(panel_131);
		panel_131.setBackground(Color.WHITE);
		
		JPanel panel_139 = new JPanel();
		panel_139.setBounds(237, 200, 20, 20);
		layeredPane.add(panel_139);
		panel_139.setBackground(Color.WHITE);
		
		JPanel panel_154 = new JPanel();
		panel_154.setBounds(262, 200, 20, 20);
		layeredPane.add(panel_154);
		panel_154.setBackground(Color.WHITE);
		
		JPanel panel_162 = new JPanel();
		panel_162.setBounds(287, 200, 20, 20);
		layeredPane.add(panel_162);
		panel_162.setBackground(Color.WHITE);
		
		JPanel panel_170 = new JPanel();
		panel_170.setBounds(312, 200, 20, 20);
		layeredPane.add(panel_170);
		panel_170.setBackground(Color.WHITE);
		
		JPanel panel_188 = new JPanel();
		panel_188.setBounds(337, 200, 20, 20);
		layeredPane.add(panel_188);
		panel_188.setBackground(Color.WHITE);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBounds(37, 225, 20, 20);
		layeredPane.add(panel_51);
		panel_51.setBackground(Color.WHITE);
		
		JPanel panel_65 = new JPanel();
		panel_65.setBounds(62, 225, 20, 20);
		layeredPane.add(panel_65);
		panel_65.setBackground(Color.WHITE);
		
		JPanel panel_78 = new JPanel();
		panel_78.setBounds(87, 225, 20, 20);
		layeredPane.add(panel_78);
		panel_78.setBackground(Color.WHITE);
		
		JPanel panel_82 = new JPanel();
		panel_82.setBounds(112, 225, 20, 20);
		layeredPane.add(panel_82);
		panel_82.setBackground(Color.WHITE);
		
		JPanel panel_104 = new JPanel();
		panel_104.setBounds(137, 225, 20, 20);
		layeredPane.add(panel_104);
		panel_104.setBackground(Color.WHITE);
		
		JPanel panel_114 = new JPanel();
		panel_114.setBounds(162, 225, 20, 20);
		layeredPane.add(panel_114);
		panel_114.setBackground(Color.WHITE);
		
		JPanel panel_123 = new JPanel();
		panel_123.setBounds(187, 225, 20, 20);
		layeredPane.add(panel_123);
		panel_123.setBackground(Color.WHITE);
		
		JPanel panel_132 = new JPanel();
		panel_132.setBounds(212, 225, 20, 20);
		layeredPane.add(panel_132);
		panel_132.setBackground(Color.WHITE);
		
		JPanel panel_142 = new JPanel();
		panel_142.setBounds(237, 225, 20, 20);
		layeredPane.add(panel_142);
		panel_142.setBackground(Color.WHITE);
		
		JPanel panel_163 = new JPanel();
		panel_163.setBounds(262, 225, 20, 20);
		layeredPane.add(panel_163);
		panel_163.setBackground(Color.WHITE);
		
		JPanel panel_164 = new JPanel();
		panel_164.setBounds(287, 225, 20, 20);
		layeredPane.add(panel_164);
		panel_164.setBackground(Color.WHITE);
		
		JPanel panel_171 = new JPanel();
		panel_171.setBounds(312, 225, 20, 20);
		layeredPane.add(panel_171);
		panel_171.setBackground(Color.WHITE);
		
		JPanel panel_193 = new JPanel();
		panel_193.setBounds(337, 225, 20, 20);
		layeredPane.add(panel_193);
		panel_193.setBackground(Color.WHITE);
		
		JPanel panel_194 = new JPanel();
		panel_194.setBounds(362, 200, 20, 20);
		layeredPane.add(panel_194);
		panel_194.setBackground(Color.WHITE);
		
		JPanel panel_195 = new JPanel();
		panel_195.setBounds(362, 225, 20, 20);
		layeredPane.add(panel_195);
		panel_195.setBackground(Color.WHITE);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(37, 75, 20, 20);
		layeredPane.add(panel_58);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(37, 100, 20, 20);
		layeredPane.add(panel_59);
		
		JPanel panel_86 = new JPanel();
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(62, 75, 20, 20);
		layeredPane.add(panel_86);
		
		JPanel panel_87 = new JPanel();
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(87, 75, 20, 20);
		layeredPane.add(panel_87);
		
		JPanel panel_93 = new JPanel();
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(112, 75, 20, 20);
		layeredPane.add(panel_93);
		
		JPanel panel_94 = new JPanel();
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(137, 75, 20, 20);
		layeredPane.add(panel_94);
		
		JPanel panel_101 = new JPanel();
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(162, 75, 20, 20);
		layeredPane.add(panel_101);
		
		JPanel panel_102 = new JPanel();
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(187, 75, 20, 20);
		layeredPane.add(panel_102);
		
		JPanel panel_111 = new JPanel();
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(212, 75, 20, 20);
		layeredPane.add(panel_111);
		
		JPanel panel_149 = new JPanel();
		panel_149.setBackground(Color.WHITE);
		panel_149.setBounds(237, 75, 20, 20);
		layeredPane.add(panel_149);
		
		JPanel panel_150 = new JPanel();
		panel_150.setBackground(Color.WHITE);
		panel_150.setBounds(262, 75, 20, 20);
		layeredPane.add(panel_150);
		
		JPanel panel_153 = new JPanel();
		panel_153.setBackground(Color.WHITE);
		panel_153.setBounds(287, 75, 20, 20);
		layeredPane.add(panel_153);
		
		JPanel panel_179 = new JPanel();
		panel_179.setBackground(Color.WHITE);
		panel_179.setBounds(312, 50, 20, 20);
		layeredPane.add(panel_179);
		
		JPanel panel_181 = new JPanel();
		panel_181.setBackground(Color.WHITE);
		panel_181.setBounds(337, 50, 20, 20);
		layeredPane.add(panel_181);
		
		JPanel panel_183 = new JPanel();
		panel_183.setBackground(Color.WHITE);
		panel_183.setBounds(362, 50, 20, 20);
		layeredPane.add(panel_183);
		
		JPanel panel_184 = new JPanel();
		panel_184.setBackground(Color.WHITE);
		panel_184.setBounds(62, 100, 20, 20);
		layeredPane.add(panel_184);
		
		JPanel panel_186 = new JPanel();
		panel_186.setBackground(Color.WHITE);
		panel_186.setBounds(87, 100, 20, 20);
		layeredPane.add(panel_186);
		
		JPanel panel_187 = new JPanel();
		panel_187.setBackground(Color.WHITE);
		panel_187.setBounds(112, 100, 20, 20);
		layeredPane.add(panel_187);
		
		JPanel panel_189 = new JPanel();
		panel_189.setBackground(Color.WHITE);
		panel_189.setBounds(137, 100, 20, 20);
		layeredPane.add(panel_189);
		
		JPanel panel_190 = new JPanel();
		panel_190.setBackground(Color.WHITE);
		panel_190.setBounds(162, 100, 20, 20);
		layeredPane.add(panel_190);
		
		JPanel panel_191 = new JPanel();
		panel_191.setBackground(Color.WHITE);
		panel_191.setBounds(187, 100, 20, 20);
		layeredPane.add(panel_191);
		
		JPanel panel_192 = new JPanel();
		panel_192.setBackground(Color.WHITE);
		panel_192.setBounds(212, 100, 20, 20);
		layeredPane.add(panel_192);
		
		JPanel panel_212 = new JPanel();
		panel_212.setBackground(Color.WHITE);
		panel_212.setBounds(237, 100, 20, 20);
		layeredPane.add(panel_212);
		
		JPanel panel_213 = new JPanel();
		panel_213.setBackground(Color.WHITE);
		panel_213.setBounds(262, 100, 20, 20);
		layeredPane.add(panel_213);
		
		JPanel panel_220 = new JPanel();
		panel_220.setBackground(Color.WHITE);
		panel_220.setBounds(287, 100, 20, 20);
		layeredPane.add(panel_220);
		
		JPanel panel_221 = new JPanel();
		panel_221.setBackground(Color.WHITE);
		panel_221.setBounds(312, 75, 20, 20);
		layeredPane.add(panel_221);
		
		JPanel panel_222 = new JPanel();
		panel_222.setBackground(Color.WHITE);
		panel_222.setBounds(337, 75, 20, 20);
		layeredPane.add(panel_222);
		
		JPanel panel_223 = new JPanel();
		panel_223.setBackground(Color.WHITE);
		panel_223.setBounds(362, 75, 20, 20);
		layeredPane.add(panel_223);
		
		JPanel panel_241 = new JPanel();
		panel_241.setBackground(Color.WHITE);
		panel_241.setBounds(287, 150, 20, 20);
		layeredPane.add(panel_241);
		
		JPanel panel_242 = new JPanel();
		panel_242.setBackground(Color.WHITE);
		panel_242.setBounds(287, 50, 20, 20);
		layeredPane.add(panel_242);
		
		JPanel panel_243 = new JPanel();
		panel_243.setBackground(Color.WHITE);
		panel_243.setBounds(237, 150, 20, 20);
		layeredPane.add(panel_243);
		
		JPanel panel_244 = new JPanel();
		panel_244.setBackground(Color.WHITE);
		panel_244.setBounds(162, 150, 20, 20);
		layeredPane.add(panel_244);
		
		JPanel panel_245 = new JPanel();
		panel_245.setBackground(Color.WHITE);
		panel_245.setBounds(187, 150, 20, 20);
		layeredPane.add(panel_245);
		
		JPanel panel_246 = new JPanel();
		panel_246.setBackground(Color.WHITE);
		panel_246.setBounds(212, 150, 20, 20);
		layeredPane.add(panel_246);
		
		JPanel panel_247 = new JPanel();
		panel_247.setBackground(Color.WHITE);
		panel_247.setBounds(262, 150, 20, 20);
		layeredPane.add(panel_247);
		
		JPanel panel_248 = new JPanel();
		panel_248.setBackground(Color.WHITE);
		panel_248.setBounds(312, 100, 20, 20);
		layeredPane.add(panel_248);
		
		JPanel panel_249 = new JPanel();
		panel_249.setBackground(Color.WHITE);
		panel_249.setBounds(337, 100, 20, 20);
		layeredPane.add(panel_249);
		
		JPanel panel_250 = new JPanel();
		panel_250.setBackground(Color.WHITE);
		panel_250.setBounds(362, 100, 20, 20);
		layeredPane.add(panel_250);
		
		JPanel panel_256 = new JPanel();
		panel_256.setBackground(Color.WHITE);
		panel_256.setBounds(312, 125, 20, 20);
		layeredPane.add(panel_256);
		
		JPanel panel_257 = new JPanel();
		panel_257.setBackground(Color.WHITE);
		panel_257.setBounds(337, 125, 20, 20);
		layeredPane.add(panel_257);
		
		JPanel panel_258 = new JPanel();
		panel_258.setBackground(Color.WHITE);
		panel_258.setBounds(362, 125, 20, 20);
		layeredPane.add(panel_258);
		
		JPanel panel_259 = new JPanel();
		panel_259.setBackground(Color.WHITE);
		panel_259.setBounds(312, 150, 20, 20);
		layeredPane.add(panel_259);
		
		JPanel panel_260 = new JPanel();
		panel_260.setBackground(Color.WHITE);
		panel_260.setBounds(337, 150, 20, 20);
		layeredPane.add(panel_260);
		
		JPanel panel_261 = new JPanel();
		panel_261.setBackground(Color.WHITE);
		panel_261.setBounds(362, 150, 20, 20);
		layeredPane.add(panel_261);
		
		JPanel panel_262 = new JPanel();
		panel_262.setBackground(new Color(224, 255, 255));
		panel_262.setBounds(0, 0, 390, 390);
		layeredPane.add(panel_262);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 800, 707);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
