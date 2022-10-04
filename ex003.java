package Exercícios;
//Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida.

import javax.swing.JOptionPane;

public class ex003 {
  public static void main(String[] args) {
    int precoUn, qntVendida;
    Double comissão;

    precoUn = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da peça: "));
    qntVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vendida: "));

    comissão = (precoUn * qntVendida) * 0.05;

    JOptionPane.showMessageDialog(null, "A comissão do vendedor sera de: " + comissão.intValue());
  }
}
