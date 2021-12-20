package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task06_Request extends JFrame implements ActionListener {

    public static void main(String[] args) {

        Task06_Request gui = new Task06_Request();

    }

    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JButton btn1 = new JButton("Запрос подтверждения");
    JButton btn2 = new JButton("Запрос ввода");



    public Task06_Request() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(field);
        pnl.add(btn1);
        pnl.add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btn1) {
            int n = JOptionPane.showConfirmDialog(this, "Вы согласны?",
                    "Диалог подтверждения", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (n) {
                case 0 : field.setText("Согласен");
                break;
                case 1 : field.setText("Не согласен");
                break;
                case 2 : field.setText("Отменено");
                break;
            }
        }
        if (event.getSource() == btn2)
            field.setText(JOptionPane.showInputDialog(this,
                    "Введите ваш комментарий", "Диалог ввода",
                    JOptionPane.PLAIN_MESSAGE));
    }

















}
