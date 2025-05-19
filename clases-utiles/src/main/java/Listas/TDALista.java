package Listas;

import tdaElemento.TDAElemento;

public class TDALista<T> {

    private TDAElemento<T> cabeza;

    public TDALista(){
        cabeza = null;
    }

    public void insertarInicio(TDAElemento<T> nuevo){
        nuevo.setSiguiente(this.cabeza);
        this.cabeza = nuevo;
    }

    public void insertarFinal(TDAElemento<T> nuevo){
        if(this.cabeza == null){
            this.cabeza = nuevo;
        }else {
            TDAElemento<T> actual = this.cabeza;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void eliminar(T etiqueta){
        TDAElemento<T> actual = this.cabeza;
        TDAElemento<T> anterior = null;

        while (actual != null && !actual.getDatos().equals(etiqueta)){
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if(actual != null){
            if(anterior == null){
                this.cabeza = actual.getSiguiente();
            }else {
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
    }
}
