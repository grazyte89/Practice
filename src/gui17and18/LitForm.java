package gui17and18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class LitForm extends JFrame{
	
	private JTextField addresBox;
	private JTextArea inputBox;
	private JTextArea outputBox;
	private JButton[] buttons;
	private JLabel[] theLabels;
	
	public LitForm()
	{
		super("zeroJava Doc");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 550);
		intiliasingVar();
		giveValuetoVar();
		layoutOfFrame();
	}
	
	private void intiliasingVar()
	{
		addresBox = new JTextField(70); 
		inputBox = new JTextArea(10, 70);
		outputBox = new JTextArea(10, 70);
		buttons = new JButton[5];
		theLabels = new JLabel[5];
	}
	
	private void giveValuetoVar()
	{
		buttons[0] = new JButton("ConnectToFile");
		buttons[1] = new JButton("WriteToFile");
		buttons[2] = new JButton("LoadFromFile");
		
		theLabels[0] = new JLabel("Addess/Path");
		theLabels[1] = new JLabel("Input text");
		theLabels[2] = new JLabel("Output text"); 
	}
	
	private void layoutOfFrame()
	{
	    SpringLayout layout = new SpringLayout();
	    setLayout(layout);

	    add(theLabels[0]);
	    add(addresBox);
	    add(buttons[0]);
	    add(theLabels[1]);
	    add(inputBox);
	    add(buttons[1]);
	    add(theLabels[2]);
	    add(outputBox);
	    add(buttons[2]);
	    
	    layout.putConstraint(SpringLayout.WEST, theLabels[0], 5, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, theLabels[0], 5, SpringLayout.NORTH, getContentPane());
	    
	    layout.putConstraint(SpringLayout.NORTH, addresBox, 5, SpringLayout.NORTH, getContentPane());
	    layout.putConstraint(SpringLayout.WEST, addresBox, 5, SpringLayout.EAST, theLabels[0]);
	    
	    layout.putConstraint(SpringLayout.WEST, buttons[0], 741, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, buttons[0], 7, SpringLayout.SOUTH, addresBox);
	    
	    layout.putConstraint(SpringLayout.WEST, theLabels[1], 5, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, theLabels[1], 7, SpringLayout.SOUTH, buttons[0]);
	    
	    layout.putConstraint(SpringLayout.WEST, inputBox, 25, SpringLayout.EAST, theLabels[1]);
	    layout.putConstraint(SpringLayout.NORTH, inputBox, 7, SpringLayout.SOUTH, buttons[0]);
	    
	    layout.putConstraint(SpringLayout.WEST, buttons[1], 755, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, buttons[1], 7, SpringLayout.SOUTH, inputBox);
	    
	    layout.putConstraint(SpringLayout.WEST, theLabels[2], 5, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, theLabels[2], 7, SpringLayout.SOUTH, buttons[1]);
	    
	    layout.putConstraint(SpringLayout.WEST, outputBox, 16, SpringLayout.EAST, theLabels[2]);
	    layout.putConstraint(SpringLayout.NORTH, outputBox, 7, SpringLayout.SOUTH, buttons[1]);
	    
	    layout.putConstraint(SpringLayout.WEST, buttons[2], 745, SpringLayout.WEST, getContentPane());
	    layout.putConstraint(SpringLayout.NORTH, buttons[2], 7, SpringLayout.SOUTH, outputBox);
	}
	
	private void acction()
	{
		
	}
}
