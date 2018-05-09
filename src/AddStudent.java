import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class AddStudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(20, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(106, 55, 245, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 89, 245, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 123, 245, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 154, 245, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(106, 186, 245, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(106, 217, 245, 20);
		frame.getContentPane().add(textField_5);
		
		textArea = new JTextArea();
		textArea.setBounds(106, 248, 245, 60);
		frame.getContentPane().add(textArea);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(106, 331, 245, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(106, 362, 245, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(106, 392, 245, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(106, 421, 245, 20);
		frame.getContentPane().add(textField_9);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add student
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				
				Student s=new Student(name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.save(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(frame,"Student added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");
					textField_9.setText("");textArea.setText("");
				}else{
					JOptionPane.showMessageDialog(frame,"Sorry, Unable to add student!");
				}
				
				
			}
		});
		btnAdd.setBounds(106, 460, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountantSection as=new AccountantSection();
				as.main(null);
				frame.dispose();
				
				
			}
		});
		btnBack.setBounds(264, 460, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 92, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCourse = new JLabel("course");
		lblCourse.setBounds(20, 126, 46, 14);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblFee = new JLabel("fee");
		lblFee.setBounds(20, 157, 46, 14);
		frame.getContentPane().add(lblFee);
		
		JLabel lblPaid = new JLabel("paid");
		lblPaid.setBounds(20, 189, 46, 14);
		frame.getContentPane().add(lblPaid);
		
		JLabel lblDue = new JLabel("due");
		lblDue.setBounds(20, 220, 46, 14);
		frame.getContentPane().add(lblDue);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(20, 253, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblCity = new JLabel("city");
		lblCity.setBounds(20, 334, 46, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("state");
		lblState.setBounds(20, 365, 46, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblCountary = new JLabel("country");
		lblCountary.setBounds(20, 393, 46, 14);
		frame.getContentPane().add(lblCountary);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(20, 424, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblAddStudent = new JLabel("ADD STUDENT");
		lblAddStudent.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblAddStudent.setBounds(106, 11, 250, 33);
		frame.getContentPane().add(lblAddStudent);
	}
}
