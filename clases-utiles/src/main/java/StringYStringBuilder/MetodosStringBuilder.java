package StringYStringBuilder;

public class MetodosStringBuilder {
    public static void main(String[] args) {
        //Constructores StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("hola");
        StringBuilder stringBuilder3 = new StringBuilder(10);

        //Establece el largo del sb
        stringBuilder2.setLength(10);

        //Devuelve true o false si la capacidad es la pasada como parámetro
        stringBuilder2.ensureCapacity(10);

        //Añade el string al sb
        stringBuilder2.append(" world");
        System.out.println(stringBuilder2);

        //Borra la cadena en el rango pasado, no incluye al ultimo numero
        stringBuilder2.delete(2, 5);
        System.out.println(stringBuilder2);

        //Elimina al carácter con el indice que se paso como parametro
        stringBuilder2.deleteCharAt(1);
        System.out.println(stringBuilder2);

        //Inserta el string pasado en el indice que se pasa
        stringBuilder2.insert(3, "hola");
        System.out.println(stringBuilder2);

        //Invierte al sb
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }
}
