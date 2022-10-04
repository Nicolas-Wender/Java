package Exercícios;
// A nota final de um estudante é calculada a partir de três notas atribuídas respectivamente a um trabalho de laboratório, à avaliação semestral e a um exame final. A média das três notas mencionadas anteriormente obedece aos pesos a seguir:

// NOTA                      PESO
// Trabalho de laboratório     2
// Avaliação semestral         3
// Exame final                 5

import javax.swing.JOptionPane;

public class ex008 {
  public static void main(String[] args) {
    Double trabalho = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do Trabalho de laboratório: "))*2;
    Double avaliação = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota da Avaliação semestral: "))*3;
    Double exame = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do Exame final: "))*5;

    Double media = (trabalho + avaliação + exame)/10;
    JOptionPane.showMessageDialog(null, "A média do aluno será igual á: "+media.intValue());

  }
}
