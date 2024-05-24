package usp.mac321.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class FatorialView extends JFrame {
    private static final long serialVersionUID = 6265594525071196118L;
	private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private boolean isButtonPressed = false;

    public FatorialView() {
        // Configurações da janela
        setTitle("Cálculo de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Componentes da interface
        inputField = new JTextField(10);
        calculateButton = new JButton("Calcular");
        resultLabel = new JLabel("Resultado: ");

        // Layout da interface
        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite um número:"));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);

        // Ação do botão
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	isButtonPressed = true;
                    String inputText = inputField.getText();
                    int number = Integer.parseInt(inputText);

                    // Verifica se o número é não negativo
                    if (number < 0) {
                        throw new IllegalArgumentException("O número deve ser não negativo.");
                    }

                    // Calcula o fatorial usando o Controller
                    BigDecimal result = FatorialController.calculaFatorial(number);
                    resultLabel.setText("Resultado: " + result.toString());
                   
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(FatorialView.this, "Por favor, insira um número inteiro válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(FatorialView.this, ex.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    public String getLabelTextString() {
    	return inputField.getText();
    }
    
    public void clickButton() {
    	calculateButton.doClick();
    }
    
    public boolean getIsButtonPressed() {
    	return isButtonPressed;
    }
    
    public JButton getButton() {
    	return calculateButton;
    }
    
    public String getResult() {
    	return resultLabel.getText();
    }
    
    public void setLabelValue(String value) {
    	inputField.setText(value);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FatorialView().setVisible(true);
            }
        });
    }
}
