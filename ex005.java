package Exercícios;
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

import javax.swing.JOptionPane;

public class ex005 {
  public static void main(String[] args) {
    int custoFabrica;
    Double prctDistribuidor = 0.28;
    Double impostos = 0.45;

    custoFabrica = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o custo de Fabrica desse carro: "));

    Double custoCarro = custoFabrica + (custoFabrica * prctDistribuidor) + (custoFabrica * impostos);

    JOptionPane.showMessageDialog(null, "O preço do carro ao consumidor será de " + custoCarro.intValue());
  }
}
