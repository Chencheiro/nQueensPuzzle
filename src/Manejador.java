//Isaac De la Cruz López

import java.awt.*;

public class Manejador {
    int n;
    Soluciones soluciones;

    public Manejador(int n){
        this.n = n;
        soluciones = new Soluciones(n);
        Reina r = new Reina(this, null, 0);
    }

    public void solucionEncontrada(Reina reina){
        this.soluciones.incrementSoluciones();
        this.almacenarReina(reina);
        this.soluciones.incrementSolutionIndex();
    }

    public void almacenarReina(Reina reina){
        //System.out.println(reina);
        soluciones.almacenarEnArreglo(reina);
        if(reina.padre != null){
            this.almacenarReina(reina.padre);
        }
    }

    public void dibujaTablero(Graphics g){
        int size = 800/n;
        boolean color = false;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (!color){
                    g.setColor(new Color(240,247,238));
                    color = !color;
                }
                else {
                    g.setColor(new Color(135,187,162));
                    color = !color;
                }
                g.fillRect(size*j, size*i, size, size);
            }
            if (n%2 == 0){
                color = !color;
            }
        }
    }

    public void dibujaFicha(Graphics g, int x, int y){
        int size = 800/n;
        g.setColor(new Color(93,115,126));
        g.fillOval(size/4+(size*x), size/4+(size*y), size/2, size/2);
    }

    public void dibujaSolucion(Graphics g){
        this.dibujaTablero(g);
        for (int j = 0; j < soluciones.indexReina; j++) {
            //pos = soluciones.soluciones[soluciones.current][j].split(":");
            this.dibujaFicha(g, soluciones.soluciones[soluciones.current][j].id, soluciones.soluciones[soluciones.current][j].fila);
        }
    }

    public String toString(){
        return this.n + " reinas pueden acomodarse en el tablero de " + this.soluciones.getNumSoluciones() + " maneras";
    }

    public int getN() {
        return n;
    }

    public void setN(int n){
        new Manejador(n);
    }

    /*public static void main(String[] args) {
        //Soluciones s = new Soluciones(5);
        //Manejador m = new Manejador(4);
        //System.out.println(m.soluciones);
        //System.out.println(m);
    }*/
}