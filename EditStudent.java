import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class EditStudent {

	private JFrame frame;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea textArea;
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudent window = new EditStudent();
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
	public EditStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRoll = new JLabel("roll");
		lblRoll.setBounds(23, 11, 46, 14);
		frame.getContentPane().add(lblRoll);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(123, 248, 247, 22);
		frame.getContentPane().add(textArea);
		
		
		JButton btnUdate = new JButton("udate");
		btnUdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//update
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
				int rollno=Integer.parseInt(textField_10.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.update(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(frame,"Student updated successfully!");
					AccountantSection.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(frame,"Sorry, Unable to add student!");
				}
				
				
			}
		});
		
		
		btnUdate.setBounds(95, 420, 89, 23);
		frame.getContentPane().add(btnUdate);
		
		textField_10 = new JTextField();
		textField_10.setBounds(138, 8, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnLoad = new JButton("load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//load data
				String srollno=textField_10.getText();
				if(srollno==null||srollno.trim().equals("")){
					JOptionPane.showMessageDialog(frame,"Please enter rollno first!");
				}else{
				int rollno=Integer.parseInt(srollno);
				Student s=StudentDao.getStudentByRollno(rollno);
				textField.setText(s.getName());
				textField_1.setText(s.getEmail());
				textField_2.setText(s.getCourse());
				textField_3.setText(String.valueOf(s.getFee()));
				textField_4.setText(String.valueOf(s.getPaid()));
				textField_5.setText(String.valueOf(s.getDue()));
				textArea.setText(s.getAddress());
				textField_6.setText(s.getCity());
				textField_7.setText(s.getState());
				textField_8.setText(s.getCountry());
				textField_9.setText(s.getContactno());
				}
				
			}
		});
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 390, 9);
		frame.getContentPane().add(separator);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(23, 69, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(23, 106, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCourse = new JLabel("course");
		lblCourse.setBounds(23, 141, 46, 14);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblFee = new JLabel("fee");
		lblFee.setBounds(23, 166, 46, 14);
		frame.getContentPane().add(lblFee);
		
		JLabel lblPaid = new JLabel("paid");
		lblPaid.setBounds(23, 192, 46, 14);
		frame.getContentPane().add(lblPaid);
		
		JLabel lblDue = new JLabel("due");
		lblDue.setBounds(23, 231, 46, 14);
		frame.getContentPane().add(lblDue);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(23, 253, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblCity = new JLabel("city");
		lblCity.setBounds(23, 283, 46, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("state");
		lblState.setBounds(23, 315, 46, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblCountry = new JLabel("country");
		lblCountry.setBounds(23, 358, 46, 14);
		frame.getContentPane().add(lblCountry);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(23, 383, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		
		btnLoad.setBounds(281, 7, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountantSection as=new AccountantSection();
				as.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(308, 420, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(123, 66, 247, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 103, 247, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 138, 247, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 163, 247, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(123, 189, 247, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(123, 220, 247, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(112, 280, 247, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(112, 312, 247, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(112, 355, 247, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(112, 380, 247, 20);
		frame.getContentPane().add(textField_9);
		
		
	}

}
