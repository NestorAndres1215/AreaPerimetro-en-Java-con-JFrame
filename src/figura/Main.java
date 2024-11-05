package figura;



import javax.swing.*;
import java.awt.*;



public class Main {
    private JFrame frame;
    private JComboBox<String> figuraComboBox;
    private JTextField campo1, campo2, campo3;
    private JButton calcularButton;
    private JTextArea resultadoArea;

    public Main() {
        // Configuración del marco
        frame = new JFrame("Calculadora de Figuras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ComboBox para seleccionar la figura
        figuraComboBox = new JComboBox<>(new String[]{"Círculo", "Cuadrado", "Rectángulo", "Triángulo", "Pentágono", "Rombo"});
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(new JLabel("Seleccione una figura:"), gbc);
        gbc.gridx = 1;
        panel.add(figuraComboBox, gbc);

        // Campos de entrada
        campo1 = new JTextField(10);
        campo2 = new JTextField(10);
        campo3 = new JTextField(10);
        campo1.setVisible(false);
        campo2.setVisible(false);
        campo3.setVisible(false);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Campo 1:"), gbc);
        gbc.gridx = 1;
        panel.add(campo1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Campo 2:"), gbc);
        gbc.gridx = 1;
        panel.add(campo2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Campo 3:"), gbc);
        gbc.gridx = 1;
        panel.add(campo3, gbc);

        // Botón de calcular
        calcularButton = new JButton("Calcular");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(calcularButton, gbc);

        // Área de resultados
        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);
        resultadoArea.setBorder(BorderFactory.createTitledBorder("Resultados"));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(new JScrollPane(resultadoArea), gbc);

        // Agregar el panel al marco
        frame.add(panel);
        frame.setVisible(true);

        // Acciones
        figuraComboBox.addActionListener(e -> mostrarCampos());
        calcularButton.addActionListener(e -> calcular());
    }

    private void mostrarCampos() {
        String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo1.setVisible(true);
        campo2.setVisible(true);
        campo3.setVisible(true);

        switch (figuraSeleccionada) {
            case "Círculo":
                campo1.setToolTipText("Ingrese el radio");
                campo2.setVisible(false);
                campo3.setVisible(false);
                break;
            case "Cuadrado":
                campo1.setToolTipText("Ingrese el lado");
                campo2.setVisible(false);
                campo3.setVisible(false);
                break;
            case "Rectángulo":
                campo1.setToolTipText("Ingrese la base");
                campo2.setToolTipText("Ingrese la altura");
                campo3.setVisible(false);
                break;
            case "Triángulo":
                campo1.setToolTipText("Ingrese la base");
                campo2.setToolTipText("Ingrese la altura");
                campo3.setToolTipText("Ingrese los lados");
                break;
            case "Pentágono":
                campo1.setToolTipText("Ingrese la longitud del lado");
                campo2.setVisible(false);
                campo3.setVisible(false);
                break;
            case "Rombo":
                campo1.setToolTipText("Ingrese la diagonal 1");
                campo2.setToolTipText("Ingrese la diagonal 2");
                campo3.setVisible(false);
                break;
        }
        frame.pack();
    }

    private void calcular() {
        String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
        resultadoArea.setText("");

        try {
            Figura figura = null;

            switch (figuraSeleccionada) {
                case "Círculo":
                    double radio = Double.parseDouble(campo1.getText());
                    figura = new Circulo(radio);
                    break;
                case "Cuadrado":
                    double lado = Double.parseDouble(campo1.getText());
                    figura = new Cuadrado(lado);
                    break;
                case "Rectángulo":
                    double base = Double.parseDouble(campo1.getText());
                    double altura = Double.parseDouble(campo2.getText());
                    figura = new Rectangulo(base, altura);
                    break;
                case "Triángulo":
                    double baseTriangulo = Double.parseDouble(campo1.getText());
                    double alturaTriangulo = Double.parseDouble(campo2.getText());
                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1"));
                    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2"));
                    double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3"));
                    figura = new Triangulo(baseTriangulo, alturaTriangulo, lado1, lado2, lado3);
                    break;
                case "Pentágono":
                    double ladoPentagono = Double.parseDouble(campo1.getText());
                    figura = new Pentagono(ladoPentagono);
                    break;
                case "Rombo":
                    double diagonal1 = Double.parseDouble(campo1.getText());
                    double diagonal2 = Double.parseDouble(campo2.getText());
                    figura = new Rombo(diagonal1, diagonal2);
                    break;
            }

            if (figura != null) {
                double area = figura.calcularArea();
                double perimetro = figura.calcularPerimetro();
                resultadoArea.setText("Área: " + String.format("%.2f", area) + "\nPerímetro: " + String.format("%.2f", perimetro));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
