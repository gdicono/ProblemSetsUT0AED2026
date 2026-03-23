# Ejercicio 9 (ContadorPalabras)

## Glosario POO

- Clase: Es una plantilla o molde que define las características (atributos) y comportamientos (métodos) de un tipo de objeto.
- Objeto: Es una instancia concreta de una clase. Es decir, es un ejemplar específico que se crea a partir de la clase.
- Atributo: Es una variable que pertenece a una clase y describe una característica del objeto
- Método: Es una función o procedimiento que pertenece a una clase y define un comportamiento del objeto.
- Instancia: Es el proceso de crear un objeto a partir de una clase.
- Herencia: Es un mecanismo por el cual una clase puede heredar atributos y métodos de otra clase.
- Encapsulamiento: Es el principio de ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos.
- Polimorfismo: Es la capacidad de una clase para tomar muchas formas. Esto se logra a través de la herencia y la sobreescritura de métodos.
- Abstracción: Es el proceso de simplificar un sistema complejo al enfocarse en los aspectos esenciales y ocultar los detalles innecesarios.

## Desiciones de diseño en ContadorPalabras

- Uso de interfaz "ProcesarTexto. Permite definir un contrato para cualquier clase que quiera procesar texto, facilitando la extensibilidad y el mantenimiento del código."
- Robustez en el manejo en la entrada de archivos nulos. Implementamos validaciones para evitar NullPointerException y mejorar la estabilidad de la aplicación.

## Limpieza de datos con trim() y split ()

- trim(): Elimina los espacios en blanco al inicio y al final de la cadena, lo que ayuda a evitar contar palabras vacías.
- split("\\s+"): Divide la cadena en palabras utilizando cualquier cantidad de espacios como delimitador
