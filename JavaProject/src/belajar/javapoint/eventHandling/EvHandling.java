package belajar.javapoint.eventHandling;

import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvHandling extends Frame implements ActionListener {

    TextField tf, addres;

    EvHandling(){

        //create component
        tf = new TextField();
        addres = new TextField();
        tf.setBounds(60,50,170,20);
        addres.setBounds(60, 80, 170, 20);
        Button b = new Button("Click Me");
        Checkbox cb = new Checkbox("Jenis Kelamin");
        cb.setBounds(60, 100, 170, 20);
        b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this); // passing current instance

        // add components and set size, layout and visibility
        add(b);
        add(tf);
        add(addres);
        add(cb);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new EvHandling();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
        addres.setText("Nowa Kab. Dompu");

    }
}
