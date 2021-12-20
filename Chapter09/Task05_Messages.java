package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task05_Messages extends JFrame implements ActionListener {

    public static void main(String[] args) {

        Task05_Messages gui = new Task05_Messages();

    }

    JPanel pnl = new JPanel();

    JButton btn1 = new JButton("Показать информационное сообщение");
    JButton btn2 = new JButton("Показать предупрежджение");
    JButton btn3 = new JButton("Показать сообщение об ошибке");


    public Task05_Messages() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btn1)
            JOptionPane.showMessageDialog(this, "Информация...",
                    "Диалоговое сообщение", JOptionPane.INFORMATION_MESSAGE);
        if (event.getSource() == btn2)
            JOptionPane.showMessageDialog(this, "Информация...",
                    "Диалоговое сообщение", JOptionPane.WARNING_MESSAGE);
        if (event.getSource() == btn3)
            JOptionPane.showMessageDialog(this, "Информация...",
                    "Диалоговое сообщение", JOptionPane.ERROR_MESSAGE);
    }
}
