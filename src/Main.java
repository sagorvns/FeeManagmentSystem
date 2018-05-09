import java.awt.EventQueue;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;  
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblFeesystem = new JLabel("Fees Managment  System");
		lblFeesystem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblFeesystem.setBounds(268, 11, 402, 34);
		frame.getContentPane().add(lblFeesystem);
		
		JLabel lblNewLabel =new JLabel(new ImageIcon("1.jpg"));
	
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(114, 78, 183, 177);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//admin login
				login log=new login();
				log.main(null);
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(112, 280, 192, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 =new JLabel(new ImageIcon("2.jpg"));
		
		lblNewLabel_1.setBounds(470, 78, 172, 169);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Accountant");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Accountant login
				alogin alog=new alogin();
				alog.main(null);
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(470, 278, 183, 28);
		frame.getContentPane().add(btnNewButton_1);
	}
}
