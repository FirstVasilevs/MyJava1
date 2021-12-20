package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task04_TextFields extends JFrame{

    JPanel pnl = new JPanel();


    public static void main(String[] args) {

        Task04_TextFields gui = new Task04_TextFields();

    }

    JTextField txt1 = new JTextField(38);
    JTextField txt2 = new JTextField("Техт по умолчанию", 38);
    JTextArea txtArea;

    {
        txtArea = new JTextArea(5, 37);
    }

    JScrollPane pane = new JScrollPane(txtArea);



    public Task04_TextFields() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pnl.add(txt1);
        pnl.add(txt2);
        pnl.add(pane);
    }

}
