package testEjercicio14;
import Ejercicio14.TextoAT9;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TextoAT9Test {

    private TextoAT9 testConvertir;

    @BeforeEach
    public void setUp() {
        testConvertir = new TextoAT9(); // creamos el convertidor a T9
    }

    @Test // test para convertir una palabra
    public void testConvertirUnaPalabra() {
        assertEquals("4669256", testConvertir.convertir("GONZALO"));
    }

    @ParameterizedTest // test parametrizado para convertir varias palabras, en este caso nombres.
    @CsvSource({"CAMILA, 226452", "BELEN, 23536", "FRANCO, 372626"})
    public void testConvertirVariasPalabras(String palabra, String t9Esperado) {
        assertEquals(t9Esperado, testConvertir.convertir(palabra));
    }

    @Test
    public void testTerminarAntesDe100Ms() {
        assertTimeout(Duration.ofMillis(100), () -> {
            testConvertir.convertir("Esto es un texto muy largo para ver si es posible que termine antes del tiempo esperado. Ahora estoy poniendo palabras por que no tengo ni idea que poner aca. Espero que el Real Madrid le gane al Barcelona el clasico el liga. Tambien espero que Peñarol le gane a Nacional el proximo clasico y el campoenato uruguayo. Mi comida favorita son las hamburguesas");
        }); // verifica que convertir se va a ejecutar en el periodo de tiempo que le estipulemos
    }

    @Test
    public void testExcepcionDeArchivoNoEncontrado() {
        IOException exception = assertThrows(IOException.class,() -> testConvertir.procesarArchivo("abracadabra.txt", "cristianoRonaldo.txt"));
        assertNotNull(exception.getMessage()); //
    }
}
