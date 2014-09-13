package gui17and18;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LitForm extends JFrame{
	
	private JTextField addresBox;
	private JTextArea inputBox;
	private JTextArea outputBox;
	private JButton[] buttons;
	private JPanel[] thePanels;
	
	public LitForm()
	{
		super("zeroJava Doc");
		setSize(500, 500);
		intiliasingVar();
		giveValuetoVar();
	}
	
	private void intiliasingVar()
	{
		addresBox = new JTextField(100); 
		inputBox = new JTextArea();
		outputBox = new JTextArea();
		buttons = new JButton[5];
		thePanels = new JPanel[3];
	}
	
	private void giveValuetoVar()
	{
		buttons[0] = new JButton("ConnectToFile");
		buttons[1] = new JButton("WriteToFile");
	}
	
	private void layoutOfFrame()
	{
		setLayout(new GridLayout(3, 1));
	}
}
