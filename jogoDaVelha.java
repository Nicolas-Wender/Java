import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;



public class jogoDaVelha extends JFrame{
  static String jogada = "X";
  JButton [] bt = new JButton[9];
  
  public jogoDaVelha(){
    setVisible(true);
    setTitle("Jogo da Velha");
    setDefaultCloseOperation(3);
    setLayout(null);
    setBounds(250,100,420,500);
    int cont = 0;
   
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
    bt[1].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[1] == false){
          mudarJogada(jogada, bt[1]);
        }
        click[1] = true;
      }
    });
    bt[2].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[2] == false){
          mudarJogada(jogada, bt[2]);
        }
        click[2] = true;
      }
    });
    bt[3].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[3] == false){
          mudarJogada(jogada, bt[3]);
        }
        click[3] = true;
      }
    });
    bt[4].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[4] == false){
          mudarJogada(jogada, bt[4]);
        }
        click[4] = true;
      }
    });
    bt[5].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[5] == false){
          mudarJogada(jogada, bt[5]);
        }
        click[5] = true;
      }
    });
    bt[6].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[6] == false){
          mudarJogada(jogada, bt[6]);
        }
        click[6] = true;
      }
    });
    bt[7].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[7] == false){
          mudarJogada(jogada, bt[7]);
        }
        click[7] = true;
      }
    });
    bt[8].addActionListener(new java.awt.event.ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae ){
        if(click[8] == false){
          mudarJogada(jogada, bt[8]);
        }
        click[8] = true;
      }
    });
  
  }

  public static void mudarJogada(String jogada, JButton bt){
    if(jogada=="X"){
      bt.setText(jogada);
      jogoDaVelha.jogada="O";
    }else{
      bt.setText(jogada);
      jogoDaVelha.jogada="X";
    }
  }

  
  public static void main (String[] args) {
    new jogoDaVelha();  
  }

}

