package Exercícios;
//Verifique se um numero é primo

import javax.swing.JOptionPane;

public class ex011 {
  public static void main(String[] args) {
    int numero;
    boolean ehPrimo = true;
    // Obtem a entrada do usuário e converte para inteiro
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser analisado:"));

    if (numero >= 2) {
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
      } else {
        JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
      }

    } else
      JOptionPane.showMessageDialog(null, "Só se define primo para números naturais maiores que 1.");
  }
}