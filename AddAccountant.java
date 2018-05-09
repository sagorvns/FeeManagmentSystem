import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.*;




public class AddAccountant {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccountant window = new AddAccountant();
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
	public AddAccountant() {
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
		
		JLabel lblAddAccountant = new JLabel("Add Accountant");
		lblAddAccountant.setBounds(164, 11, 137, 14);
		frame.getContentPane().add(lblAddAccountant);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(52, 68, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(148, 65, 215, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 159, 215, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 197, 215, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(52, 117, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(52, 162, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(52, 200, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		JButton btnAddAccountant = new JButton("Add");
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				
				//char ch[]=passwordField.getPassword();
				//String password=String.valueOf(ch);
				//String password=passwordField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				
				
				String email=textField_1.getText();
				String contactno=textField_2.getText();
				
				Accountant a=new Accountant(name,password,email,contactno);
				int status=AccountantDao.save(a);
				
			
				if(status>0){
					JOptionPane.showMessageDialog(frame,"Accountant added successfully!");
					textField.setText("");passwordField.setText("");textField_1.setText("");
					textField_2.setText("");
				}else{
					JOptionPane.showMessageDialog(frame,"Sorry, Unable to add Accountant!");
				}
				
				
				
			}
		});
		btnAddAccountant.setBounds(80, 227, 89, 23);
		frame.getContentPane().add(btnAddAccountant);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminBoard ab=new AdminBoard();
				ab.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(296, 227, 89, 23);
		frame.getContentPane().add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 114, 215, 20);
		frame.getContentPane().add(passwordField);
	}
}
