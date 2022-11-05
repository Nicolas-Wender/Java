import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class jogoDaVelha extends JFrame {
  static int jogada = 10;
  JButton[] bt = new JButton[9];
  int btn[][] = new int[3][3];
  int somaClick = 0;

  public jogoDaVelha() {
    setVisible(true);
    setTitle("Jogo da Velha");
    setDefaultCloseOperation(3);
    setLayout(null);
    setBounds(250, 100, 420, 500);
    int cont = 0;
    boolean click[] = new boolean[9];
    

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        bt[cont] = new JButton();
        add(bt[cont]);
        bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
        bt[cont].setFont(new Font("Arial", Font.BOLD, 40));
        btn[i][j] = cont;
        cont++;
      }
    }

    bt[0].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[0] == false) {
          somaClick++;
          btn[0][0] = jogada;
          mudarJogada(jogada, bt[0]);
          verificarResultado(btn, somaClick);
        }
        click[0] = true;
        System.out.println(somaClick);
      }
    });
    bt[1].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[1] == false) {
          somaClick++;
          btn[0][1] = jogada;
          mudarJogada(jogada, bt[1]);
          verificarResultado(btn, somaClick);
        }
        click[1] = true;
        System.out.println(somaClick);
      }
    });
    bt[2].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[2] == false) {
          somaClick++;
          btn[0][2] = jogada;
          mudarJogada(jogada, bt[2]);
          verificarResultado(btn, somaClick);
        }
        click[2] = true;
        System.out.println(somaClick);
      }
    });
    bt[3].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[3] == false) {
          somaClick++;
          btn[1][0] = jogada;
          mudarJogada(jogada, bt[3]);
          verificarResultado(btn, somaClick);
        }
        click[3] = true;
        System.out.println(somaClick);
      }
    });
    bt[4].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[4] == false) {
          somaClick++;
          btn[1][1] = jogada;
          mudarJogada(jogada, bt[4]);
          verificarResultado(btn, somaClick);
        }
        click[4] = true;
        System.out.println(somaClick);
      }
      
    });
    bt[5].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[5] == false) {
          somaClick++;
          btn[1][2] = jogada;
          mudarJogada(jogada, bt[5]);
          verificarResultado(btn, somaClick);
        }
        click[5] = true;
        System.out.println(somaClick);
      }
    });
    bt[6].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[6] == false) {
          somaClick++;
          btn[2][0] = jogada;
          mudarJogada(jogada, bt[6]);
          verificarResultado(btn, somaClick);
        }
        click[6] = true;
        System.out.println(somaClick);
      }
    });
    bt[7].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[7] == false) {
          somaClick++;
          btn[2][1] = jogada;
          mudarJogada(jogada, bt[7]);
          verificarResultado(btn, somaClick);
        }
        click[7] = true;
        System.out.println(somaClick);
      }
    });
    bt[8].addActionListener(new java.awt.event.ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        if (click[8] == false) {
          somaClick++;
          btn[2][2] = jogada;
          mudarJogada(jogada, bt[8]);
          verificarResultado(btn, somaClick);
        }
        click[8] = true;
        System.out.println(somaClick);
      }
    });

  }

  public static void mudarJogada(int jogada, JButton bt) {
    if (jogada == 10) {
      bt.setText("X");
      jogoDaVelha.jogada = 11;
    } else {
      bt.setText("O");
      jogoDaVelha.jogada = 10;
    }
  }

  public static void verificarResultado(int btn[][], int somaClick) {
    if (teste(btn) == true) {
      if (jogada == 11) {
        JOptionPane.showMessageDialog(null, "X Ganhou a partida");
      }
      if (jogada == 10) {
        JOptionPane.showMessageDialog(null, "O Ganhou a partida");
      }
    }
    if (somaClick == 9) {
      JOptionPane.showMessageDialog(null, "Ocorreu um Empate !");
    }
  }

  public static boolean teste(int btn[][]) {
    for (int i = 0; i < 3; i++) {
      if (btn[i][0] == btn[i][1] && btn[i][1] == btn[i][2]) {
        return true;
      }
      if (btn[0][i] == btn[1][i] && btn[1][i] == btn[2][i]) {
        return true;
      }
    }
    if (btn[0][0] == btn[1][1] && btn[1][1] == btn[2][2]) {
      return true;
    }
    if (btn[0][2] == btn[1][1] && btn[1][1] == btn[0][0]) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    new jogoDaVelha();
  }

}
