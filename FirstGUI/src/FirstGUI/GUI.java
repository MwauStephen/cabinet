package FirstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	//create a count variable
	int count=0;
	
	//create a global variables
	JFrame frame;
	JLabel label;
	JButton button;
	JPanel panel;
	

	//create a constructor
	public GUI(){
		
		//create a java frame
		 frame=new JFrame();
		
		//create a button
		button=new JButton("Click Me!");
		
		//add an action listener that records the no.of clicks performed on the button
		button.addActionListener(this);
		//create a label
		label=new JLabel("Number of clicks: 0");
		
		//create a panel
		 panel=new JPanel();
		
		//add items to the panel
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		//add panel to the frame
		frame.add(panel, BorderLayout.CENTER);
		
		//set what happens when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set the title of the window
		frame.setTitle("Our  FIRST GUI");
		
		//set the window to match certain size
		frame.pack();
		
		//set window to be visible and focus
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of clicks: "+ count);
	
		
	}

}
