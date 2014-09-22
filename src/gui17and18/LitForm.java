package gui17and18;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LitForm extends JFrame{
	
	private JTextField addresBox;
	private JTextArea inputBox;
	private JTextArea outputBox;
	private JButton[] buttons;
	private JLabel[] theLabels;
	private BufferedReader outPutBoxStreamLine;
	private BufferedWriter inPutStreamLine;
	//private Scanner outPutBoxStreamLine1;
	//private PrintWriter inPutStreamLine1;
	
	public LitForm()
	{
		super("zeroJava Doc");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 550);
		intiliasingVar();
		giveValuetoVar();
		layoutOfFrame();
		buttonVisableState(false, false);
		buttonAction();
	}
	
	private void intiliasingVar()
	{
		addresBox = new JTextField(70); 
		inputBox = new JTextArea(10, 70);
		outputBox = new JTextArea(10, 70);
		buttons = new JButton[5];
		theLabels = new JLabel[5];
		inPutStreamLine = null;
		outPutBoxStreamLine = null;
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
	
	private void buttonVisableState(boolean b1, boolean b2)
	{
		buttons[1].setVisible(b1);
		buttons[2].setVisible(b2);
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
	
	private void buttonAction()
	{
		buttons[0].addActionListener(new ButtonAction());
		buttons[1].addActionListener(new ButtonAction());
		buttons[2].addActionListener(new ButtonAction());
	}
	
	private void connectTo() throws IOException
	{
		JFileChooser path = new JFileChooser();
		path.showOpenDialog(null);
		File filePath = path.getSelectedFile();
		String pathLead = filePath.getAbsolutePath();
		
		try
		{
			//outPutBoxStreamLine1 = new Scanner(new FileInputStream(pathLead));
			//inPutStreamLine1 = new PrintWriter(new FileOutputStream(addresBox.getText()));
			//inPutStreamLine = new PrintWriter(new FileOutputStream(pathLead, true));
			outPutBoxStreamLine = new BufferedReader(new FileReader(filePath));
			inPutStreamLine = new BufferedWriter(new FileWriter(filePath));
			addresBox.setText(pathLead);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		buttonVisableState(true, false);
	}
	
	private void writeToPut() throws IOException
	{
		//String text = inputBox.getText();
		//inPutStreamLine.println(text);
		inputBox.write(inPutStreamLine);
		inPutStreamLine.close();
		buttonVisableState(false, true);
	}
	
	private void loadOutput() throws IOException
	{
		//String i = outPutBoxStreamLine.nextLine();
		//outputBox.setText(i);
		outputBox.read(outPutBoxStreamLine, null);
		outPutBoxStreamLine.close();
		buttonVisableState(false, false);
	}
	
	private class ButtonAction implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("ConnectToFile"))
			{
				try 
				{
					connectTo();
				} 
				catch (IOException e1) 
				{
					System.out.println(e1.getMessage());
					System.exit(0);
				}
				//System.out.println("successful");
			}
			if(e.getActionCommand().equals("WriteToFile"))
			{
				try 
				{
					writeToPut();
				} 
				catch (IOException e1) 
				{
					System.out.println(e1.getMessage());
					System.exit(0);
				}
			}
			if(e.getActionCommand().equals("LoadFromFile"))
			{
				try 
				{
					loadOutput();
				} 
				catch (IOException e1) 
				{
					System.out.println(e1.getMessage());
					System.exit(0);
				}
			}
			
		}
	}
}
