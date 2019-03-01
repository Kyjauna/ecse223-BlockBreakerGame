package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GameLevelOne {

	private JFrame frame;
	private JTextField txtff;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameLevelOne window = new GameLevelOne();
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
	public GameLevelOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		
		JLabel lblLevel = new JLabel("LEVEL 1");
		lblLevel.setForeground(new Color(224, 255, 255));
		lblLevel.setFont(new Font("Monospaced", Font.BOLD, 26));
		
		JPanel panel_8 = new JPanel();
		
		JLabel lblAddBlocks = new JLabel("ADD BLOCKS");
		lblAddBlocks.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblAddBlocks.setForeground(new Color(224, 255, 255));
		lblAddBlocks.setBackground(new Color(224, 255, 255));
		
		JButton btnColor = new JButton("COLOR");
		btnColor.setFont(new Font("Monospaced", Font.PLAIN, 10));
		
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
		
		JPanel panel_53 = new JPanel();
		
		JPanel panel_54 = new JPanel();
		
		JPanel panel_55 = new JPanel();
		
		JPanel panel_56 = new JPanel();
		
		JPanel panel_57 = new JPanel();
		
		JPanel panel_58 = new JPanel();
		
		JPanel panel_59 = new JPanel();
		
		JPanel panel_60 = new JPanel();
		
		JPanel panel_61 = new JPanel();
		
		JPanel panel_62 = new JPanel();
		
		JPanel panel_63 = new JPanel();
		
		JPanel panel_64 = new JPanel();
		
		JPanel panel_65 = new JPanel();
		
		JPanel panel_66 = new JPanel();
		
		JPanel panel_67 = new JPanel();
		
		JPanel panel_68 = new JPanel();
		
		JPanel panel_69 = new JPanel();
		
		JPanel panel_70 = new JPanel();
		
		JPanel panel_71 = new JPanel();
		
		JPanel panel_72 = new JPanel();
		
		JPanel panel_73 = new JPanel();
		
		JPanel panel_74 = new JPanel();
		
		JPanel panel_75 = new JPanel();
		
		JPanel panel_76 = new JPanel();
		
		JPanel panel_77 = new JPanel();
		
		JPanel panel_78 = new JPanel();
		
		JPanel panel_79 = new JPanel();
		
		JPanel panel_80 = new JPanel();
		
		JPanel panel_81 = new JPanel();
		
		JPanel panel_82 = new JPanel();
		
		JPanel panel_83 = new JPanel();
		
		JPanel panel_84 = new JPanel();
		
		JPanel panel_85 = new JPanel();
		
		JPanel panel_86 = new JPanel();
		
		JPanel panel_87 = new JPanel();
		
		JPanel panel_88 = new JPanel();
		
		JPanel panel_89 = new JPanel();
		
		JPanel panel_90 = new JPanel();
		
		JPanel panel_91 = new JPanel();
		
		JPanel panel_92 = new JPanel();
		
		JPanel panel_93 = new JPanel();
		
		JPanel panel_94 = new JPanel();
		
		JPanel panel_95 = new JPanel();
		
		JPanel panel_96 = new JPanel();
		
		JPanel panel_97 = new JPanel();
		
		JPanel panel_98 = new JPanel();
		
		JPanel panel_99 = new JPanel();
		
		JPanel panel_100 = new JPanel();
		
		JPanel panel_101 = new JPanel();
		
		JPanel panel_102 = new JPanel();
		
		JPanel panel_103 = new JPanel();
		
		JPanel panel_104 = new JPanel();
		
		JPanel panel_105 = new JPanel();
		
		JPanel panel_106 = new JPanel();
		
		JPanel panel_107 = new JPanel();
		
		JPanel panel_108 = new JPanel();
		
		JPanel panel_109 = new JPanel();
		
		JPanel panel_110 = new JPanel();
		
		JPanel panel_111 = new JPanel();
		
		JPanel panel_112 = new JPanel();
		
		JPanel panel_113 = new JPanel();
		
		JPanel panel_114 = new JPanel();
		
		JPanel panel_115 = new JPanel();
		
		JPanel panel_116 = new JPanel();
		
		JPanel panel_117 = new JPanel();
		
		JPanel panel_118 = new JPanel();
		
		JPanel panel_119 = new JPanel();
		
		JPanel panel_120 = new JPanel();
		
		JPanel panel_121 = new JPanel();
		
		JPanel panel_122 = new JPanel();
		
		JPanel panel_123 = new JPanel();
		
		JPanel panel_124 = new JPanel();
		
		JPanel panel_125 = new JPanel();
		
		JPanel panel_126 = new JPanel();
		
		JPanel panel_127 = new JPanel();
		
		JPanel panel_128 = new JPanel();
		
		JPanel panel_129 = new JPanel();
		
		JPanel panel_130 = new JPanel();
		
		JPanel panel_131 = new JPanel();
		
		JPanel panel_132 = new JPanel();
		
		JPanel panel_133 = new JPanel();
		
		JPanel panel_134 = new JPanel();
		
		JPanel panel_135 = new JPanel();
		
		JPanel panel_136 = new JPanel();
		
		JPanel panel_137 = new JPanel();
		
		JPanel panel_138 = new JPanel();
		
		JPanel panel_139 = new JPanel();
		
		JPanel panel_140 = new JPanel();
		
		JPanel panel_141 = new JPanel();
		
		JPanel panel_142 = new JPanel();
		
		JPanel panel_143 = new JPanel();
		
		JPanel panel_144 = new JPanel();
		
		JPanel panel_145 = new JPanel();
		
		JPanel panel_146 = new JPanel();
		
		JPanel panel_147 = new JPanel();
		
		JPanel panel_148 = new JPanel();
		
		JPanel panel_149 = new JPanel();
		
		JPanel panel_150 = new JPanel();
		
		JPanel panel_151 = new JPanel();
		
		JPanel panel_152 = new JPanel();
		
		JPanel panel_153 = new JPanel();
		
		JPanel panel_154 = new JPanel();
		
		JPanel panel_155 = new JPanel();
		
		JPanel panel_156 = new JPanel();
		
		JPanel panel_157 = new JPanel();
		
		JPanel panel_158 = new JPanel();
		
		JPanel panel_159 = new JPanel();
		
		JPanel panel_160 = new JPanel();
		
		JPanel panel_161 = new JPanel();
		
		JPanel panel_162 = new JPanel();
		
		JPanel panel_163 = new JPanel();
		
		JPanel panel_164 = new JPanel();
		
		JPanel panel_165 = new JPanel();
		
		JPanel panel_166 = new JPanel();
		
		JPanel panel_167 = new JPanel();
		
		JPanel panel_168 = new JPanel();
		
		JPanel panel_169 = new JPanel();
		
		JPanel panel_170 = new JPanel();
		
		JPanel panel_171 = new JPanel();
		
		JPanel panel_172 = new JPanel();
		
		JPanel panel_173 = new JPanel();
		
		JPanel panel_174 = new JPanel();
		
		JPanel panel_175 = new JPanel();
		
		JPanel panel_176 = new JPanel();
		
		JPanel panel_177 = new JPanel();
		
		JPanel panel_178 = new JPanel();
		
		JPanel panel_179 = new JPanel();
		
		JPanel panel_180 = new JPanel();
		
		JPanel panel_181 = new JPanel();
		
		JPanel panel_182 = new JPanel();
		
		JPanel panel_183 = new JPanel();
		
		JPanel panel_184 = new JPanel();
		
		JPanel panel_185 = new JPanel();
		
		JPanel panel_186 = new JPanel();
		
		JPanel panel_187 = new JPanel();
		
		JPanel panel_188 = new JPanel();
		
		JPanel panel_189 = new JPanel();
		
		JPanel panel_190 = new JPanel();
		
		JPanel panel_191 = new JPanel();
		
		JPanel panel_192 = new JPanel();
		
		JPanel panel_193 = new JPanel();
		
		JPanel panel_194 = new JPanel();
		
		JPanel panel_195 = new JPanel();
		
		JPanel panel_196 = new JPanel();
		
		JPanel panel_197 = new JPanel();
		
		JPanel panel_198 = new JPanel();
		
		JPanel panel_199 = new JPanel();
		
		JPanel panel_200 = new JPanel();
		
		JPanel panel_201 = new JPanel();
		
		JPanel panel_202 = new JPanel();
		
		JPanel panel_203 = new JPanel();
		
		JPanel panel_204 = new JPanel();
		
		JPanel panel_205 = new JPanel();
		
		JPanel panel_206 = new JPanel();
		
		JPanel panel_207 = new JPanel();
		
		JPanel panel_208 = new JPanel();
		
		JPanel panel_209 = new JPanel();
		
		JPanel panel_210 = new JPanel();
		
		JPanel panel_211 = new JPanel();
		
		JPanel panel_212 = new JPanel();
		
		JPanel panel_213 = new JPanel();
		
		JPanel panel_214 = new JPanel();
		
		JPanel panel_215 = new JPanel();
		
		JPanel panel_216 = new JPanel();
		
		JPanel panel_217 = new JPanel();
		
		JPanel panel_218 = new JPanel();
		
		JPanel panel_219 = new JPanel();
		
		JPanel panel_220 = new JPanel();
		
		JPanel panel_221 = new JPanel();
		
		JPanel panel_222 = new JPanel();
		
		JPanel panel_223 = new JPanel();
		
		JPanel panel_224 = new JPanel();
		
		JPanel panel_225 = new JPanel();
		
		JPanel panel_226 = new JPanel();
		
		JPanel panel_227 = new JPanel();
		
		JPanel panel_228 = new JPanel();
		
		JPanel panel_229 = new JPanel();
		
		JPanel panel_230 = new JPanel();
		
		JPanel panel_231 = new JPanel();
		
		JPanel panel_232 = new JPanel();
		
		JPanel panel_233 = new JPanel();
		
		JPanel panel_234 = new JPanel();
		
		JPanel panel_235 = new JPanel();
		
		JPanel panel_236 = new JPanel();
		
		JPanel panel_237 = new JPanel();
		
		JPanel panel_238 = new JPanel();
		
		JPanel panel_239 = new JPanel();
		
		JPanel panel_240 = new JPanel();
		
		JPanel panel_241 = new JPanel();
		
		JPanel panel_242 = new JPanel();
		
		JPanel panel_243 = new JPanel();
		
		JPanel panel_244 = new JPanel();
		
		JPanel panel_245 = new JPanel();
		
		JPanel panel_246 = new JPanel();
		
		JPanel panel_247 = new JPanel();
		
		JPanel panel_248 = new JPanel();
		
		JPanel panel_249 = new JPanel();
		
		JPanel panel_250 = new JPanel();
		
		JPanel panel_251 = new JPanel();
		
		JPanel panel_252 = new JPanel();
		
		JPanel panel_253 = new JPanel();
		
		JPanel panel_254 = new JPanel();
		
		JPanel panel_255 = new JPanel();
		
		txtff = new JTextField();
		txtff.setForeground(new Color(169, 169, 169));
		txtff.setText("#33FF33");
		txtff.setColumns(10);
		
		JButton btnWorth = new JButton("WORTH");
		btnWorth.setFont(new Font("Monospaced", Font.PLAIN, 10));
		
		textField = new JTextField();
		textField.setText("20");
		textField.setForeground(new Color(169, 169, 169));
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		JLabel lblR = new JLabel("R");
		lblR.setForeground(new Color(255, 0, 255));
		lblR.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(30, 144, 255));
		lblA.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JLabel lblN = new JLabel("N");
		lblN.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblN.setForeground(new Color(255, 255, 0));
		
		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblD.setForeground(new Color(0, 255, 0));
		
		JLabel lblO = new JLabel("O");
		lblO.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblO.setForeground(new Color(255, 0, 0));
		
		JLabel lblM = new JLabel("M");
		lblM.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblM.setForeground(new Color(30, 144, 255));
		
		JButton btnNextLevel = new JButton("NEXT LEVEL");
		btnNextLevel.setFont(new Font("Monospaced", Font.BOLD, 11));
		
		JButton btnPreviousLevel = new JButton("PREVIOUS LEVEL");
		btnPreviousLevel.setFont(new Font("Monospaced", Font.BOLD, 9));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Monospaced", Font.BOLD, 11));
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setFont(new Font("Monospaced", Font.BOLD, 11));
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
								.addComponent(panel_59, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_87, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_94, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_102, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_150, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_153, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_181, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_184, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_213, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_222, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_223, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_246, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_247, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_248, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_249, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_250, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGap(278))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_58, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_86, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_93, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_101, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_111, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_149, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_179, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_183, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_212, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_220, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_221, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_241, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_242, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_243, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_244, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_245, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
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
													.addComponent(panel_196, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
													.addGap(278))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
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
															.addComponent(panel_187, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addGap(278))
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
															.addComponent(panel_160, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
															.addGap(278))
														.addGroup(groupLayout.createSequentialGroup()
															.addComponent(lblLevel)
															.addContainerGap(576, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
																	.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
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
																	.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
															.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
																	.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																		.addGroup(groupLayout.createSequentialGroup()
																			.addComponent(btnColor)
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(txtff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGroup(groupLayout.createSequentialGroup()
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(btnWorth, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGroup(groupLayout.createSequentialGroup()
																			.addGap(28)
																			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																				.addComponent(btnNextLevel)
																				.addGroup(groupLayout.createSequentialGroup()
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
																					.addComponent(lblM))
																				.addComponent(btnPreviousLevel, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
																				.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
																				.addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
																	.addGap(53))
																.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
																	.addComponent(lblAddBlocks)
																	.addGap(71))))
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
																	.addComponent(panel_201, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
															.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
															.addComponent(btnAdd)
															.addGap(107))))))))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
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
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblLevel)
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddBlocks))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
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
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtff, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnColor, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
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
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnWorth)))
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
						.addComponent(btnAdd))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_65, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_78, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_82, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_104, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_114, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_123, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_132, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_142, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_163, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_164, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_193, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_194, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_195, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_192, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_171, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
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
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_58, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_86, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_93, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_101, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_111, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_149, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_179, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_183, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_212, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_220, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_221, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_241, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_242, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_243, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_244, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_245, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_59, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_87, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_94, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_102, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_150, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_153, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_181, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_184, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_213, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_222, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_223, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_246, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_247, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_248, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_249, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_250, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
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
							.addGap(44)
							.addComponent(btnNextLevel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPreviousLevel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFinish, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(26))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 732, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
