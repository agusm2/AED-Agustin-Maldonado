import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClaseFileWriter {

    public static void main(String[] args) throws IOException {

        /*
        Para escribir un archivo utilizo BufferedWriter, como tambien FileWriter para abrir el archivo en modo escritura
        el false (o true) que sigue a la ruta del archivo indica si se quiere añadir la informacion
        al final del archivo (true) o eliminar lo contenido (false).
         */
        FileWriter fileWriter = new FileWriter("ruta del archivo", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //Metodo que utilizo para escribir lineas
        bufferedWriter.write("");

        //Metodo que utilizo para saltar linea
        bufferedWriter.newLine();

    }
}
