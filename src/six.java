package bba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class six extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					six frame = new six();
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
	public six() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire\\Downloads\\download.png"));
		setForeground(Color.BLACK);
		setTitle("Success");
		setBounds(400, 250, 564, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setForeground(Color.DARK_GRAY);
		btnMainMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threee frame = new threee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMainMenu.setBounds(80, 256, 141, 38);
		contentPane.add(btnMainMenu);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setForeground(Color.DARK_GRAY);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(309, 256, 141, 38);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Your booking has been done successfully. ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(25, 54, 358, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblYouWillGet = new JLabel("You will get a call very soon regarding the seat information.");
		lblYouWillGet.setForeground(Color.WHITE);
		lblYouWillGet.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYouWillGet.setBounds(25, 90, 453, 38);
		contentPane.add(lblYouWillGet);
		
		JLabel lblThanksForUsing = new JLabel("Thanks for using our service. ");
		lblThanksForUsing.setForeground(Color.WHITE);
		lblThanksForUsing.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThanksForUsing.setBounds(25, 127, 394, 38);
		contentPane.add(lblThanksForUsing);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aspire\\Downloads\\pics\\BbQC2B5 - Imgur.jpg"));
		lblNewLabel_1.setBounds(0, 0, 548, 336);
		contentPane.add(lblNewLabel_1);
	}

}
