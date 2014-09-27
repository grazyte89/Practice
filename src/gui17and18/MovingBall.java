package gui17and18;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingBall extends JFrame{
	
	private JButton button1;
	private JPanel panel1;
	
	public MovingBall()
	{
		super("Bouncing Ball");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		intialiseData();
		layoutm();
		actionssss();
	}
	
	private void intialiseData()
	{
		button1 = new JButton("start");
		panel1 = new JPanel();
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
	}

	private class actionL implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Runner tuni = new Runner();
			tuni.start();
		}
	}
	
	private class Runner extends Thread {
		
		private Random numberGen = new Random();
		Graphics ball12 = panel1.getGraphics();
		
		public void run() {
			while (true) 
			{
				int location1 = numberGen.nextInt(700);
				int location2 = numberGen.nextInt(700);
				
				if((location1 > 100 && location1 < 250) && (location2 > 100 && location2 < 250))
				{
					ball12.fillOval(location1, location2, 50, 50);
					repaint();
				}
				/*else
				{
					try
					{
						Thread.sleep(5);
					}
					catch(InterruptedException e)
					{
						System.exit(0);
					}
				}*/
			}

		}
	}
}
