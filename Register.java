import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Register extends JFrame {
	

	private JPanel contentPane;
	private JTextField TFNAME;
	private JTextField TFUSER;
	private JTextField TFPASS;
	private JTextField TFEMAIL;
	private JTextField TFPHONE;
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(153, 21, 98, 19);
		contentPane.add(lblNewLabel);
		
		JLabel Name1 = new JLabel("Name:");
		Name1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Name1.setBounds(60, 78, 46, 14);
		contentPane.add(Name1);
		
		TFNAME = new JTextField();
		TFNAME.setBounds(60, 103, 299, 20);
		contentPane.add(TFNAME);
		TFNAME.setColumns(10);
		
		JLabel Username1 = new JLabel("Username:");
		Username1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Username1.setBounds(60, 134, 61, 14);
		contentPane.add(Username1);
		
		TFUSER = new JTextField();
		TFUSER.setColumns(10);
		TFUSER.setBounds(60, 159, 299, 20);
		contentPane.add(TFUSER);
		
		JLabel Password1 = new JLabel("Password:");
		Password1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Password1.setBounds(60, 190, 61, 14);
		contentPane.add(Password1);
		
		TFPASS = new JTextField();
		TFPASS.setColumns(10);
		TFPASS.setBounds(60, 215, 299, 20);
		contentPane.add(TFPASS);
		
		JLabel Email1 = new JLabel("Email:");
		Email1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Email1.setBounds(60, 246, 61, 14);
		contentPane.add(Email1);
		
		TFEMAIL = new JTextField();
		TFEMAIL.setColumns(10);
		TFEMAIL.setBounds(60, 271, 299, 20);
		contentPane.add(TFEMAIL);
		
		JLabel Phone1 = new JLabel("Phone:");
		Phone1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Phone1.setBounds(60, 302, 46, 14);
		contentPane.add(Phone1);
		
		TFPHONE = new JTextField();
		TFPHONE.setColumns(10);
		TFPHONE.setBounds(60, 327, 299, 20);
		contentPane.add(TFPHONE);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (!TFNAME.getText().equals("") && !TFUSER.getText().equals("") && !TFPASS.getText().equals("") && !TFEMAIL.getText().equals("") && !TFPHONE.getText().equals("")) {
		            // Register the account and save details to a text file
		        	String name = TFNAME.getText();
		    	    String username = TFUSER.getText();
		    	    String password = TFPASS.getText();
		    	    String email = TFEMAIL.getText();
		    	    String phone = TFPHONE.getText();
		        	registerAccount(name, username, password, email, phone);
		        } else {
		            JOptionPane.showMessageDialog(null, "Fill out all the fields and try again");
		        }
		    }
		});


				

			
	
		btnNewButton.setBounds(60, 359, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(258, 358, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnBack_1 = new JButton("Clear");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TFNAME.setText(" ");
				TFUSER.setText(" ");
				TFPASS.setText(" ");
				TFEMAIL.setText(" ");
				TFPHONE.setText(" ");
			}
		});
		btnBack_1.setBounds(159, 359, 89, 23);
		contentPane.add(btnBack_1);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	private void registerAccount(String name, String username, String password, String email, String phone) {
	 

	    

	    try {
	        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\New folder (2)\\Presentation\\src\\registered_accounts.txt", true));
	        writer.write( name  + ","  +  username + "," +  password + ","  + email + ","  + phone);
	        writer.newLine();
	        writer.close();

	        JOptionPane.showMessageDialog(null, "Successfully Registered");
	    } catch (IOException ex) {
	        JOptionPane.showMessageDialog(null, "Error occurred while saving the account details");
	        ex.printStackTrace();
	    }
	}
}
