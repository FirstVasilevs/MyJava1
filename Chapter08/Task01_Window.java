package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task01_Window extends JFrame {

    public static void main(String[] args) {

        Task01_Window gui = new Task01_Window();

    }

    JPanel pnl = new JPanel();


    public Task01_Window() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);
    }


}
