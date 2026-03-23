package Ejercicio9;

public class Main {

    public static void main(String[] args) {


        ContadorDePalabras contador = new ContadorDePalabras(); // llamamos a la clase ContadorDePalabras
        String texto = "Prueba para contar las palabras"; // texto de prueba para contar
        int cantidadPalabras = contador.ContarPalabras(texto); // variable que guarda la cantidad de palabras
        System.out.println("Cantidad Palabras: " + cantidadPalabras); // Salida


    }
}

