import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class AdminBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminBoard window = new AdminBoard();
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
	public AdminBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddAccountan = new JButton("Add Accountan");
		btnAddAccountan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add
				AddAccountant ab=new AddAccountant();
				ab.main(null);
				frame.dispose();
							}
		});
		btnAddAccountan.setBounds(42, 83, 162, 183);
		frame.getContentPane().add(btnAddAccountan);
		
		JButton button = new JButton("View Accountant");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//view
				ViewAccountant ab=new ViewAccountant();
				ab.main(null);
				
				
			}
		});
		button.setBounds(249, 83, 162, 183);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Log Out");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//log out
				Main m=new Main();
				m.main(null);
				frame.dispose();
				
			}
		});
		button_1.setBounds(437, 83, 152, 183);
		frame.getContentPane().add(button_1);
		
		JLabel lblHelloAdmin = new JLabel("ADMIN DASHBOARD");
		lblHelloAdmin.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		lblHelloAdmin.setBounds(191, 11, 368, 50);
		frame.getContentPane().add(lblHelloAdmin);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(191, 59, 251, 2);
		frame.getContentPane().add(separator);
	}
}
