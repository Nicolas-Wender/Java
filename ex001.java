package Exercícios;
//Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado. 

import javax.swing.JOptionPane;

public class ex001 {
  public static void main(String[] aStrings) {
    double real, dolar;

    dolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em dolar: "));

    real = dolar * 5.1706;

    JOptionPane.showMessageDialog(null, "O valor em real: " + real);

  }

}
