//Isaac De la Cruz López

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(Manejador manejador){
        super("'N' Queens puzzle");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Panel panel = new Panel(manejador);
        this.add(panel);
        this.add(new Controls(manejador, panel), BorderLayout.NORTH);
        this.pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Manejador m = new Manejador(5);
        System.out.println(m);
        Frame frame = new Frame(m);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
