package apartman;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class loginPage extends JFrame implements ActionListener
{
	JButton login = new JButton("Login");
	JButton cancel = new JButton("Cancel");
	JButton forgotPassword = new JButton("I forgot my password");
	JButton register = new JButton("Register");
	JLabel name = new JLabel("Username");
	JTextField nametxt =new JTextField();
	
	JLabel password = new JLabel("Password");
	JPasswordField passwordtxt = new JPasswordField();
	
	
	
	public  loginPage () {
		super("Welcome");
		setLocation(400, 200);
		setSize(300, 200);
		setLayout(new GridLayout(4,2));
		add(name);
		add(nametxt);
		add(password);
		add(passwordtxt);
		add(forgotPassword);	add(register);
		add(cancel);	add(login);
		cancel.addActionListener(this);
		register.addActionListener(this);
		//pack();
		
	}
	
	
	

	public static void main(String[] args) {
		new loginPage().setVisible(true);
	}




	   newUser nu = new newUser();
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cancel) 
			System.exit(0);
		else if(e.getSource()==register)
			nu.setVisible(true);
			
		
		
	}

}
