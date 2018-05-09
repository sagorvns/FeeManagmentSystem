import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class AccountantSection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantSection window = new AccountantSection();
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
	public AccountantSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAccountantsection = new JLabel("Accountant Section");
		lblAccountantsection.setBackground(Color.BLACK);
		lblAccountantsection.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAccountantsection.setBounds(131, 11, 317, 43);
		frame.getContentPane().add(lblAccountantsection);
		
		JButton btnNewButton = new JButton("ADD STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddStudent as=new AddStudent();
				as.main(null);
				frame.dispose();
			
			}
		});
		btnNewButton.setBounds(25, 66, 128, 129);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnViewStudent = new JButton("VIEW STUDENT");
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewStudent as=new ViewStudent();
				as.main(null);
				
				
			}
		});
		btnViewStudent.setBounds(209, 65, 128, 130);
		frame.getContentPane().add(btnViewStudent);
		
		JButton btnEditStudent = new JButton("EDIT STUDENT");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditStudent edit=new EditStudent();
				edit.main(null);
			}
		});
		btnEditStudent.setBounds(94, 219, 158, 148);
		frame.getContentPane().add(btnEditStudent);
		
		JButton btnDueFees = new JButton("DUE FEES");
		btnDueFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DueFee df=new DueFee();
				df.main(null);
			}
		});
		btnDueFees.setBounds(395, 65, 128, 130);
		frame.getContentPane().add(btnDueFees);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main m=new Main();
				m.main(null);
				frame.dispose();
				
			}
		});
		btnLogout.setBounds(311, 219, 158, 148);
		frame.getContentPane().add(btnLogout);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(120, 46, 310, 8);
		frame.getContentPane().add(separator);
	}
}
