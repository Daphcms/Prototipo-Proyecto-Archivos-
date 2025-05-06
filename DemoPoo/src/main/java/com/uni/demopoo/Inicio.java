
package com.uni.demopoo;

import javax.swing.JOptionPane;

public class Inicio {
    
    public static void main( String [] args ) {
        Operaciones objOperaciones = new Operaciones();
        
        objOperaciones.numero1 = 10;
        objOperaciones.numero2 = 12;
        
        double resultadoAleatorio = objOperaciones.generarAleatorio();
        
        JOptionPane.showMessageDialog(null,"El valor aletorio es: " + resultadoAleatorio);
        
        
        int sumaResultado = objOperaciones.suma();
        
        JOptionPane.showMessageDialog(null, "La suma es: " + sumaResultado);
        
        OperacionesComplejas objComplejo = new OperacionesComplejas();
        objComplejo.numero1 =3;
         objComplejo.numero2 =5;
        int suma3 = objComplejo.sumar3numeros(50);
        JOptionPane.showMessageDialog(null, "La suma es: " +suma3);
    }
}
