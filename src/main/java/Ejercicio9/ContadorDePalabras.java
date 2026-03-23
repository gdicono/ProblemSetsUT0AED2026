package Ejercicio9;

public class ContadorDePalabras implements ProcesarTexto {

    @Override
    public int ContarPalabras(String texto) {

        if (texto == null) // si el texto es nulo, no hay palabras que contar
            return 0; // retorna 0
        else
            return texto.trim().split(" ").length; // si el texto no es nulo, se eliminan los espacios al inicio y al final, se divide el texto en palabras usando el espacio como delimitador y se devuelve la cantidad de palabras
    }
}