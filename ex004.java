package Exercícios;
//Ler um valor inteiro e exibir seu sucessor ou antecessor.

import javax.swing.JOptionPane;

public class ex004 {
  public static void main(String[] args) {
    int valor;
    String escolha;
    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
    escolha = JOptionPane
        .showInputDialog(null, "Digite A para ter o antecessor do seu numero e S para ter o sucessor do seu numero").toUpperCase();

    if (escolha.substring(0) == "S") {
      JOptionPane.showMessageDialog(null, "O sucessor de " + valor + " é igual a: " + (valor++));
    } else if (escolha.substring(0) == "A") {
      JOptionPane.showMessageDialog(null, "O antecessor de " + valor + " é igual a: " + (valor--));
    } else {
      JOptionPane.showMessageDialog(null, "Você não digitou um valor valido");
    }
  }
}
