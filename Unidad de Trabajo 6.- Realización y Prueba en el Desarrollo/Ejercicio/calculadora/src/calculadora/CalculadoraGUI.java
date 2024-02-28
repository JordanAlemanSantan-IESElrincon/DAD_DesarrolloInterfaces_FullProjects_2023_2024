package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CalculadoraGUI extends JFrame {
    private final JTextField display;
    private final Calculando calculadora;  // Nueva instancia de la clase Calculando

    public CalculadoraGUI() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicialización de la calculadora
        calculadora = new Calculando();

        // Configuración del panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Display de la calculadora
        display = new JTextField();
        display.setEditable(false);
        panel.add(display, BorderLayout.NORTH);

        // Botones de la calculadora
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonsPanel.add(button);
        }

        panel.add(buttonsPanel, BorderLayout.CENTER);

        // Agregar el panel principal a la ventana
        add(panel);
    }

    // ActionListener para los botones
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            // Manejo del texto en el display
            if (buttonText.equals("=")) {
                // Evaluar la expresión y mostrar el resultado
                try {
                    String expression = display.getText();
                    double result = evaluarExpression(expression);
                    display.setText(String.valueOf(result));
                } catch (ArithmeticException ex) {
                    display.setText("Error");
                }
            } else {
                // Agregar el texto del botón al display
                display.setText(display.getText() + buttonText);
            }
        }

        // Método para evaluar la expresión matemática utilizando la instancia de Calculando
        private double evaluarExpression(String expression) {
            // Dividir la expresión en números y operadores
            String[] partes = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

            // Verificar si hay números suficientes y operadores
            if (partes.length < 3) {
                throw new IllegalArgumentException("Expresión no válida");
            }

            double operand1 = Double.parseDouble(partes[0]);
            String operador = partes[1];
            double operand2 = Double.parseDouble(partes[2]);

            return switch (operador) {
                case "+" -> calculadora.add(operand1, operand2);
                case "-" -> calculadora.subtract(operand1, operand2);
                case "*" -> calculadora.multiply(operand1, operand2);
                case "/" -> {
                    if (operand2 == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    yield calculadora.divide(operand1, operand2);
                }
                default -> throw new IllegalArgumentException("Operador no válido");
            };
        }
    }

    // Método para obtener el texto actual en el display de la calculadora
    public String getDisplayText() {
        return display.getText();
    }

    // Método para obtener un botón de la calculadora por su texto
    public JButton getButtonByText(String buttonText) {
        // Obtener todos los botones en el panel de botones
        Component[] components = ((Container) getContentPane().getComponent(0)).getComponents();

        // Filtrar los botones y encontrar el que tiene el texto dado
        return Arrays.stream(components)
                .filter(component -> component instanceof JButton)
                .map(component -> (JButton) component)
                .filter(button -> button.getText().equals(buttonText))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Botón no encontrado: " + buttonText));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGUI().setVisible(true));
    }
}