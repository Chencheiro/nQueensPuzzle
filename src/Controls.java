//Isaac De la Cruz López

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controls extends JPanel {
    private Manejador manejador;
    private Panel panel;
    private JTextField tfN;
    private JLabel title, solucionesLabel;
    private JButton setN, prev, next;

    public Controls(Manejador manejador, Panel panel){
        super();
        this.manejador = manejador;
        this.panel = panel;
        this.setPreferredSize(new Dimension(800, 45));
        this.setBackground(Color.black);

        this.title = new JLabel("'N' Queens Puzzle");
        this.title.setForeground(Color.white);
        this.add(this.title);

        this.tfN = new JTextField(10);
        this.add(this.tfN);

        this.setN = new JButton("Go!");
        this.setN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int value = Integer.parseInt(Controls.this.tfN.getText());
                    cambiarManejador(value);
                    Controls.this.soluciones();
                    Controls.this.panel.repaint();
                }
                catch (Exception | StackOverflowError ex){

                }
            }
        });
        this.add(setN);

        this.solucionesLabel = new JLabel("Soluciones: "+this.manejador.soluciones.getNumSoluciones());
        this.solucionesLabel.setForeground(Color.white);
        this.add(this.solucionesLabel);

        this.prev = new JButton("Prev");
        this.prev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Controls.this.manejador.soluciones.getPrev();
                Controls.this.getPrev();
                Controls.this.panel.repaint();
            }
        });
        this.add(prev);

        this.next = new JButton("Next");
        this.next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //manejador.soluciones.getNext();
                Controls.this.getNext();
                Controls.this.panel.repaint();
            }
        });
        this.add(next);
    }

    public void cambiarManejador(int n){
        this.manejador = new Manejador(n);
        System.out.println(this.manejador);
        this.panel.setManejador(manejador);
    }

    public void getNext(){
        this.manejador.soluciones.getNext();
    }

    public void getPrev(){
        this.manejador.soluciones.getPrev();
    }

    public void soluciones(){
        this.solucionesLabel.setText("Soluciones: "+this.manejador.soluciones.getNumSoluciones());
    }
}
