//Fazer um programa que recebe quatro números inteiros aleatórios, e em seguida, os mostra em ordem crescente.

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ordemCrescente {
  public static void main(String[] args) {
    int[] numeros = new int[4];
    String array = "Os numeros ordenados são";

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
    }
    ;
    Arrays.sort(numeros);
    for (int i = 0; i < numeros.length; i++) {
      array += " "+ Integer.toString(numeros[i]);
    }
    ;
    JOptionPane.showMessageDialog(null, array);
  }
}
