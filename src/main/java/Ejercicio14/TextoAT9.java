package Ejercicio14;
import java.io.*;
import java.util.Scanner;

public class TextoAT9 {

    public String convertir(String texto) {
        StringBuilder resultado = new StringBuilder(); // string vacío

        for (int i = 0; i < texto.length(); i++) { // recorremos el texto posición por posición
            char letra = texto.charAt(i); // devuelve la letra segun el indice
            resultado.append(obtenerNumero(letra)); // unimos

        }

        return resultado.toString(); // retorna resultado
    }

    public String invertir(String texto) {
        StringBuilder textoInvertido = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) { // recorremos el texto de atras hacia adelante para invertirlo
            textoInvertido.append(texto.charAt(i));
        }

        return convertir(textoInvertido.toString()); // convertimos el texto invertido a T9
    }

    public void procesarArchivo(String entrada, String salida) throws IOException {

        File archivoEntrada = new File(entrada);
        File archivoSalida = new File(salida);

        try (Scanner lector = new Scanner(archivoEntrada);
             PrintWriter escritor = new PrintWriter(new FileWriter(archivoSalida))) {

            while (lector.hasNextLine()) { // Comprueba si hay una línea siguiente
                String linea = lector.nextLine(); // Lee la línea completa
                String conversion = invertir(linea); // Invierte y convierte a T9
                escritor.println(conversion); // Escribe y añade el salto de línea automáticamente
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se encontró el archivo: " + e.getMessage());
            throw e;
        }
    }

    private char obtenerNumero (char letra) // metodo para segun la letra retorne el numero correspondiente
    {
        return switch (Character.toUpperCase(letra)) {
            case 'A', 'B', 'C' -> '2';
            case 'D', 'E', 'F' -> '3';
            case 'G', 'H', 'I' -> '4';
            case 'J', 'K', 'L' -> '5';
            case 'M', 'N', 'O' -> '6';
            case 'P', 'Q', 'R', 'S' -> '7';
            case 'T', 'U', 'V' -> '8';
            case 'W', 'X', 'Y', 'Z' -> '9';
            default -> letra;
        };
    }
}
