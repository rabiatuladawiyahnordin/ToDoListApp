package classes;

import com.toedter.calendar.JDateChooser;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class Calendar extends JPanel {

    private JPanel pane;
    private JDateChooser dc;
    public Calendar(){

        prepareLayout();

        setVisible(true);
    }
    public void prepareLayout(){

        dc = new JDateChooser();

        //Layout, Column, Row
        pane = new JPanel(new MigLayout("CENTER","", ""));
        pane.add(dc, "width 120, height 20, wrap");

        add(pane);
    }
}

