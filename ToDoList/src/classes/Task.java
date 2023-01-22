package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Task extends JPanel{

	Color lgreen = new Color(209, 238, 182);
	Color dGreen = new Color(150, 180, 131);
	Color lRed = new Color(229, 163, 163);
	Color dRed = new Color(215, 111, 111);

	JLabel index;
	JTextField taskName;
	JButton done;

	Calendar cal = new Calendar();

	private boolean checked;
	
	Task()
	{
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.white);
		
		this.setLayout(new BorderLayout());
		
		checked = false;

		index = new JLabel(" + "); //create index label
		index.setBackground(Color.white);
		index.setFont(new Font("Monospaced",Font.PLAIN, 14));
		index.setPreferredSize(new Dimension(40,20)); //set size of index label
		index.setHorizontalAlignment(JLabel.CENTER); //set alignment of index label
		//this.add(index,BorderLayout.WEST); //add index label to task

		taskName = new JTextField(" + "); //create task name text field
		taskName.setFont(new Font("Monospaced",Font.PLAIN, 14));
		taskName.setBorder(BorderFactory.createEmptyBorder()); //remove border of text field
		taskName.setBackground(lRed); //set background color of text field
		
		this.add(taskName,BorderLayout.CENTER);
		this.add(cal,BorderLayout.WEST);
		cal.setBackground(Color.white);

		done = new JButton("Done");
		done.setFont(new Font("Monospaced",Font.PLAIN, 14));
		done.setPreferredSize(new Dimension(80,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(dRed);
		done.setFocusPainted(false);
		
		this.add(done,BorderLayout.EAST);
		
	}
	
	public void changeIndex(int num)
	{
		this.index.setText(" " + num +". ");
		this.revalidate();
	}
	
	
	public JButton getDone()
	{
		return done;
	}
	
	public boolean getState()
	{
		return checked;
	}
	
	public void changeState()
	{
		this.setBackground(lgreen);
		done.setBackground(dGreen);
		index.setBackground(lgreen);
		taskName.setBackground(lgreen);
		checked = true;
		revalidate();
	}
}
