package bba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class one extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					one frame = new one();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public one() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire\\Downloads\\download.png"));
		setTitle("E-Health Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,250, 564, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to E-Health Help !!!");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblWelcome.setBounds(117, 50, 345, 39);
		contentPane.add(lblWelcome);
		
		JButton btnNewButton = new JButton("  Sign In");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				two f = new two();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(192, 147, 106, 39);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("  Sign Up");
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     two2 frame = new two2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setBounds(192, 210, 106, 39);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aspire\\Downloads\\pics\\BbQC2B5 - Imgur.jpg"));
		lblNewLabel.setBounds(0, 0, 548, 336);
		contentPane.add(lblNewLabel);
	}
}
