package bba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class four extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					four frame = new four();
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
	public four() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire\\Downloads\\download.png"));
		setForeground(Color.BLACK);
		setTitle("List of Available Hospitals");
		setBounds(400, 250, 564, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Popular");
		rdbtnNewRadioButton_1.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(26, 65, 147, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Ibne Sina");
		rdbtnNewRadioButton_2.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(26, 140, 147, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnLabAid = new JRadioButton("Lab Aid");
		rdbtnLabAid.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnLabAid.setForeground(Color.DARK_GRAY);
		rdbtnLabAid.setBounds(26, 224, 147, 23);
		contentPane.add(rdbtnLabAid);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				threee frame = new threee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBounds(333, 181, 133, 42);
		contentPane.add(btnCancel);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				five frame = new five();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBook.setForeground(Color.DARK_GRAY);
		btnBook.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBook.setBounds(333, 103, 133, 42);
		contentPane.add(btnBook);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aspire\\Downloads\\pics\\BbQC2B5 - Imgur.jpg"));
		lblNewLabel.setBounds(0, 0, 548, 336);
		contentPane.add(lblNewLabel);
	}
}
