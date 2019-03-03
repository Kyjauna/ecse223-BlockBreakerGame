package ca.mcgill.ecse223.block.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import ca.mcgill.ecse223.block.controller.Block223Controller;
import ca.mcgill.ecse223.block.controller.InvalidInputException;

import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

public class WelcomePage {

	public JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;


	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
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
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 623, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
<<<<<<< HEAD
		JDesktopPane layeredPane_1 = new JDesktopPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		layeredPane_1.setLayout(null);
=======
		JLabel lblHi = new JLabel("BLOCK223");
		lblHi.setForeground(Color.BLACK);
		lblHi.setFont(new Font("Monospaced", Font.BOLD, 32));
		
		txtUsername = new JTextField();
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Monospaced", Font.BOLD, 13));
		
		pwdPassword = new JPasswordField();
		pwdPassword.setEchoChar('*');
		
		JLabel lblErrormessage = new JLabel("");
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			
		/* actionlistener for login button
		 * does not yet work because we do not have the admin page set up 
		 * 
		 * Sharon just set it up.
		 */
			public void actionPerformed(ActionEvent e) {
				
				String username=txtUsername.getText();	//getting text from the username text field
				String password=new String(pwdPassword.getPassword());	//getting text from the password field
				try {
					Block223Controller.login(username, password);	//calling controller to perform action associated with the method
					YouAreAnAdminPage adminPage = new YouAreAnAdminPage();
					adminPage.frame.setVisible(true);
				
				} catch (InvalidInputException e1) {
					lblErrormessage.setText(e1.getMessage());
					
					
				}
				

				
			}
		});
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Monospaced", Font.BOLD, 12));
>>>>>>> dedc95f31ab55fa61ccba724bf978d0bcca5f261
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 255,0));
		layeredPane_1.setLayer(panel_28, 5);
		panel_28.setBounds(266, 312, 96, 36);
		layeredPane_1.add(panel_28);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setForeground(new Color(0, 0, 255));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SignUpPage signuppage= new SignUpPage();	//this is how you launch a different page
				signuppage.frame.setVisible(true);		//don't forget to set the frame etc. to public
			
			}
			
		});
