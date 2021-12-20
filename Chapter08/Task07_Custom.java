package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;
import java.awt.*;

public class Task07_Custom extends JFrame{

    public static void main(String[] args) {

        Task07_Custom gui = new Task07_Custom();

    }

    JPanel pnl = new JPanel();
    JLabel lbl1 = new JLabel( "Пользовательский задний фон" ) ;
    JLabel lbl2 = new JLabel( "Пользовательский передний фон" ) ;
    JLabel lbl3 = new JLabel( "Пользовательский шрифт" ) ;

    Color customColor = new Color(255,0,0);
    Font customFont = new Font("Serif", Font.PLAIN,32);


    public Task07_Custom() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        lbl1.setOpaque(true);
        lbl1.setBackground(Color.YELLOW);
        lbl2.setForeground(customColor);
        lbl3.setFont(customFont);

        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);
    }

}
