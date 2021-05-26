//create a java login form  program using GUI that has a label for username,password and a button for
//logging in that displays a success
//message upon successful login of the user
package LoginFormGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormGUI implements ActionListener {
	//Create global variables
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JPasswordField passTxt;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
	
		JPanel panel=new JPanel(); 
		
		//create a frame
		JFrame frame=new JFrame();
		
		//set frame specifications
		frame.setTitle("LoginForm");
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
		//add panel to frame
		frame.add(panel);
		
		//set the panel layout to null
		panel.setLayout(null);
		
		//create a user label
		 userLabel=new JLabel("UserName:");
		userLabel.setBounds(10,20,80,25);
		
		//add the label to the panel
		panel.add(userLabel); 
		
		//create a text user text field
		 userText=new JTextField(20);
		userText.setBounds(100,20,165,25);
		
		//add the text field to the panel
		panel.add(userText);
		
		
		//create a password label
		 passLabel=new JLabel("Password:");
		passLabel.setBounds(10,50,80,25);
		panel.add(passLabel);
		
		
		//create password text field
		 passTxt=new JPasswordField(20);
		passTxt.setBounds(100,50,165,25);
		panel.add(passTxt);
		
		//add a button
		 button=new JButton("Login");
		button.setBounds(10,80,80,25);
		
		//create a an action listen on the login button
		button.addActionListener(new LoginFormGUI());
		panel.add(button);
		
		//create success label
		 success=new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		frame.setVisible(true);
		
		  
	

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
//		System.out.println("Button clicked");
String user=userText.getText();
String password=passTxt.getText();
	
	if(user.equals("kylestevens") && password.equals("0727732542")) {
		success.setText("Login Successful!");
	}
	else {
		success.setText("Invalid inputs(check your password)");
	}
		
	}

}

//setBound properties(x, y, width, height)
