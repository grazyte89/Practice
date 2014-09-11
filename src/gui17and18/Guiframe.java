package gui17and18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Guiframe extends JFrame{
	
	private JButton[] buttons;
	private JLabel[] labels;
	private JPanel panel;
	private JMenu formatMenu;
	private JMenuItem[] formatItem;
	private JMenuBar formatBar;
	
	private String title;

	public Guiframe()
	{
		super();
		title("the frame work");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.border(300, 300);
		this.initialIsingStuff();
		//this.givevalueto();
		this.menuLayout();
		this.framesLayout(3);	
	}
	
	private void border(int w, int h)
	{
		this.setSize(300, 300);
	}
	
	private void title(String string)
	{
		this.title = string;
		setTitle(getTitle());
	}
	
	public String getTitle()
	{
		return title;
	}
	
	private void initialIsingStuff()
	{
		panel = new JPanel();
		buttons = new JButton[10];
		labels = new JLabel[10];
		
		formatBar = new JMenuBar();
		formatMenu = new JMenu("Menu");
		formatItem = new JMenuItem[4];
	}
	
	private void givevalueto()
	{
		buttons[0] = new JButton("Exit");
		buttons[1] = new JButton("flow");
		buttons[2] = new JButton("block");
		buttons[3] = new JButton("grid");
		buttons[4] = new JButton("place 1");
		buttons[5] = new JButton("place 2");
		buttons[6] = new JButton("place 3");
		
		labels[0] = new JLabel("label1");
		labels[1] = new JLabel("label2");
		labels[2] = new JLabel("label3");
		labels[3] = new JLabel("label4");
		labels[4] = new JLabel("label5");
	}
	
	private void menuInitilise()
	{
		formatItem[0] = new JMenuItem("Exit");
		formatItem[1] = new JMenuItem("grid");
		formatItem[2] = new JMenuItem("flow");
		formatItem[3] = new JMenuItem("block");
	}
	
	private void menuLayout()
	{
		menuInitilise();
		formatMenu.add(formatItem[0]);
		formatMenu.add(formatItem[1]);
		formatMenu.add(formatItem[2]);
		formatMenu.add(formatItem[3]);
		
		formatBar.add(formatMenu);
		setJMenuBar(formatBar);
	}
	
	private void framesLayout(int i)
	{	
		givevalueto();
		setLayout(new GridLayout(1, 1));
		switch (i)
		{
		case 1:
			panel.setLayout(new GridLayout(6, 6));
			panel.add(labels[0]);
			panel.add(buttons[0]);
			panel.add(buttons[1]);
			panel.add(buttons[2]);
			panel.add(buttons[4]);
			panel.add(buttons[6]);
			break;
		case 2:
			panel.setLayout(new FlowLayout());
			panel.add(labels[0]);
			panel.add(buttons[0]);
			panel.add(buttons[3]);
			panel.add(buttons[2]);
			panel.add(labels[1]);
			panel.add(labels[2]);
			panel.add(labels[3]);
			panel.add(labels[4]);
			break;
		case 3:
			panel.setLayout(new BorderLayout());
			panel.add(buttons[0], BorderLayout.NORTH);
			panel.add(buttons[1], BorderLayout.EAST);
			panel.add(buttons[3], BorderLayout.SOUTH);
			panel.add(buttons[4], BorderLayout.WEST);
			panel.add(buttons[5], BorderLayout.CENTER);
			break;
		}
		add(panel);
		this.actionsss();
	}
	
	private void removalof()
	{
		panel.removeAll();
		remove(panel);
	}
	
	private void changefram(int i)
	{
		this.removalof();
		this.framesLayout(i);
		revalidate();
		repaint();
	}
	
	private void actionsss()
	{
		buttons[0].addActionListener(new Actlisten());
		buttons[1].addActionListener(new Statebuttons());
		buttons[2].addActionListener(new Statebuttons());
		buttons[3].addActionListener(new Statebuttons());
		
		formatItem[0].addActionListener(new Actlisten());
		formatItem[1].addActionListener(new Statebuttons());
		formatItem[2].addActionListener(new Statebuttons());
		formatItem[3].addActionListener(new Statebuttons());
	}
	
	private class Actlisten implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//title("knvkfndvklfdnklvn");
			System.exit(0);
		}
	}
	
	private class Statebuttons implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			
			switch(e.getActionCommand())
			{
			case "flow":
				changefram(2);
				title("Flowlayout");
				break;
			case "block":
				changefram(3);
				title("Blocklayout");
				break;
			case "grid":
				changefram(1);
				title("Gridlayout");
				break;
			}
			
		}
		
	}
}
