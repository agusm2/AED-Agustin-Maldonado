package tdaElemento;

public class TDAElemento<T> {

    private Comparable etiqueta;
    private T datos;
    private TDAElemento siguiente;

    public TDAElemento(Comparable etiqueta, T datos){
        this.etiqueta = etiqueta;
        this.datos = datos;
        this.siguiente = null;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public TDAElemento<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(TDAElemento<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDatos() {
        return datos;
    }

}
