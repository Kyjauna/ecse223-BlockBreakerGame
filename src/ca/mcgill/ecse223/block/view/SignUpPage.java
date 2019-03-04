package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.LayoutStyle.ComponentPlacement;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SignUpPage {

	public JFrame frame;
	public JTextField txtUsername;
	public JPasswordField pwdPassword;
	public JPasswordField pwdPassword_1;
	public JLabel lblErrorMessage;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					SignUpPage window = new SignUpPage();
					window.frame.setVisible(true);
					window.frame.setPreferredSize(new Dimension(400, 300));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUpPage() {
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
		Font projectfont10 = projectfont.deriveFont(10f);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSignUp = new JLabel("SIGN UP");
		lblSignUp.setForeground(new Color(153, 204, 204));
		lblSignUp.setFont(projectfont52);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(projectfont15);
		lblUsername.setForeground(new Color(153, 204, 204));
		lblUsername.setBackground(Color.WHITE);
		
		JLabel lblPlayerPassword = new JLabel("Player Password");
		lblPlayerPassword.setForeground(new Color(153, 204, 204));
		lblPlayerPassword.setFont(projectfont15);
		
		JLabel lblAdminPassword = new JLabel("Admin Password");
		lblAdminPassword.setFont(projectfont15);
		lblAdminPassword.setForeground(new Color(153, 204, 204));
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(0, 0, 153));
		txtUsername.setFont(new Font("Charter", Font.BOLD, 13));
		txtUsername.setText("");
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(new Color(0, 0, 153));
		pwdPassword.setEchoChar('*');
		pwdPassword.setText("");
		
		pwdPassword_1 = new JPasswordField();
		pwdPassword_1.setForeground(new Color(0, 0, 153));
		pwdPassword_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pwdPassword_1.setEchoChar('*');
		pwdPassword_1.setText("");
		
		JLabel lblNewLabel = new JLabel("Optional");
		lblNewLabel.setFont(projectfont10);
		lblNewLabel.setForeground(new Color(153, 204, 204));
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username= txtUsername.getText();
				String playerpassword=new String(pwdPassword.getPassword());
				String adminpassword=new String(pwdPassword_1.getPassword());
				
				System.out.println(username+playerpassword+adminpassword);
				try {
					Block223Controller.register(username, playerpassword, adminpassword);
					frame.setVisible(false);
				} 
				catch (InvalidInputException e1) {
					lblErrorMessage.setText(e1.getMessage());
					lblErrorMessage.setVisible(true);
				}
				

			}
		});
		btnCreateAccount.setForeground(new Color(0, 0, 102));
		btnCreateAccount.setBackground(new Color(153, 204, 204));
		btnCreateAccount.setFont(projectfont15);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		btnCancel.setFont(projectfont15);
		btnCancel.setForeground(new Color(0, 0, 102));
		btnCancel.setBackground(new Color(153, 204, 204));
		
		lblErrorMessage = new JLabel("errormessage");
		lblErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMessage.setVerticalAlignment(SwingConstants.TOP);
		lblErrorMessage.setForeground(new Color(153, 204,204));
		lblErrorMessage.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblErrorMessage.setVisible(false);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(294, Short.MAX_VALUE)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(288))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(273)
					.addComponent(btnCreateAccount)
					.addContainerGap(270, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(245)
					.addComponent(lblSignUp)
					.addContainerGap(256, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(190)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPlayerPassword)
								.addComponent(lblUsername))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(45)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblAdminPassword))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(pwdPassword_1)
						.addComponent(pwdPassword)
						.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
					.addContainerGap(221, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
					.addGap(138))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSignUp)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlayerPassword)
						.addComponent(pwdPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdminPassword)
						.addComponent(pwdPassword_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblErrorMessage, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnCreateAccount, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}