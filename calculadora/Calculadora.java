









import java.util.ArrayList;
import java.util.List;

public class Calculadora {
  private List<String> numeros = new ArrayList<String>();
  private String resultado;
  private List<String> operador = new ArrayList<String>();

  public void setNumeros( String numero){
    this.numeros.add(numero);
    verificar(numeros, operador);
  }

  public void setOperador(String operadorBotao){
    this.operador.add(operadorBotao);
  }

  private void setResultado(Double resultadoCalc){
    this.resultado = String.valueOf(resultadoCalc);
  }

  public String getResultado(){
    return resultado;
  }

  private void verificar(List<String> numeros, List<String> operador){
    if(numeros.size() < 2 ){
      return;
    }else{
      calcular(numeros, operador);
      numeros.set(0, resultado);

    }


  }

  private void calcular( List<String> numeros, List<String>operador){
    
    double numero1 = Double.parseDouble(numeros.get(1));
    double numero2 = Double.parseDouble(numeros.get(2));
    
    switch (operador.get(0)){
      case "+": 
        setResultado(numero1 + numero2);
      case "-": 
        setResultado(numero1 - numero2);
      case "/": 
        setResultado(numero1 / numero2);
      case "*": 
        setResultado(numero1 * numero2); 
    }
  
  }

}

