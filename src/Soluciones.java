//Isaac De la Cruz López

public class Soluciones {
    Reina soluciones[][];
    protected int current, numSoluciones, indexReina, indexSolucion;

    public Soluciones(int n){
        this.soluciones = new Reina[1000000][n];//
        this.numSoluciones = 0;
        this.current = 0;
    }

    public Reina[] getNext(){
        if (current == this.numSoluciones-1){
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

    public void incrementSolutionIndex(){
        this.indexSolucion ++;
    }

    public void incrementSoluciones(){
        this.numSoluciones++;
        this.indexReina = 0;
    }

    public void almacenarEnArreglo(Reina reina){
        //System.out.println(reina);
        //System.out.println(indexSolucion + ", " + indexReina + " = " + id+":"+fila);
        this.soluciones[indexSolucion][indexReina] = new Reina(reina);
        indexReina ++;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.indexSolucion; i++) {
            for (int j = 0; j < this.indexReina; j++) {
                res += this.soluciones[i][j] + ", ";
            }
            res += "\n";

        }
        return res;
    }
}
