package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task07_Sound extends JFrame implements ActionListener {

    public static void main(String[] args) {

        Task07_Sound gui = new Task07_Sound();

    }

    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader();
    java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("music.wav"));
    JButton playBtn = new JButton("Играть");
    JButton stopBtn = new JButton("Стоп");


    public Task07_Sound() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(playBtn);
        pnl.add(stopBtn);

        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == playBtn)
            audio.play();
        if (event.getSource() == stopBtn)
            audio.stop();

    }
}
