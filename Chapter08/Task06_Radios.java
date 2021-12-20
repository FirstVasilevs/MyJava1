package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task06_Radios extends JFrame{

    public static void main(String[] args) {

        Task06_Radios gui = new Task06_Radios();

    }

    JPanel pnl = new JPanel();

    JRadioButton rad1 = new JRadioButton( "Красное" , true ) ;
    JRadioButton rad2 = new JRadioButton( "Розовое" ) ;
    JRadioButton rad3 = new JRadioButton( "Белое"  ) ;

    ButtonGroup wines = new ButtonGroup() ;


    public Task06_Radios() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        wines.add(rad1);
        wines.add(rad2);
        wines.add(rad3);

        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(rad3);
    }

}
