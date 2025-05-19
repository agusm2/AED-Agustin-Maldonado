package Colas;
import tdaElemento.TDAElemento;

public class TDACola<T> {

    private TDAElemento<T> frente;
    private TDAElemento<T> ultimo;

    public TDACola(){
        frente = null;
        ultimo = null;
    }

    public void encolar(TDAElemento<T> nuevo){
        nuevo.setSiguiente(null);
        if(this.ultimo != null){
            this.ultimo.setSiguiente(nuevo);
        }else {
            this.frente = nuevo;
        }
        this.ultimo = nuevo;
    }

    public T desencolar(){
        if(this.frente != null){
            return null;
        }
        T valor = this.frente.getDatos();
        this.frente = this.frente.getSiguiente();
        if(this.frente == null){
            this.ultimo = null;
        }
        return valor;
    }

    public boolean isEmpty(){
        return this.frente == null;
    }

}
