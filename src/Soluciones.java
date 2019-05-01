public class Soluciones {
    Reina soluciones[][];
    private int current, numSoluciones;

    public Soluciones(int n){
        this.soluciones = new Reina[20000000][n];//
        this.numSoluciones = 0;
        this.current = 0;
    }

    public Reina[] getNext(){
        if (current == this.soluciones.length-1){
            return soluciones[current];
        }
        else {
            return soluciones[current++];
        }

    }

    public Reina[] getPrev(){
        if (current == 0){
            return soluciones[current];
        }
        else {
            return soluciones[current--];
        }
    }

    public int getNumSoluciones() {
        return numSoluciones;
    }

    public void incrementSoluciones(){
        this.numSoluciones++;
    }
}
