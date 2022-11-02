






import java.util.ArrayList;
import java.util.List;

public class Calculadora {
  private List<String> numeros = new ArrayList<String>();
  Double resultado;
  private String operador;

  public void setNumeros( String numero){
    this.numeros.add(numero);
    verificar(numeros, operador);
  }

  public void setOperador(String operadorBotao){
    this.operador = operadorBotao;
  }

  private void verificar(List<String> numeros, String operador){
    if(numeros.size() < 2 ){
      return;
    }else{
      calcular(numeros, operador);
      
    }


  }

  private Double calcular( List<String> numeros, String operador){
    
    double numero1 = Double.parseDouble(numeros.get(1));
    double numero2 = Double.parseDouble(numeros.get(2));
    
    switch (operador){
      case "+": 
        return resultado = numero1 + numero2;
      case "-": 
        return resultado = numero1 - numero2;
      case "/": 
        return resultado = numero1 / numero2;
      case "*": 
        return resultado = numero1 * numero2; 
    }
    return numero2;
  
  }

}

