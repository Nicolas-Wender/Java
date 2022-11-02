
import javax.swing.JOptionPane;

public class ConverterBinario {
  public static void main(String[] args) {
    int resultado =0;
   
    String binario = JOptionPane.showInputDialog(null, "Digite o numero em binario: ");
    char[] numBinario = binario.toCharArray();
    

    for (int i = 0; i < numBinario.length; i++) {
      resultado += (Character.getNumericValue(numBinario[i]))*(Math.pow(2, i)) ;
    }
    JOptionPane.showMessageDialog(null, "Valor em decimal: " + resultado);
    
  }
}
