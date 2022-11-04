import javax.swing.*;
import java.awt.Font;
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
    boolean click[] = new boolean[9];

    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        bt[cont] =new JButton();
        add(bt[cont]);
        bt[cont].setBounds((100*i)+50, (100*j)+50,95,95);
        bt[cont].setFont(new Font("Arial", Font.BOLD,40));
        cont++;
      } 
    }

    bt[0].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[0] == false){
          mudarJogada(jogada, bt[0]);
        }
        click[0] = true;
      }
    });

  }

  public static void mudarJogada(String jogada, JButton bt){
    if(jogada=="X"){
      bt.setText(jogada);
      jogada="O";
    }else{
      bt.setText(jogada);
      jogada="X";
    }
  }

  public static void main (String[] args) {
    new jogoDaVelha();  
  }

}

