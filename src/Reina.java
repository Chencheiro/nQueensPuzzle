//Isaac De la Cruz López

public class Reina {
    Manejador manejador;
    Reina padre, hijo;
    int id, fila;

    public Reina(Manejador manejador, Reina padre, int id){
        this.manejador = manejador;
        this.padre = padre;
        this.id = id;
        this.fila = 0;
        this.preguntar();
    }

    public Reina(Reina reina){
        this.id = reina.id;
        this.fila = reina.fila;
        this.padre = null;
        this.hijo = null;
        this.manejador = null;
    }

    /*private void borrar(){
        System.out.println(this);
        if(this.padre != null){
            this.padre.borrar();
        }
    }*/

    private void validar(){ //Valida si crea una nueva reina
        if (this.id == this.manejador.getN()-1){
            this.manejador.solucionEncontrada(this);
            //this.borrar();
            System.out.println();
        }
        else {
            this.hijo = new Reina(this.manejador, this, this.id+1);
        }
    }

    public void preguntar(){
        if (this.padre == null){
            this.validar();
        }
        else {
            if (padre.responder(this) == true){
                this.validar();
            }
        }
        this.fila++;
        if (this.fila != this.manejador.getN()){
            this.preguntar();
            //System.out.println(this.fila); 4444444
        }
    }

    private boolean validarPosicion(Reina reina){
        if (reina.fila == this.fila) {
            return true;
        }
        //first case: reina.id - this.id == reina.fila - this.fila
        //second case: reina.id - this.id == this.fila - reina.fila
        if (reina.id - this.id == reina.fila - this.fila || reina.id - this.id == this.fila - reina.fila){
            return true;
        }
        return false;
    }

    public boolean responder(Reina reina){
        if (validarPosicion(reina)) {
            return false;
        }
        else if (this.padre == null) {
            return true;
        }
        return this.padre.responder(reina);
    }

    public int getId() {
        return id;
    }

    public int getFila() {
        return fila;
    }

    public String toString() {
        return this.id + ":" + this.fila;
    }
}
