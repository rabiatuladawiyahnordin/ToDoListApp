package classes;

import java.awt.*;

import javax.swing.*;

public class Category extends JPanel {

    JLabel index;
    JTextField categoryName;
    JButton addNew;
    JButton remove;

    Color bColor = new Color(211, 202, 165);
    Color rColor = new Color(166, 153, 107);

    private boolean checked;

    Category() {
        this.setPreferredSize(new Dimension(400, 20));//size of category
        this.setBackground(bColor);//set background color of category

        this.setLayout(new BorderLayout()); //set layout of category

        checked = false;

        index = new JLabel(" CATEGORY: "); //create index label
        index.setFont(new Font("Monospaced",Font.PLAIN, 16));
        index.setPreferredSize(new Dimension(120, 20)); //set size of index label
        index.setHorizontalAlignment(JLabel.CENTER); //set alignment of index label
        this.add(index, BorderLayout.WEST); //add index label to task

        categoryName = new JTextField(""); //create task name text field
        categoryName.setBorder(BorderFactory.createEmptyBorder()); //remove border of text field
        categoryName.setFont(new Font("Monospaced",Font.PLAIN, 16));
        categoryName.setBackground(bColor); //set background color of text field


        this.add(categoryName, BorderLayout.CENTER);

        addNew = new JButton("Remove");
        addNew.setFont(new Font("Monospaced",Font.PLAIN, 16));
        addNew.setPreferredSize(new Dimension(80, 20));
        addNew.setBorder(BorderFactory.createEmptyBorder());
        addNew.setBackground(rColor);
        addNew.setFocusPainted(false);
        this.add(addNew, BorderLayout.EAST);

    }

    public JButton getAddNew() {
        return addNew;
    }

    public JButton getRemove(){
        return remove;
    }

    public boolean getState() {
        return checked;
    }
}