package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculandoTest {

    @Test
    void add() {
        Calculando calculator = new Calculando();

        // Caso de prueba 1
        double result1 = calculator.add(2.0, 3.0);
        assertEquals(5.0, result1, 0.0001);

        // Caso de prueba 2
        double result2 = calculator.add(-1.0, 5.0);
        assertEquals(4.0, result2, 0.0001);
    }

    @Test
    void subtract() {
        Calculando calculator = new Calculando();

        // Caso de prueba 1
        double result1 = calculator.subtract(5.0, 2.0);
        assertEquals(3.0, result1, 0.0001);

        // Caso de prueba 2
        double result2 = calculator.subtract(10.0, 5.0);
        assertEquals(5.0, result2, 0.0001);
    }

    @Test
    void multiply() {
        Calculando calculator = new Calculando();

        // Caso de prueba 1
        double result1 = calculator.multiply(2.0, 3.0);
        assertEquals(6.0, result1, 0.0001);

        // Caso de prueba 2
        double result2 = calculator.multiply(-2.0, 4.0);
        assertEquals(-8.0, result2, 0.0001);
    }

    @Test
    void divide() {
        Calculando calculator = new Calculando();

        // Caso de prueba 1
        double result1 = calculator.divide(6.0, 2.0);
        assertEquals(3.0, result1, 0.0001);

        // Caso de prueba 2
        double result2 = calculator.divide(8.0, 4.0);
        assertEquals(2.0, result2, 0.0001);
    }
}