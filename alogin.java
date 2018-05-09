import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class alogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alogin window = new alogin();
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
	public alogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAccountantlogin = new JLabel("Accountant Login");
		lblAccountantlogin.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblAccountantlogin.setBounds(110, 11, 219, 43);
		frame.getContentPane().add(lblAccountantlogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(415, 52, -302, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 94, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 134, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(110, 91, 263, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 131, 263, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//log in
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword()); //get password
				boolean status=AccountantDao.validate(name, password);
				if(status){
					AccountantSection.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(frame,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLogIn.setBounds(110, 195, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main m=new Main();
				m.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(300, 195, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(382, 163, -322, 14);
		frame.getContentPane().add(separator_1);
	}
}
