import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClaseFileReader {

    public static void main(String[] args) throws IOException {
        /*
        Para abrir un txt en modo lectura, se debe usar FileReader y File; como FileReader no lee lineas completas
        de un archivo se crea un BufferedReader a partir de un FileReader.
        */
        File archivo = new File("ruta del archivo");
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //Creo un array con todas las lineas para acceder facilmente a ellas
        List<String> lineas = new ArrayList<>();

        //Bucle para ir leyendo linea por linea
        String linea = bufferedReader.readLine();
        while(linea != null){
            lineas.add(linea);
            linea = bufferedReader.readLine();
        }
    }
}
