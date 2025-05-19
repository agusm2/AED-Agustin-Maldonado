package Pilas;

import tdaElemento.TDAElemento;

public class TDAPila<T> {

    private TDAElemento<T> tope;

    public void push(TDAElemento<T> nuevo){
        nuevo.setSiguiente(this.tope);
        this.tope = nuevo;
    }

    public T pop(){
        if(this.tope == null){
            return null;
        }
        T valor = this.tope.getDatos();
        this.tope = this.tope.getSiguiente();
        return valor;
    }

    public T peek(){
        if(this.tope == null){
            return null;
        }
        return this.tope.getDatos();
    }

    public boolean isEmpty(){
        return this.tope == null;
    }

    public void clear(){
        this.tope = null;
    }
}
