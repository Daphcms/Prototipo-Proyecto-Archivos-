
package com.uni.demopoo;

public class OperacionesComplejas extends Operaciones{
    
    public double calculaRaizCuadrada(int valor){
      double resultado = Math .sqrt(valor);
       return resultado;
       
    }
    
    public int sumar3numeros(int numero3){
        int resultado = super.suma();
        
        int total = resultado + numero3;
        
        return total;
    }
    
}
