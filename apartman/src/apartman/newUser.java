package apartman;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class newUser extends JFrame  implements ActionListener
{
	
	JButton save = new JButton("Save");
	JButton cancel = new JButton("Cancel");
	JLabel name = new JLabel("Username");
	JTextField nametxt =new JTextField();
	JLabel phoneNumber = new JLabel("Phone number");
	JTextField phoneNumbertxt =new JTextField();
	JLabel password = new JLabel("Password");
	JPasswordField passwordtxt = new JPasswordField();
	JLabel gender= new JLabel("GENDER");
	JRadioButton rbF = new JRadioButton("F");
	JRadioButton rbM = new JRadioButton("M");
	ButtonGroup bg = new ButtonGroup();
	JPanel pnl =new JPanel(new FlowLayout());
	JLabel host= new JLabel("HOST/TENANT");
	JRadioButton hostb = new JRadioButton("Host");
	JRadioButton tenantb = new JRadioButton("Tenant");
	JPanel pnl2 =new JPanel(new FlowLayout());
	JLabel numberOfApartment = new JLabel("APARTMENT NUMBER");
	JTextField apartmentNumbertxt =new JTextField();
	JLabel homeNumber = new JLabel("HOME NUMBER");
	JTextField homeNumbertxt =new JTextField();
	
	public newUser(){
		super("Welcome");
		setLocation(500, 300);
		setSize(400, 300);
		setLayout(new GridLayout(8,2));
		pnl.add(rbM);	pnl.add(rbF);
		pnl2.add(hostb); 	pnl2.add(tenantb);
		
		add(name);			   add(nametxt);
		add(phoneNumber);	   add(phoneNumbertxt);
		add(numberOfApartment);add(apartmentNumbertxt);
		add(homeNumber);	   add(homeNumbertxt);
		add(password);		   add(passwordtxt);
		add(gender);		   add(pnl);
		add(host);		 	   add(pnl2);
		add(cancel);		   add(save);
		
		bg.add(rbM);bg.add(rbF);
		bg.add(hostb);bg.add(tenantb);
		cancel.addActionListener(this);
		
		
	}
	

	public static void main(String[] args) {
		new newUser().setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource()==save)
		if (e.getSource()== cancel)
			System.exit(0);
			
			
		
	}

}
