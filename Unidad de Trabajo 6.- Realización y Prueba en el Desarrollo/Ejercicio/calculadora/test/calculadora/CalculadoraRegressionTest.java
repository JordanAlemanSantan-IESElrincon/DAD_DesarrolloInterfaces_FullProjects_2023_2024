package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraRegressionTest {

    private CalculadoraGUI calculadoraGUI;

    @BeforeEach
    public void setUp() {
        // Inicializar la aplicación antes de cada prueba
        calculadoraGUI = new CalculadoraGUI();
        calculadoraGUI.setVisible(true);
    }

    @AfterEach
    public void tearDown() {
        // Cerrar la aplicación después de cada prueba
        calculadoraGUI.dispose();
    }

    @Test
    public void testRegressionAfterUpdate() {
        // Realizar una operación de suma
        enterExpression("3+4");
        assertEquals("7.0", getDisplayText(), "Error en la suma");

        // Realizar una operación de resta
        enterExpression("5-2");
        assertEquals("3.0", getDisplayText(), "Error en la resta");

        // Realizar una operación de multiplicación
        enterExpression("2*6");
        assertEquals("12.0", getDisplayText(), "Error en la multiplicación");

        // Realizar una operación de división
        enterExpression("8/2");
        assertEquals("4.0", getDisplayText(), "Error en la división");
    }

    // Método auxiliar para ingresar una expresión en la calculadora
    private void enterExpression(String expression) {
        for (char c : expression.toCharArray()) {
            clickButton(String.valueOf(c));
        }
        clickButton("=");
    }

    // Método auxiliar para hacer clic en un botón de la calculadora
    private void clickButton(String buttonText) {
        calculadoraGUI.getButtonByText(buttonText).doClick();
    }

    // Método auxiliar para obtener el texto actual en el display de la calculadora
    private String getDisplayText() {
        return calculadoraGUI.getDisplayText();
    }
}
