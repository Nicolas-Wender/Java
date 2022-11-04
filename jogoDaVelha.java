import javax.swing.*;
import java.awt.event.ActionEvent;



public class jogoDaVelha extends JFrame{
  JButton [] bt = new JButton[9];
  
  public jogoDaVelha(){
    setVisible(true);
    setTitle("Jogo da Velha");
    setDefaultCloseOperation(3);
    setLayout(null);
    setBounds(250,100,420,500);
    int cont =0;
    String jogada = "X";

    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        bt[cont] =new JButton();
        add(bt[cont]);
        bt[cont].setBounds((100*i)+50, (100*j)+50,95,95);
        cont++;
      } 
    }

    bt[0].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        mudarJogada(jogada);
      }
    });

  }

  public static void mudarJogada(String jogada){
    if(jogada=="X"){
      jogada="O";
    }else{
      jogada="X";
    }
  }

}

