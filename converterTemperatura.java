// Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import javax.swing.JOptionPane;

public class converterTemperatura {
  public static void main(String[] args) {
    Double celcius = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em Celcius: "));

    Double fahrenheit = celcius * (9.0 / 5.0) + 32;

    JOptionPane.showMessageDialog(null,
        "A temperatura de " + celcius + " graus Celsius, é igual á " + fahrenheit.intValue() + " graus Fahrenheit");
  }
}
