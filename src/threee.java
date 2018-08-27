package bba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class threee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threee frame = new threee();
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
	public threee() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire\\Downloads\\download.png"));
		setTitle("Choose Area");
		setBounds(400, 250, 564, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChoosePlace = new JLabel("Choose Place :");
		lblChoosePlace.setForeground(Color.WHITE);
		lblChoosePlace.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChoosePlace.setBounds(47, 27, 195, 49);
		contentPane.add(lblChoosePlace);
		
		JButton btnDhanmondi = new JButton("Dhanmondi");
		btnDhanmondi.setForeground(Color.DARK_GRAY);
		btnDhanmondi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				four frame = new four();
				frame.setVisible(true);
				dispose();
			}
		});
		btnDhanmondi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDhanmondi.setBounds(101, 137, 127, 38);
		contentPane.add(btnDhanmondi);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setForeground(Color.DARK_GRAY);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				two frame = new two();
				frame.setVisible(true);
				dispose();
			}
		});
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGoBack.setBounds(198, 240, 127, 38);
		contentPane.add(btnGoBack);
		
		JButton btnMohammadpur = new JButton("Mohammadpur");
		btnMohammadpur.setForeground(Color.DARK_GRAY);
		btnMohammadpur.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMohammadpur.setBounds(296, 137, 153, 38);
		contentPane.add(btnMohammadpur);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aspire\\Downloads\\pics\\BbQC2B5 - Imgur.jpg"));
		lblNewLabel.setBounds(0, 0, 548, 336);
		contentPane.add(lblNewLabel);
	}
}
