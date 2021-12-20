package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Task03_Keystrokes extends JFrame implements KeyListener {

    public static void main(String[] args) {

        Task03_Keystrokes gui = new Task03_Keystrokes();

    }

    JPanel pnl = new JPanel();
    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5, 38);


    public Task03_Keystrokes() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(field);
        pnl.add(txtArea);

        field.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent event) {
        txtArea.append("\nСимвол : " + event.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent event) {
        txtArea.setText("Нажата клавиша");
    }

    @Override
    public void keyReleased(KeyEvent event) {
        int keyCode = event.getKeyCode();
        txtArea.append("\nКод клавиши : " + event.getKeyCode());
        txtArea.append("\nТекст клавиши : " + event.getKeyText(keyCode));
    }
}