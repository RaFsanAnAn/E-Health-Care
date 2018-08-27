package bba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class five extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					five frame = new five();
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
	public five() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire\\Downloads\\download.png"));
		setForeground(Color.BLACK);
		setTitle("Choose Section");
		setBounds(400, 250, 564, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cardiology");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(48, 41, 142, 35);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Neurology");
		rdbtnNewRadioButton_1.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(48, 96, 142, 35);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Gynaecology");
		rdbtnNewRadioButton_2.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(48, 149, 142, 35);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Orthopaedics");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_3.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_3.setBounds(48, 210, 142, 35);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("ENT");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_4.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton_4.setBounds(48, 266, 142, 35);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JButton btnEmergency = new JButton("EMERGENCY");
		btnEmergency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				six frame = new six();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEmergency.setForeground(Color.DARK_GRAY);
		btnEmergency.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEmergency.setBounds(333, 178, 142, 48);
		contentPane.add(btnEmergency);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				six frame = new six();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBook.setForeground(Color.DARK_GRAY);
		btnBook.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBook.setBounds(333, 96, 142, 48);
		contentPane.add(btnBook);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aspire\\Downloads\\pics\\BbQC2B5 - Imgur.jpg"));
		lblNewLabel.setBounds(0, 0, 548, 336);
		contentPane.add(lblNewLabel);
	}

}
