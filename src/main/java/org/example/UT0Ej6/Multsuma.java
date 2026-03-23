package org.example.UT0Ej6;

public class Multsuma //Método multsuma double
{
    public static double multsuma(double a, double b, double c)
    {
        return a * b + c;
    }
    public static int multsuma(int a, int b, int c) //Método multsuma con int
    {
        return a * b + c;
    }
    public static boolean validarMultiplicacion (int [] arreglo1, int [] arreglo2)
    {
        return  (arreglo1.length == arreglo2.length); //Si los arreglos tienen el mismo tamaño se van a poder multiplicar
    }
    public static int[] multArreglo (int [] arreglo1, int [] arreglo2) //Método para multiplicar dos arreglos
    {
        int [] resultado = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) //Recorre el arreglo desde la posición 0 hasta la última
        {
            resultado[i] = arreglo1[i] * arreglo2[i]; //Multiplica el valor del arreglo 1, que está en la posición i, por el valor del arreglo 2 en la misma posición y guarda el resultado en el arreglo resultado
        }
        return resultado; // Devuelve el arreglo con todos los resultados
    }
}
