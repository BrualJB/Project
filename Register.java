import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Register  extends Login{

	private JFrame Register1;
	private JTextField Name1;
	private JTextField Username1;
	private JTextField Password1;
	private JTextField Email1;
	private JTextField Phone1;
	private JTextField Address1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.Register1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Register1 = new JFrame();
		Register1.setBounds(100, 100, 500, 550);
		Register1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Register1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Applicant Registration");
		lblNewLabel.setBounds(118, 11, 286, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Register1.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Name1.getText().equals("") && !Username1.getText().equals("") && !Password1.getText().equals("")  && !Email1.getText().equals("") && !Phone1.getText().equals("")) {
				    JOptionPane.showMessageDialog(null, "Successfully Registered");
				} else {
				    JOptionPane.showMessageDialog(null, "Fill out all the fields and try again");
				

	}
		
	
}
	
		
		});
		btnNewButton.setBounds(62, 387, 89, 23);
		Register1.getContentPane().add(btnNewButton);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(62, 51, 70, 14);
		Register1.getContentPane().add(Name);
		
		Name1 = new JTextField();
		Name1.setBounds(62, 76, 311, 20);
		Register1.getContentPane().add(Name1);
		Name1.setColumns(10);
		
		JLabel Username = new JLabel("Username");
		Username.setBounds(62, 107, 70, 14);
		Register1.getContentPane().add(Username);
		
		Username1 = new JTextField();
		Username1.setColumns(10);
		Username1.setBounds(62, 132, 311, 20);
		Register1.getContentPane().add(Username1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame FE = new LoginFrame();
				FE.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(284, 387, 89, 23);
		Register1.getContentPane().add(btnBack);
		
		JLabel Password = new JLabel("Password");
		Password.setBounds(62, 163, 70, 14);
		Register1.getContentPane().add(Password);
		
		Password1 = new JTextField();
		Password1.setColumns(10);
		Password1.setBounds(62, 188, 311, 20);
		Register1.getContentPane().add(Password1);
		
		JLabel Email = new JLabel("Email");
		Email.setBounds(62, 219, 70, 14);
		Register1.getContentPane().add(Email);
		
		Email1 = new JTextField();
		Email1.setColumns(10);
		Email1.setBounds(62, 244, 311, 20);
		Register1.getContentPane().add(Email1);
		
		JLabel Phone = new JLabel("Phone");
		Phone.setBounds(62, 275, 89, 14);
		Register1.getContentPane().add(Phone);
		
		Phone1 = new JTextField();
		Phone1.setColumns(10);
		Phone1.setBounds(62, 300, 311, 20);
		Register1.getContentPane().add(Phone1);
		
		JLabel Address = new JLabel("Address");
		Address.setBounds(62, 331, 89, 14);
		Register1.getContentPane().add(Address);
		
		Address1 = new JTextField();
		Address1.setColumns(10);
		Address1.setBounds(62, 356, 311, 20);
		Register1.getContentPane().add(Address1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name1.setText("");
				Username1.setText("");
				Password1.setText("");
				Email1.setText("");
				Phone1.setText("");
				Address1.setText("");
				
			}
		});
		btnReset.setBounds(174, 387, 89, 23);
		Register1.getContentPane().add(btnReset);
	}

	protected void getText() {
		// TODO Auto-generated method stub
		
	}


	}

