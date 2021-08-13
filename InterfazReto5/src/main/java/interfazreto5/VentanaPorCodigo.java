/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazreto5;

/**
 *
 * @author chrit
 */
import javax.swing.*; // Se importa todas las calses necesarias para realizar interfaces graficas

public class VentanaPorCodigo extends JFrame {
    
    public static void main (String [] args){
        
                      
        VentanaPorCodigo formulario1 = new VentanaPorCodigo();
        
        formulario1.setBounds (5, 10, 200, 150); //Define posicion
        formulario1.setVisible(true);// define visibilidad
        
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define la operacion una vez se cierre la ventana Salid de la app
  
    
    
    }
}