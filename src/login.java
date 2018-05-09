
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class login {

	private JFrame frame;
	private JFrame newframe;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogIn.setBounds(178, 48, 81, 25);
		frame.getContentPane().add(lblLogIn);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(53, 115, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(32, 157, 87, 14);
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setBounds(139, 112, 220, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(139, 154, 220, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String pass=password.getText();
				String user=username.getText();
			
				if(user.contains("admin")&&pass.contains("1234"))
				{
					username.setText(null);
					password.setText(null);
					AdminBoard ab=new AdminBoard();
					ab.main(null);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ERROR","LOGIN FAIL",JOptionPane.ERROR_MESSAGE);
					username.setText(null);
					password.setText(null);
					
				}
							}
		});
		btnNewButton.setBounds(30, 216, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
			}
		});
		btnReset.setBounds(178, 216, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancle = new JButton("EXIT");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				newframe=new JFrame("Exit");	
				if(JOptionPane.showConfirmDialog(newframe,"Confir to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
									System.exit(0);
									
																			}
				
		}
				
			
		});
		
		btnCancle.setBounds(301, 216, 89, 23);
		frame.getContentPane().add(btnCancle);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setForeground(Color.YELLOW);
		separator.setBounds(245, 84, -258, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 203, 363, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(32, 84, 358, 2);
		frame.getContentPane().add(separator_2);
	}
}
