package classes;

import java.awt.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

class RoundBtn implements Border{

	private int r;
	RoundBtn(int r){ this.r = r;}

	public Insets getBorderInsets(Component c){ return new Insets(this.r+1, this.r+1, this.r+2, this.r+2);}

	public boolean isBorderOpaque(){return true;}

	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
		g.drawRoundRect(x, y, width-1, height-1, r, r);
	}
}

public class Footer extends JPanel{

	JButton addTask;
	JButton clear;

	JButton addCategory;

	Color bColor = new Color(211, 202, 165);
	Border emptyBorder = BorderFactory.createEmptyBorder();

	Footer()
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.white);

		addTask = new JButton("Add Task"); //add task button
		addTask.setBorder(emptyBorder); //remove border
		addTask.setFont(new Font("Monospaced",Font.PLAIN, 16)); //set font
		addTask.setVerticalAlignment(JButton.BOTTOM); //align text to bottom
		addTask.setBackground(bColor); //set background color
		addTask.setBorder(new RoundBtn(7));
		this.add(addTask); //add to footer

		this.add(Box.createHorizontalStrut(20));//Space between buttons

		addCategory = new JButton("Add Category"); //clear button
		addCategory.setFont(new Font("Monospaced",Font.PLAIN, 16)); //set font
		//clear.setBorder(emptyBorder); //remove border
		addCategory.setBackground(bColor); //set background color
		addCategory.setBorder(new RoundBtn(7));
		this.add(addCategory); //add to footer

		this.add(Box.createHorizontalStrut(20));

		clear = new JButton("Clear Completed Tasks"); //clear button
		clear.setFont(new Font("Monospaced",Font.PLAIN, 16)); //set font
		//clear.setBorder(emptyBorder); //remove border
		clear.setBackground(bColor); //set background color
		clear.setBorder(new RoundBtn(7));
		this.add(clear); //add to footer

	}

	public JButton getNewTask(){
		return addTask;
	}

	public JButton getClear() {
		return clear;
	}

	public JButton getNewCategory(){return addCategory;}
}