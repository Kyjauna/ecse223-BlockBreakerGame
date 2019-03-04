package ca.mcgill.ecse223.block.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JSpinner;

public class PopUpWindowForBAs {
	
	JFrame parent = new JFrame();
	
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
	public PopUpWindowForBAs() {
		initialize();
	}
	
	/**
	 * @wbp.parser.entryPoint
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
			Font projectfont18 = projectfont.deriveFont(18f);
			Font projectfont10 = projectfont.deriveFont(10f);
	        
	        JLayeredPane layeredPane = new JLayeredPane();
	        GroupLayout groupLayout = new GroupLayout(parent.getContentPane());
	        groupLayout.setHorizontalGroup(
	        	groupLayout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(groupLayout.createSequentialGroup()
	        			.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(35, Short.MAX_VALUE))
	        );
	        groupLayout.setVerticalGroup(
	        	groupLayout.createParallelGroup(Alignment.LEADING)
	        		.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
	        );
	        
	        JLabel lblAssignABlock = new JLabel("ASSIGN  A  BLOCK");
	        lblAssignABlock.setFont(projectfont18);
	        lblAssignABlock.setBounds(12, 13, 158, 16);
	        layeredPane.add(lblAssignABlock);
	        
	        JLabel lblHorizontalGridPosition = new JLabel("Horizontal Grid Position:");
	        lblHorizontalGridPosition.setBounds(12, 45, 175, 16);
	        lblHorizontalGridPosition.setFont(new Font("DialogInput", Font.PLAIN, 12));
	        layeredPane.add(lblHorizontalGridPosition);
	        
	        JLabel lblVerticalGridPosition = new JLabel("Vertical Grid Position:");
	        lblVerticalGridPosition.setBounds(12, 74, 175, 16);
	        lblVerticalGridPosition.setFont(new Font("DialogInput", Font.PLAIN, 12));
	        layeredPane.add(lblVerticalGridPosition);
	        
	        JSpinner spinner = new JSpinner();
	        spinner.setBounds(199, 42, 30, 22);
	        layeredPane.add(spinner);
	        
	        JSpinner spinner_1 = new JSpinner();
	        spinner_1.setBounds(199, 71, 30, 22);
	        layeredPane.add(spinner_1);
	        
	        JButton btnNewButton = new JButton("ASSIGN");
	        btnNewButton.setBounds(63, 105, 97, 25);
	        btnNewButton.setFont(projectfont15);
	        layeredPane.add(btnNewButton);
	        parent.getContentPane().setLayout(groupLayout);
	       // parent.pack();
	        parent.setVisible(true);
	    }
}
