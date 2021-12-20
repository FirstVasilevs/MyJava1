package ru.ereshchenko.MyJava.Chapter08;

import javax.swing.*;

public class Task05_Items extends JFrame{

    public static void main(String[] args) {

        Task05_Items gui = new Task05_Items();//ВСЕ ЕЩЕ НЕ ПОНЯТНО

    }

    JPanel pnl = new JPanel();

    String[] toppings = {"Пеперони", "Грибная", "С ветчиной", "Томатная"};

    JCheckBox chk1 = new JCheckBox( toppings[0], true) ;
    JCheckBox chk2 = new JCheckBox( toppings[1] ) ;
    JCheckBox chk3 = new JCheckBox( toppings[2] ) ;
    JCheckBox chk4 = new JCheckBox( toppings[3] ) ;

    String[] styles = { "В глубокой форме" , "Для гурманов" , "Тонкая" } ;

    JComboBox<String> box1 = new JComboBox<String>( styles ) ;
    JList<String> lst1 = new JList<String>( toppings ) ;



    public Task05_Items() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(chk1);
        pnl.add(chk2);
        pnl.add(chk3);
        pnl.add(chk4);

        box1.setSelectedIndex(0);
        pnl.add(lst1);
    }
}
