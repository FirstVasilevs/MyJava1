package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Task04_Mouse extends JFrame implements MouseListener, MouseMotionListener {

    public static void main(String[] args) {

        Task04_Mouse gui = new Task04_Mouse();

    }

    JPanel pnl = new JPanel();
    JTextArea txtArea = new JTextArea(8, 38);
    int x, y;


    public Task04_Mouse() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(txtArea);
        txtArea.addMouseListener(this);
        txtArea.addMouseMotionListener(this);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        txtArea.append("\nКнопка нажата, когда указатель в позиции Х: " + x + "Y: " + y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        txtArea.append("\nКнопка мыши отпущена");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        txtArea.setText("\nНажата кнопка мыши");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}