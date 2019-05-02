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

    public void dibujaSolucion(Graphics g){

    }

    public String toString(){
        return this.n + " reinas pueden acomodarse en el tablero de " + this.soluciones.getNumSoluciones() + " maneras";
    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        //Soluciones s = new Soluciones(5);
        Manejador m = new Manejador(4);
        System.out.println(m.soluciones);
    }
}