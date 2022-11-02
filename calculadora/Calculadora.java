
import java.util.ArrayList;
import java.util.List;

public class Calculadora {
  private List<String> numeros = new ArrayList<String>();
  private List<String> operador = new ArrayList<String>();
  private String resultado;

  public void setNumeros(String numero) {
    this.numeros.add(numero);
  }

  public void setOperador(String operadorBotao) {
    this.operador.add(operadorBotao);
    verificar(numeros, operador);
  }

  private void setResultado(Double resultadoCalc) {
    this.resultado = String.valueOf(resultadoCalc);
  }

  public String getResultado() {
    return resultado;
  }

  private void verificar(List<String> numeros, List<String> operador) {
    if (numeros.size() < 2) {
      return;
    } else {
      calcular(numeros, operador);
      numeros.remove(1);
      numeros.set(0, resultado);
      String operadorAtual = operador.get(1);
      operador.set(0, operadorAtual);
      operador.remove(1);

    }

  }

  private void calcular(List<String> numeros, List<String> operador) {

    double numero1 = Double.parseDouble(numeros.get(0));
    System.out.println(numero1);
    double numero2 = Double.parseDouble(numeros.get(1));
    System.out.println(numero2);
    Double operacao;

    switch (operador.get(0)) {
      case "+":
        operacao = numero1 + numero2;
        setResultado(operacao);
      case "-":
        operacao = numero1 - numero2;
        setResultado(operacao);
      case "/":
        operacao = numero1 / numero2;
        setResultado(operacao);
      case "*":
        operacao = numero1 * numero2;
        setResultado(operacao);

    }
  }
}
