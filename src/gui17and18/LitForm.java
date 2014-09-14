package gui17and18;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
	private JPanel thePanels;
	private JPanel textPanel;
	private JPanel buttonPanels;
	
	public LitForm()
	{
		super("zeroJava Doc");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		intiliasingVar();
		giveValuetoVar();
		layoutOfFrame();
	}
	
	private void intiliasingVar()
	{
		addresBox = new JTextField(100); 
		inputBox = new JTextArea();
		outputBox = new JTextArea();
		buttons = new JButton[5];
		thePanels = new JPanel();
		textPanel = new JPanel();
		buttonPanels = new JPanel();
	}
	
	private void giveValuetoVar()
	{
		buttons[0] = new JButton("ConnectToFile");
		buttons[1] = new JButton("WriteToFile");
		
		//thePanels.setLayout(new GridLayout(3, 1));
		thePanels.setLayout(new BorderLayout());
		textPanel.setLayout(new GridLayout(2, 1));
		buttonPanels.setLayout(new FlowLayout());
	}
	
	private void layoutOfFrame()
	{
		setLayout(new BorderLayout());
		add(addresBox, BorderLayout.NORTH);
		
		buttonPanels.add(buttons[0]);
		buttonPanels.add(buttons[1]);
		//buttonPanels.setPreferredSize(new Dimension(500, 0));
		//buttonPanels.setSize(500, 10);
		
		textPanel.add(inputBox);
		textPanel.add(outputBox);
		
		thePanels.add(textPanel, BorderLayout.CENTER);
		thePanels.add(buttonPanels, BorderLayout.SOUTH);
		//thePanels.add(outputBox);
		
		add(thePanels, BorderLayout.CENTER);
	}
}
