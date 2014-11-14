package gui17and18;

import java.awt.BorderLayout;
import java.awt.Graphics;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
//import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MovingBall extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 972018088658006593L;

	private int speedOfBall = 500;
	
	private JButton button1;
	private JPanel panel1;
	
	private JMenuBar jMenuBar;
	private JMenu jMenu;
	private JMenuItem[] jMenuItem;
	
	public MovingBall()
	{
		super("Bouncing Ball");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		intialiseData();
		setupMenu();
		layoutm();
		actionssss();
	}
	
	private void intialiseData()
	{
		button1 = new JButton("start");
		panel1 = new JPanel();
		
		jMenuBar = new JMenuBar();
		jMenu = new JMenu("Menu");
		jMenuItem = new JMenuItem[3];
	}
	
	private void initialiseMenuItems()
	{
		jMenuItem[0] = new JMenuItem("fast");
		jMenuItem[1] = new JMenuItem("medium");
		jMenuItem[2] = new JMenuItem("slow");
	}
	
	private void setupMenu()
	{
		this.initialiseMenuItems();
		jMenu.add(jMenuItem[0]);
		jMenu.add(jMenuItem[1]);
		jMenu.add(jMenuItem[2]);
		
		jMenuBar.add(jMenu);
		setJMenuBar(jMenuBar);
	}
	
	private void layoutm()
	{
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(button1, BorderLayout.SOUTH);
	}
	
	private void actionssss()
	{
		button1.addActionListener(new actionL());
		
		jMenuItem[0].addActionListener(new speedOfBall());
		jMenuItem[1].addActionListener(new speedOfBall());
		jMenuItem[2].addActionListener(new speedOfBall());
	}

	public int getSpeedOfBall() {
		return speedOfBall;
	}

	public void setSpeedOfBall(int speedOfBall) {
		this.speedOfBall = speedOfBall;
	}

	private class actionL implements ActionListener {

		public void actionPerformed(ActionEvent e) {		
				Runner tuni = new Runner();
				tuni.start();
		}
	}
	
	private class speedOfBall implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) 
			{
			case "fast":
				setSpeedOfBall(1);
				break;
			case "medium":
				setSpeedOfBall(500);
				break;
			case "slow":
				setSpeedOfBall(1000);
				break;
			default: 
				System.out.println("Error");
				break;
			}
		}
	}
	
	private class Runner extends Thread {
		
		private Random numberGen = new Random();
		//Graphics ball12 = panel1.getGraphics();
		Graphics ball12 = getGraphics();
		
		public void run() {
			while (true) 
			{
				int location1 = numberGen.nextInt(700);
				int location2 = numberGen.nextInt(700);
				
				if((location1 > 50 && location1 < 450) && (location2 > 50 && location2 < 450))
				{
					ball12.fillOval(location1, location2, 10, 10);
					//repaint();
				}
				else
				{
					try
					{
						Thread.sleep(getSpeedOfBall());
					}
					catch(InterruptedException e)
					{
						System.exit(0);
					}
				}
			}

		}
	}
}
