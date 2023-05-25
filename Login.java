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
import java.io.*;
import java.util.*;

public class Login extends JFrame {
	 

	private JPanel contentPane;
	private JTextField UserTxt;
	private JTextField PassTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public class Accounts {
	    
	    String username;
	    String password;

	    public Accounts(String username, String password){
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	        return username;
	    }
	    
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    
	    public String getPassword() {
	        return password;
	    }
	    
	    public void setPassword(String password) {
	        this.password = password;
	    }
	}

	public  Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NC PROJECTS LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(125, 23, 160, 14);
		contentPane.add(lblNewLabel);
		
		UserTxt = new JTextField();
		UserTxt.setBounds(136, 126, 160, 20);
		contentPane.add(UserTxt);
		UserTxt.setColumns(10);
		
		PassTxt = new JTextField();
		PassTxt.setColumns(10);
		PassTxt.setBounds(136, 155, 160, 20);
		contentPane.add(PassTxt);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(48, 127, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(48, 156, 89, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UsernameInput = UserTxt.getText();
				String PasswordInput = PassTxt.getText();
				ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
			    try {
			      FileReader fileReader = new FileReader("D:\\New folder (2)\\Presentation\\src\\registered_accounts.txt");
			      BufferedReader bufferedReader = new BufferedReader(fileReader);
			      String line;
			      while ((line = bufferedReader.readLine()) != null) {
			        if (line.trim().isEmpty()) {
			          continue;
			        }
			        String[] split = line.split(",");
			        if (split.length >= 5) {
			          String name = split[0];
			          String username = split[1];
			          String password = split[2];
			          String email = split[3];
			          String phone = split[4];
			          Accounts account = new Accounts(username, password);
			          accountsList.add(account);
			        }
			      }
			      bufferedReader.close();
			      fileReader.close();
			    } catch (IOException | ArrayIndexOutOfBoundsException ex) {
			        ex.getMessage(); 
			    }
			
			    boolean found = false;
			    for (int i = 0; i < accountsList.size(); i++) {
			      String username = accountsList.get(i).getUsername();
			      String password = accountsList.get(i).getPassword();

			      if(UsernameInput.equals(username) && PasswordInput.equals(password)){
			          JOptionPane.showMessageDialog(null, "Login Successfully!");
			          found = true;
			        
			          break;
			      }else if(UsernameInput.isEmpty() && PasswordInput.isEmpty()){
			    	  JOptionPane.showMessageDialog(null, "Invalid Username and Password!");  
			          found = true;
			          break;
			      }else if(UsernameInput.equals(username) && !PasswordInput.equals(password)){
			    	  JOptionPane.showMessageDialog(null, "Invalid Password!");
			          found = true;
			          break;
			      }else if(!UsernameInput.equals(username) && PasswordInput.equals(password)){
			    	  JOptionPane.showMessageDialog(null, "Invalid Username!");
			          found = true;
			          break;
			      }
			    }
			    if(!found){
			    	JOptionPane.showMessageDialog(null, "Invalid Username and Password!");
			    }

			  
		
		 
				
			}
		});
		btnNewButton.setBounds(159, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register R = new Register();
				R.setVisible(true);
				dispose();
			}
		});
		btnRegister.setBounds(159, 220, 89, 23);
		contentPane.add(btnRegister);
		}
}

