package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPasswordField pwdPassword_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage window = new SignUpPage();
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
	public SignUpPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSignUp = new JLabel("SIGN UP");
		lblSignUp.setForeground(new Color(153, 204, 204));
		lblSignUp.setFont(new Font("Monospaced", Font.BOLD, 32));
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblUsername.setForeground(new Color(153, 204, 204));
		lblUsername.setBackground(Color.WHITE);
		
		JLabel lblPlayerPassword = new JLabel("Player Password:");
		lblPlayerPassword.setForeground(new Color(153, 204, 204));
		lblPlayerPassword.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		JLabel lblAdminPassword = new JLabel("Admin Password:");
		lblAdminPassword.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblAdminPassword.setForeground(new Color(153, 204, 204));
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setEchoChar('*');
		pwdPassword.setText("password");
		
		pwdPassword_1 = new JPasswordField();
		pwdPassword_1.setEchoChar('*');
		pwdPassword_1.setText("password");
		
		JLabel lblNewLabel = new JLabel("[Optional]");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 10));
		lblNewLabel.setForeground(new Color(153, 204, 204));
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCreateAccount.setForeground(new Color(0, 0, 102));
		btnCreateAccount.setBackground(new Color(153, 204, 204));
		btnCreateAccount.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCancel.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnCancel.setForeground(new Color(0, 0, 102));
		btnCancel.setBackground(new Color(153, 204, 204));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(155, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblUsername)
										.addComponent(lblPlayerPassword)
										.addComponent(lblAdminPassword))
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addGap(56)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pwdPassword)
								.addComponent(pwdPassword_1)
								.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(252)
							.addComponent(lblSignUp))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(238)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnCreateAccount))))
					.addContainerGap(240, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSignUp)
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsername)
								.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPlayerPassword)
								.addComponent(pwdPassword_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAdminPassword)
								.addComponent(pwdPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(40))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
							.addGap(33)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCreateAccount, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}