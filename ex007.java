package Exercícios;
// Fazer um programa que recebe o salário-base de um funcionário, calcula e mostra o salário a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.

import javax.swing.JOptionPane;

public class ex007 {
  public static void main(String[] args) {
    int salBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário base: "));
    Double salReceber = (salBase + (salBase * 0.05)) - (salBase * 0.07);
    JOptionPane.showMessageDialog(null, "O salário a receber será: " + salReceber);
  }
}
