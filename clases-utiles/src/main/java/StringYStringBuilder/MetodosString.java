package StringYStringBuilder;

public class MetodosString {
    static String cadena = "Helloworld!";
    static String cadena2 = "hola,chau,buenas";

    public static void main(String[] args) {
        // Devuelve una subcadena que inicia en el caracter pasado como parametro
        System.out.println(cadena.substring(3));

        //Lo mismo, pero inicia en el primer parametro y termina en el segundo (no incluye)
        System.out.println(cadena.substring(3, 6));

        //Crear un arreglo de las palabras separadas por la coma
        // si le paso un limite, lo divide limite - 1 veces, si le paso un 2, solo separa la primera palabra y las
        // otras dos quedan juntas
        String[] palabras = cadena2.split(",");
        for(String palabra : palabras)
            System.out.println(palabra);

        //Parecido a substring pero devuelve una cadena de caracteres
        System.out.println(cadena.subSequence(2, 6));

        //Remueve los espacios en blanco al final y al inicio
        System.out.println(cadena.trim());

        //Pone todos los caracteres en minuscula y mayuscula respectivamente
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        //Devuelve el primer indice en donde aparece el caracter
        System.out.println(cadena.indexOf('o'));

        //Devuelve el ultimo indice donde aparece el caracter
        System.out.println(cadena.lastIndexOf('o'));

        //Busca el caracter desde ese indice
        System.out.println(cadena.indexOf('o', 5));

        //Busca la subcadena desde ese indice
        System.out.println(cadena.indexOf("world", 6));

        //Funciona igual con lastIndexOf

        //Devuelve true si encuentra la cadena
        System.out.println(cadena.contains("we"));

        //Reemplaza todos los primeros caracteres por el segundo
        String nuevo = cadena.replace("w", "r");
        System.out.println(nuevo);

        //Reemplza el primer substring por el segundo
        String nuevo3 = cadena.replaceAll("world", "agus");
        System.out.println(nuevo3);

        //Reemplaza el primer substring encontrado por el segundo
        cadena.replaceFirst("world", "agus");
    }
}
