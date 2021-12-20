package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;
import java.awt.*;

public class Task08_Layout extends  JFrame{

    public static void main(String[] args) {

        Task08_Layout gui = new Task08_Layout();

    }

    JPanel pnl = new JPanel();

    Container contentPane = getContentPane();
    JPanel grid = new JPanel(new GridLayout(2, 2));


    public Task08_Layout() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(new JButton("Да"));
        pnl.add( new JButton( "Нет" ) ) ;
        pnl.add( new JButton( "Отмена" ) ) ;
        grid.add( new JButton( "1" ) ) ;
        grid.add( new JButton( "2" ) ) ;
        grid.add( new JButton( "3" ) ) ;
        grid.add( new JButton( "4" ) ) ;

        contentPane.add( "North" , pnl ) ;
        contentPane.add( "Center" , grid ) ;
        contentPane.add( "West" , new JButton( "Запад" ) ) ;
        contentPane.add( "East" , new JButton("Восток") ) ;

    }

}
