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

public class PopUpWindowUpdate {

	public JFrame frame;
	public int blockId;

	/**
	 * Launch the application.
	 */
	public static void PopUpWindowUpdate(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//PopUpWindowUpdate window = new PopUpWindowUpdate(blockId);
					//window.frame.setVisible(true);
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
		initialize(blockId);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int blockId) {
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
		frame.setBounds(100, 100, 276, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JLabel lblUpdateABlock = new JLabel("UPDATE A BLOCK");
		lblUpdateABlock.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		JLabel lblOldRed = new JLabel("Old Red:");
		lblOldRed.setFont(projectfont18);
		
		
		JLabel lblOldBlue = new JLabel("Old Blue:");
		lblOldBlue.setFont(projectfont18);
		
		JLabel lblOldGreen = new JLabel("Old Green:");
		lblOldGreen.setFont(projectfont18);
		
		JLabel lblNewRed = new JLabel("New Red:");
		lblNewRed.setFont(projectfont18);
		
		JSpinner spinner_1 = new JSpinner((SpinnerModel) null);
		
		JSpinner spinner = new JSpinner((SpinnerModel) null);
		
		JSpinner spinner_2 = new JSpinner((SpinnerModel) null);
		
		JSpinner spinner_3 = new JSpinner((SpinnerModel) null);
		
		JSpinner spinner_4 = new JSpinner((SpinnerModel) null);
		
		JSpinner spinner_5 = new JSpinner((SpinnerModel) null);
		
		JLabel label = new JLabel("New Blue:");
		label.setFont(null);
		
		JLabel label_1 = new JLabel("New Green:");
		label_1.setFont(null);
		
		JLabel lblOldPoints = new JLabel("Old Points:");
		lblOldPoints.setFont(null);
		
		JSpinner spinner_6 = new JSpinner((SpinnerModel) null);
		
		JLabel lblNewPoints = new JLabel("New Points:");
		lblNewPoints.setFont(null);
		
		JSpinner spinner_7 = new JSpinner((SpinnerModel) null);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(projectfont24);
		
		JButton btnMove = new JButton("MOVE");
		btnMove.setFont(projectfont24);

		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setFont(new Font("Monospaced", Font.PLAIN, 10));
		lblErrormessage.setVisible(false);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUpdateABlock, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewRed)
										.addComponent(lblOldRed))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblOldBlue, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblOldGreen, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(2)
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(spinner_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnDelete)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblOldPoints, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinner_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewPoints, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinner_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnMove, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblErrormessage))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblUpdateABlock, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOldRed)
						.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOldBlue)
						.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOldGreen))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewRed)
						.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOldPoints)
						.addComponent(spinner_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewPoints)
						.addComponent(spinner_7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDelete)
						.addComponent(btnMove))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblErrormessage)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
