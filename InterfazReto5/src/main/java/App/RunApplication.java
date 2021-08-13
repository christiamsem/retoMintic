/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controladores.Controlador;
import Modelos.Producto;
import Modelos.ProductoBD;
import Vistas.VistaPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chrit
 */
public class RunApplication {
    
    public static void main (String [] args){
        ProductoBD prodBD = new ProductoBD();
        VistaPrincipal vista = new VistaPrincipal();
        vista.setVisible(true);
        
        Controlador ProductController = new Controlador(vista, prodBD);
        
        
       
        
        
    }
    
}
