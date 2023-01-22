package classes;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{

	TitleBar()
	{

		this.setPreferredSize(new Dimension(500,60)); //size of the title bar
		this.setBackground(Color.white); //color of the title bar
		JLabel titleText = new JLabel("My To-Do List :)"); //text of the title bar
		titleText.setPreferredSize(new Dimension(200,50)); //size of the text
		titleText.setFont(new Font("Monospaced",Font.BOLD, 20)); //font of the text
		titleText.setHorizontalAlignment(JLabel.CENTER); //align the text to the center
		this.add(titleText); //add text to the title bar
	}
}