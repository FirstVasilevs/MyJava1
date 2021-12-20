package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task03_Labels extends JFrame{

    JPanel pnl = new JPanel();


    public static void main(String[] args) {

        Task03_Labels gui = new Task03_Labels();
    }

    ImageIcon tick = new ImageIcon("tick.png");
    ImageIcon cross = new ImageIcon("cross.png");

    JButton btn = new JButton("Нажми меня");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("СТОП", cross);

    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL tickURL = ldr.getResource("tick.png");
    java.net.URL crossURL = ldr.getResource("cross.png");

    ImageIcon duke = new ImageIcon("duke.png");
    //ImageIcon duke = new ImageIcon(ldr.getResource("duke.png"));// необходимо изображение
    JLabel lbl1 = new JLabel(duke);
    JLabel lbl2 = new JLabel("Дюк - талисман технологии Java.");
    JLabel lbl3 = new JLabel("Дюк", duke,JLabel.CENTER);




    public Task03_Labels() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);
       // lbl3.getHorizontalTextPosition(JLabel.CENTER); // надо выяснить
        lbl3.setVerticalTextPosition( JLabel.BOTTOM ) ;

        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);

        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);

        lbl1.setToolTipText("Дюк - талисман технологии Java");

    }
}
