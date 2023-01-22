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
	
	JLabel index;
	JTextField taskName;
	JButton done;
	
	private boolean checked;

	Color lGreen = new Color(209, 238, 182);
	Color dGreen = new Color(150, 180, 131);
	Color lRed = new Color(229, 163, 163);
	Color dRed = new Color(215, 111, 111);

	Calendar cal = new Calendar();
	
	Task()
	{
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.white);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel(" + ");
		index.setBackground(Color.white);
		index.setFont(new Font("Monospaced",Font.PLAIN, 14));
		index.setPreferredSize(new Dimension(40,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		//this.add(index,BorderLayout.WEST);
	
		taskName = new JTextField(" + ");
		taskName.setFont(new Font("Monospaced",Font.PLAIN, 14));
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(lRed);

		
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
		this.index.setText(" " + num+". ");
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
		this.setBackground(lGreen);
		done.setBackground(dGreen);
		index.setBackground(lGreen);
		taskName.setBackground(lGreen);
		checked = true;
		revalidate();
	}
}
