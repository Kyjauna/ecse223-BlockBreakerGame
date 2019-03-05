package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;
import ca.mcgill.ecse223.block.controller.TOGridCell;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class GameLevelPage {

	public JFrame frame;
	public JTextField RedValue;
	public JTextField textField;
	public JTextField GreenValue;
	public JTextField BlueValue;
	JLayeredPane layeredPane;
	static JPanel panel_262;
	static int level=0;
	JLabel lblErrormessage;

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

	
	public static void refresh() {
		List<TOGridCell> BAs = null;
		panel_262.removeAll();
		try {
			BAs=Block223Controller.getBlocksAtLevelOfCurrentDesignableGame(level);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		for (TOGridCell gridcell: BAs) {
			int red =gridcell.getRed();
			int blue=gridcell.getBlue();
			int green=gridcell.getGreen();
			int points=gridcell.getPoints();
			int hPos=gridcell.getGridHorizontalPosition();
			int vPos=gridcell.getGridVerticalPosition();
			BlockCell physicalblock = new BlockCell(hPos,vPos,red,green,blue, points);
			panel_262.add(physicalblock.block);
			
		}
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
		Font projectfont24 = projectfont.deriveFont(24f);
		Font projectfont20 = projectfont.deriveFont(20f);
		Font projectfont32 = projectfont.deriveFont(32f);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
		JLabel lblLevel = new JLabel("LEVEL "+level);
		lblLevel.setForeground(new Color(224, 255, 255));
		lblLevel.setFont(projectfont32);
		
		JLabel lblAddBlocks = new JLabel("ADD BLOCKS");
		lblAddBlocks.setFont(projectfont24);
		lblAddBlocks.setForeground(new Color(224, 255, 255));
		lblAddBlocks.setBackground(new Color(224, 255, 255));
		
		JLabel lblRed = new JLabel("RED");
		lblRed.setFont(projectfont15);
		lblRed.setForeground(Color.RED);
		
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
		RedValue.setText("");
		RedValue.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(new Color(169, 169, 169));
		textField.setColumns(10);
		
		JLabel addblockerror = new JLabel("error");
		addblockerror.setFont(new Font("STIXGeneral", Font.PLAIN, 11));
		addblockerror.setForeground(Color.RED);
		addblockerror.setVisible(false);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String redvalue = RedValue.getText();
				int red = Integer.parseInt(redvalue);
						
				String greenvalue = GreenValue.getText();
				int green = Integer.parseInt(greenvalue);
				
				String bluevalue = BlueValue.getText();
				int blue = Integer.parseInt(bluevalue);
				
				String pointvalue = textField.getText();
				int points = Integer.parseInt(pointvalue);
										
				try {
					Block223Controller.addBlock(red, green, blue, points);
					} 
				catch (InvalidInputException e1) {
					addblockerror.setText(e1.getMessage());
					addblockerror.setVisible(true);
				}
			}
			
		});
		btnAdd.setFont(projectfont15);
		
		layeredPane = new JLayeredPane();
		
		JLabel lblPoints = new JLabel("POINTS");
		lblPoints.setFont(projectfont15);
		lblPoints.setForeground(new Color(224, 255, 255));
		
		JButton btnNextLevel = new JButton("NEXT LEVEL");
		btnNextLevel.setFont(projectfont15);
		btnNextLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			level++;
			GameLevelPage.refresh();
			}
		});
		
		GreenValue = new JTextField();
		GreenValue.setText("0-255");
		GreenValue.setForeground(new Color(169, 169, 169));
		GreenValue.setColumns(10);
		
		JLabel lblBlue = new JLabel("BLUE");
		lblBlue.setForeground(Color.BLUE);
		lblBlue.setFont(projectfont15);
		
		BlueValue = new JTextField();
		BlueValue.setText("0-255");
		BlueValue.setForeground(new Color(169, 169, 169));
		BlueValue.setColumns(10);
		
		JLabel lblGreen = new JLabel("GREEN");
		lblGreen.setForeground(Color.GREEN);
		lblGreen.setFont(projectfont15);
		
		JButton btnPreviousLevel = new JButton("PREVIOUS LEVEL");
		btnPreviousLevel.setFont(projectfont15);
		btnPreviousLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			level--;
			GameLevelPage.refresh();
			}
		});
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(projectfont15);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Block223Controller.saveGame();
				} catch (InvalidInputException e1) {

				}
			}
		});
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setFont(projectfont15);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			YouAreAnAdminPage donegame =new YouAreAnAdminPage();
			donegame.frame.setVisible(true);
			
			}
		});
		
		JButton btnDefineGameSettings = new JButton("DEFINE GAME SETTINGS");
		btnDefineGameSettings.setFont(projectfont15);
		
		btnDefineGameSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			DefineGamePage redefine=new DefineGamePage();
			redefine.frame.setVisible(true);
			}
		});
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		
		JLabel lblNewLabel = new JLabel("Game");
		try {
			lblNewLabel.setText(Block223Controller.getCurrentDesignableGame().getName());
		} catch (InvalidInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblNewLabel.setFont(projectfont52);
		lblNewLabel.setForeground(new Color(224,255,255));
		
			JButton btnMoveBlockAssignment = new JButton("MOVE  CURRENT  BLOCK");
			btnMoveBlockAssignment.setFont(projectfont15);
			
			btnMoveBlockAssignment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
				PopUpWindowMoveABlock window = new PopUpWindowMoveABlock(level);
				window.frame.setVisible(true);
				
				}
			});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
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
							.addComponent(panel_255, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(278))
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
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
										.addComponent(panel_230, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
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
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblLevel)
													.addPreferredGap(ComponentPlacement.RELATED, 286, Short.MAX_VALUE))
												.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(btnMoveBlockAssignment)
														.addGroup(groupLayout.createSequentialGroup()
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
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_197, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_198, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(panel_199, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
												.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(62)
													.addComponent(panel_196, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(52)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblRed)
														.addComponent(lblPoints)
														.addGroup(groupLayout.createSequentialGroup()
															.addComponent(lblBlue)
															.addPreferredGap(ComponentPlacement.RELATED))
														.addComponent(lblGreen))
													.addGap(31)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(BlueValue, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(GreenValue, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
														.addComponent(RedValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(149)
													.addComponent(btnAdd))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(112)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(16)
															.addComponent(btnNextLevel))
														.addComponent(btnPreviousLevel)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(36)
															.addComponent(btnSave))
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(23)
															.addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(100)
													.addComponent(lblAddBlocks))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(44)
													.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(29)
													.addComponent(addblockerror, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(91)
													.addComponent(btnDefineGameSettings)))
											.addGap(335))))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(lblLevel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, 0, 0, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(lblAddBlocks)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRed)
								.addComponent(RedValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(addblockerror)
							.addGap(28)
							.addComponent(btnDefineGameSettings))
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnNextLevel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnPreviousLevel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSave)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnFinish))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMoveBlockAssignment)
					.addGap(162)
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
						.addComponent(panel_201, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
		);
		
		JLabel lblGameBlocks = new JLabel("GAME BLOCKS");
		lblGameBlocks.setBounds(0, 0, 133, 25);
		layeredPane_1.add(lblGameBlocks);
		lblGameBlocks.setFont(projectfont24);
		lblGameBlocks.setForeground(new Color(224, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 23, 398, 8);
		separator.setForeground(new Color(224, 255, 255));
		layeredPane_1.add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 33, 171, 33);
		layeredPane_1.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 79, 56, 16);
		layeredPane_1.add(label);
		
		SpinnerNumberModel numbermodelH = new SpinnerNumberModel(0, 0, 14,1);
		SpinnerNumberModel numbermodelV = new SpinnerNumberModel(0, 0, 9,1);
		
		JSpinner spinner = new JSpinner(numbermodelH);
		spinner.setForeground(Color.WHITE);
		spinner.setBounds(219, 72, 30, 22);
		layeredPane_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner(numbermodelV);
		spinner_1.setForeground(Color.WHITE);
		spinner_1.setBounds(219, 101, 30, 22);
		layeredPane_1.add(spinner_1);
		
		JLabel lblVerticalGridPosition = new JLabel("Vertical Grid Position:");
		lblVerticalGridPosition.setForeground(Color.WHITE);
		lblVerticalGridPosition.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblVerticalGridPosition.setBounds(10, 104, 189, 17);
		layeredPane_1.add(lblVerticalGridPosition);
		
		JLabel lblHorizontalGridPosition = new JLabel("Horizontal Grid Position:");
		lblHorizontalGridPosition.setForeground(Color.WHITE);
		lblHorizontalGridPosition.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblHorizontalGridPosition.setBounds(10, 75, 203, 17);
		layeredPane_1.add(lblHorizontalGridPosition);
		
		JButton btnNewButton = new JButton("POSITION BLOCK");
		btnNewButton.setBounds(207, 37, 148, 25);
		btnNewButton.setFont(projectfont15);
		layeredPane_1.add(btnNewButton);
		
		lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblErrormessage.setForeground(Color.WHITE);
		lblErrormessage.setBounds(10, 125, 345, 16);
		lblErrormessage.setVisible(false);
		layeredPane_1.add(lblErrormessage);
		
		panel_262 = new JPanel();
		panel_262.setBackground(Color.WHITE);
		panel_262.setBounds(0, 0, 390, 390);
		layeredPane.add(panel_262);
		panel_262.setLayout(null);
		
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 800, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
