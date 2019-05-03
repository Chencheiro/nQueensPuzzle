//Isaac De la Cruz López

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Manejador manejador;

    public Panel(Manejador manejador){
        this.setPreferredSize(new Dimension(800, 800));
        this.manejador = manejador;
    }

    public void paint(Graphics g){
        manejador.dibujaSolucion(g);
    }

    public void setManejador(Manejador manejador){
        this.manejador = manejador;
    }

}
