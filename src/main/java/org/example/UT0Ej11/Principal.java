package org.example.UT0Ej11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal
{
    public static void leerEntradaArchivo(String rutaArchivo) //Método para leer los datos desde un archivo
        {
            try //Prueba ejecutar el código
            {
                File archivo = new File(rutaArchivo); //Crea un objeto con la ruta del archivo
                Scanner n1 = new Scanner(archivo); //Scanner para leer el archivo

                if (!n1.hasNextInt()) //Verifica si el próximo valor es un entero
                {
                    System.out.println("Se espera un entero");
                    return;
                }
                int entero = n1.nextInt(); //Lee el entero

                if (!n1.hasNextDouble()) //Verifica si el próximo valor es un real
                {
                    System.out.println("Se espera un real");
                    return;
                }
                double real = n1.nextDouble(); //Lee el número real

                if (!n1.hasNextLine())
                {
                    System.out.println("Se espera una cadena");
                    return;
                }
                String cadena = n1.nextLine(); //Lee la cadena

                double suma = entero + real; //Suma
                int divisor = (int) real; //Convierte el número entero en real para hacer de divisor

                System.out.println("Entero: " + entero); //Imprime el resultado
                System.out.println("Real: " + real); //Imprime el resultado
                System.out.println("Cadena: " + cadena); //Imprime el resultado
                System.out.println("Suma: " + suma); //Imprime el resultado

                if (divisor == 0) //El divisior tiene que ser distinto de 0
                {
                    System.out.println("No se puede hacer la división entera, el divisor es 0");
                }
                else // Si el divisor es diferente a 0
                {
                    int div = entero / divisor; // Se calcula la division entera
                    int resto = entero % divisor; //Calcula el resto de la división anterior

                    System.out.println("División entera: " + div); //Imprime el resultado
                    System.out.println("Resto: " + resto); //Imprime el resultado
                }
                n1.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo.");
            }
            catch (NumberFormatException e) {
                System.out.println("El archivo tiene otro formato.");
            }
        }
    public static void leerEntradaStdin() {} //Por completar

    public static void main(String[] args) {
        System.out.println("Parte A: Lectura del archivo");
        leerEntradaArchivo("entrada.txt");

        System.out.println("Parte B: Lectura desde el teclado");
        //leerEntradaStdin();
    }
}

