package Ejercicio14;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String entrada = "entrada.txt"; // texto que va a leer
        String salida = "resultado.txt"; // resultado

        TextoAT9 t9 = new TextoAT9(); // llamamos al metodo que transforma el texto en número seguno el formato T9

        try {
            t9.procesarArchivo(entrada, salida); // metodo que permite leer el archivo, procesarlo e invertirlo y luego escribir el resultado en un nuevo archivo
            System.out.println("Archivo procesado e invertido. Resultado guardado en: " + salida); // mensaje cuando se haya procesado
        } catch (IOException exception) { // lanzamos excepcion si hay error
            System.err.println("Error al procesar el archivo: " + exception.getMessage());
        }
    }
}