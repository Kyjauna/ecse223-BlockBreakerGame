package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;

import ca.mcgill.ecse223.block.controller.Block223Controller;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PopUpWindowMoveABlock {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUpWindowMoveABlock window = new PopUpWindowMoveABlock();
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
	public PopUpWindowMoveABlock() {
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

		Font projectfont18 = projectfont.deriveFont(15f);
		Font projectfont24 = projectfont.deriveFont(24f);
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 248);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(563, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(269, Short.MAX_VALUE))
		);
		
		JPanel panel = new JPanel();
		layeredPane_1.setLayer(panel, 1);
		panel.setBounds(0, 0, 263, 195);
		layeredPane_1.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		JLabel lblMoveABlock = new JLabel("MOVE A BLOCK");
		lblMoveABlock.setBounds(12, 13, 136, 25);
		lblMoveABlock.setFont(projectfont24);
		panel.add(lblMoveABlock);
		
		JSpinner spinner_1 = new JSpinner(numbermodelV);
		spinner_1.setBounds(221, 64, 30, 22);
		panel.add(spinner_1);
		
		SpinnerNumberModel numbermodelH = new SpinnerNumberModel(0, 0, 14,1);
		SpinnerNumberModel numbermodelV = new SpinnerNumberModel(0, 0, 9,1);
		
		JSpinner spinner = new JSpinner(numbermodelH);
		spinner.setBounds(221, 36, 30, 22);
		panel.add(spinner);
		
		JSpinner spinner_3 = new JSpinner(numbermodelH);
		spinner_3.setBounds(221, 94, 30, 22);
		panel.add(spinner_3);
		
		JSpinner spinner_2 = new JSpinner(numbermodelV);
		spinner_2.setBounds(221, 126, 30, 22);
		panel.add(spinner_2);
		
		JLabel lblOldVerticalGrid = new JLabel("Old Vertical Grid Position:");
		lblOldVerticalGrid.setBounds(12, 67, 189, 17);
		lblOldVerticalGrid.setFont(new Font("DialogInput", Font.PLAIN, 12));
		panel.add(lblOldVerticalGrid);
		
		JLabel lblNewVerticalGrid = new JLabel("New Vertical Grid Position:");
		lblNewVerticalGrid.setBounds(12, 97, 189, 17);
		lblNewVerticalGrid.setFont(new Font("DialogInput", Font.PLAIN, 12));
		panel.add(lblNewVerticalGrid);
		
		JLabel lblNewHorizontalGrid = new JLabel("New Horizontal Grid Position:");
		lblNewHorizontalGrid.setBounds(12, 129, 203, 17);
		lblNewHorizontalGrid.setFont(new Font("DialogInput", Font.PLAIN, 12));
		panel.add(lblNewHorizontalGrid);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(262, 127, 1, 1);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1, Short.MAX_VALUE)
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1, Short.MAX_VALUE)
		);
		layeredPane.setLayout(gl_layeredPane);
		panel.add(layeredPane);
		
		JLabel lblOldHorizontalgridPosition = new JLabel("Old Horizontal Grid Position:");
		lblOldHorizontalgridPosition.setBounds(12, 39, 203, 17);
		lblOldHorizontalgridPosition.setFont(new Font("DialogInput", Font.PLAIN, 12));
		panel.add(lblOldHorizontalgridPosition);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnNewButton.setBounds(22, 161, 81, 25);
		btnNewButton.setFont(projectfont18);
		panel.add(btnNewButton);
		
		JButton btnMove = new JButton("MOVE");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Integer oldHorizontalPos = (Integer) spinner.getValue();
			Integer oldVerticalPos = (Integer) spinner_1.getValue();
			Integer newHorizontalPos = (Integer) spinner_2.getValue();
			Integer newVerticalPos = (Integer) spinner_3.getValue();
			
			Block223Controller.moveBlock(level, oldHorizontalPos, oldVerticalPos, newHorizontalPos, newVerticalPos);
			
			}
		});
		btnMove.setBounds(145, 161, 81, 25);
		btnMove.setFont(projectfont18);
		panel.add(btnMove);
		frame.getContentPane().setLayout(groupLayout);
	}

}
