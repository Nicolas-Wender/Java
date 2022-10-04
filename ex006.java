package Exercícios;
//Fazer um programa que recebe um número positivo, calcula e mostra:

//  a) O número digitado ao quadrado;
//  b) O número digitado ao cubo;
//  c) A raiz quadrada do número digitado.

import java.lang.Math;
import javax.swing.JOptionPane;

public class ex006 {
  public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
    JOptionPane.showMessageDialog(null, "O valor de " + numero + " ao quadrado é: " + Math.pow(numero, 2));
    JOptionPane.showMessageDialog(null, "O valor de " + numero + " ao cubo é: " + Math.pow(numero, 3));
    JOptionPane.showMessageDialog(null, "O valor de " + numero + " em sua raiz quadrada é: " + Math.sqrt(numero));

  }
}
