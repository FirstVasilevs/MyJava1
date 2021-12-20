package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task02_Buttons extends JFrame {



    JPanel pnl = new JPanel();


    public static void main(String[] args) {

        Task02_Buttons gui = new Task02_Buttons();

    }

    ImageIcon tick = new ImageIcon("tick.png"); //незаконная пересылка
    ImageIcon cross = new ImageIcon("cross.png"); //незаконная пересылка

    JButton btn = new JButton("Нажми меня");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("СТОП", cross);

    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL tickURL = ldr.getResource("tick.png"); //незаконная пересылка
    java.net.URL crossURL = ldr.getResource("cross.png"); //незаконная пересылка


    public Task02_Buttons() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);
    }


}
