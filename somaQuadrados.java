//Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado
  
import javax.swing.JOptionPane;

public class somaQuadrados{
  public static void main(String[] args){
    int somaQuadrado;
    int [] numeros = new int[4];

    somaQuadrado = 0;

    for(int i=0; i < numeros.length; i++){
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+i+"° valor: "));

      somaQuadrado += numeros[i]*numeros[i]; 
    };
    
    JOptionPane.showMessageDialog(null, "A soma dos quadrados dos 4 numeros é: "+somaQuadrado);

  }
}

