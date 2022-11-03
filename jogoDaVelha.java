import javax.swing.JOptionPane;



public class jogoDaVelha {
  public static void main (String[] args) {
    String tabuleiro[][] = new String[3][3];
    String jogada = "x";
    boolean vitoria = false;

    while(vitoria == false){
      jogoDaVelha.mudarJogada(jogada);
      for(int i=0;i<3;i++){
        for(int a=0; a<3;a++){
          System.out.println(tabuleiro[i][a]);
        }
      }
      vitoria = true;
      
    }

   
  
  }

  public static void mudarJogada(String jogada){
    if(jogada=="x"){
      jogada="O";
    }else{
      jogada="x";
    }
  }

 
  public static void jogar(String tabuleiro[][], String jogada ) {
    int coluna =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a linha: "));
    int linha  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coluna: "));
    tabuleiro[coluna][linha] = jogada;
  }
}