<<<<<<< HEAD
		btnSignUp.setFont(new Font("Charter", Font.PLAIN, 16));
		panel_28.add(btnSignUp);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(204, 204, 255)));
		panel_24.setBackground(new Color(0, 0, 153,0));
		layeredPane_1.setLayer(panel_24, 4);
		panel_24.setBounds(134, 200, 103, 30);
		layeredPane_1.add(panel_24);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(204, 204, 255));
		lblNewLabel_2.setFont(new Font("Charter", Font.PLAIN, 17));
		panel_24.add(lblNewLabel_2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(204, 204, 255)));
		panel_23.setBackground(new Color(0, 0, 102,0));
		layeredPane_1.setLayer(panel_23, 4);
		panel_23.setBounds(134, 138, 103, 31);
		layeredPane_1.add(panel_23);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(204, 204, 255));
		lblNewLabel_1.setFont(new Font("Charter", Font.PLAIN, 17));
		panel_23.add(lblNewLabel_1);
		
		JPanel panel_27 = new JPanel();
		panel_27.setForeground(new Color(0, 255, 51));
		panel_27.setBackground(new Color(255, 255, 255,0));
		layeredPane_1.setLayer(panel_27, 5);
		panel_27.setBounds(266, 256, 96, 36);
		layeredPane_1.add(panel_27);
		
		JLabel lblErrormessage = new JLabel("");
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 0, 255));
		btnLogin.addActionListener(new ActionListener() {
			
			/* actionlistener for login button
			 * does not yet work because we do not have the admin page set up 
			 * 
			 * Sharon just set it up.
			 */
				public void actionPerformed(ActionEvent e) {
					
					String username=txtUsername.getText();	//getting text from the username text field
					String password=new String(pwdPassword.getPassword());	//getting text from the password field
					try {
						Block223Controller.login(username, password);	//calling controller to perform action associated with the method
						YouAreAnAdminPage adminPage = new YouAreAnAdminPage();
						adminPage.frame.setVisible(true);
					
					} catch (InvalidInputException e1) {
						lblErrormessage.setText(e1.getMessage());
						
						
					}
					

					
				}
			});
		btnLogin.setFont(new Font("Charter", Font.PLAIN, 17));
		panel_27.add(btnLogin);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(null);
		panel_26.setBackground(new Color(0, 0, 153));
		layeredPane_1.setLayer(panel_26, 5);
		panel_26.setBounds(249, 200, 125, 36);
		layeredPane_1.add(panel_26);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(new Color(0, 0, 153));
		pwdPassword.setFont(new Font("Charter", Font.PLAIN, 13));
		panel_26.add(pwdPassword);
		pwdPassword.setColumns(10);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(null);
		panel_25.setForeground(new Color(0, 0, 51));
		panel_25.setBackground(new Color(0, 0, 153));
		layeredPane_1.setLayer(panel_25, 5);
		panel_25.setBounds(250, 135, 124, 36);
		layeredPane_1.add(panel_25);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(0, 0, 153));
		txtUsername.setFont(new Font("Charter", Font.PLAIN, 13));
		panel_25.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 125, 122);
		panel.setBackground(Color.GREEN);
		layeredPane_1.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(124, 0, 125, 122);
		panel_1.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_1);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(0, 0, 102,200));
		layeredPane_1.setLayer(panel_22, 4);
		panel_22.setBounds(127, 125, 368, 235);
		layeredPane_1.add(panel_22);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(0, 0, 102,200));
		layeredPane_1.setLayer(panel_21, 1);
		panel_21.setBounds(42, 32, 550, 425);
		layeredPane_1.add(panel_21);
		
		JLabel lblNewLabel = new JLabel("BLOCK 223");
		lblNewLabel.setForeground(new Color(204, 204, 255));
		lblNewLabel.setFont(new Font("Charter", Font.PLAIN, 52));
		panel_21.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(249, 0, 125, 122);
		panel_2.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(374, 0, 125, 122);
		panel_3.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(498, 0, 125, 122);
		panel_4.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 122, 125, 122);
		panel_5.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		layeredPane_1.setLayer(panel_7, 3);
		panel_7.setBounds(249, 122, 125, 122);
		panel_7.setBackground(Color.GREEN);
		layeredPane_1.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		layeredPane_1.setLayer(panel_8, 3);
		panel_8.setBounds(374, 122, 125, 122);
		panel_8.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(498, 122, 125, 122);
		panel_9.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 242, 125, 122);
		panel_10.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		layeredPane_1.setLayer(panel_11, 3);
		panel_11.setBounds(124, 242, 125, 122);
		panel_11.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		layeredPane_1.setLayer(panel_12, 3);
		panel_12.setBounds(249, 242, 125, 122);
		panel_12.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		layeredPane_1.setLayer(panel_13, 3);
		panel_13.setBounds(374, 242, 125, 122);
		panel_13.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(498, 242, 125, 122);
		panel_14.setBackground(Color.GREEN);
		layeredPane_1.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 363, 125, 122);
		panel_15.setBackground(new Color(102, 255, 255));
		layeredPane_1.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(124, 363, 125, 122);
		panel_16.setBackground(Color.GREEN);
		layeredPane_1.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(249, 363, 125, 122);
		panel_17.setBackground(new Color(0, 0, 255));
		layeredPane_1.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(374, 363, 125, 122);
		panel_18.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(498, 363, 125, 122);
		panel_19.setBackground(Color.YELLOW);
		layeredPane_1.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(0, 0, 10, 10);
		layeredPane_1.add(panel_20);
		
		JPanel panel_6 = new JPanel();
		layeredPane_1.setLayer(panel_6, 3);
		panel_6.setBackground(new Color(102, 255, 255));
		panel_6.setBounds(124, 122, 125, 122);
		layeredPane_1.add(panel_6);
=======
		btnSignUp.setForeground(new Color(0, 0, 0));
		btnSignUp.setFont(new Font("Monospaced", Font.BOLD, 12));
		

		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHi, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(212)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblPassword)
											.addComponent(lblUsername))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
											.addComponent(pwdPassword, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblErrormessage, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(274)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnSignUp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))))
					.addGap(287))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblHi)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(pwdPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblErrormessage)
					.addGap(8)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSignUp, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
		);
>>>>>>> dedc95f31ab55fa61ccba724bf978d0bcca5f261
		frame.getContentPane().setLayout(groupLayout);
	}

}
