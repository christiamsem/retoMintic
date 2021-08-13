/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author chrit
 */
import Modelos.Producto;
import Modelos.ProductoBD;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {    
    private VistaPrincipal vista;
    private ProductoBD modeloProducto;
    
    public Controlador (VistaPrincipal vista, ProductoBD productoDB) {
        this.vista = vista;
        this.modeloProducto = productoDB;
        
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnConsultar.addActionListener(this);                
        
    }
    
    public Controlador(){        
    }
    
    public void clearConsultar(){
        
        vista.boxCantConsultar.setText("");
        vista.boxIdConsultar.setText("");
        vista.boxNombreConsultar.setText("");
        vista.boxPrecioConsultar.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        DefaultTableModel model = (DefaultTableModel) vista.tableProductos.getModel();
        int numRow = -1;
        if (e.getSource() == vista.btnGuardar){
            System.out.println("Guardar");
            
            Producto p = new Producto ();
            
            
            p.setNombre(vista.boxNombreRegistrar.getText());
            p.setCantidad(Integer.valueOf(vista.boxCantRegistrar.getText()));
            p.setPrecio(Double.valueOf(vista.boxPrecioRegistro.getText()));
            p.setCategoria(String.valueOf(vista.comboCategoriaRegistrar.getSelectedItem()));
            
            modeloProducto.insertar(p);
            
            vista.boxNombreRegistrar.setText("");            
            vista.boxCantRegistrar.setText("");            
            vista.boxPrecioRegistro.setText("");            
            vista.comboCategoriaRegistrar.setSelectedIndex(0);
            
        }else if (e.getSource() == vista.btnConsultar){
            
        
            model.setRowCount(0);// limpiar la tabla
            
            for (Producto producto : this.modeloProducto.listar()) {
                
                System.out.println(producto);
                
                model.addRow(new Object []
                {producto.getId(), producto.getNombre(),
                    producto.getCantidad(), producto.getCategoria(),
                    producto.getPrecio ()});
            }
           
            vista.tableProductos.setModel(model);
            clearConsultar();
            System.out.println("Consultar");
            
        }else if (e.getSource() == vista.btnActualizar){
            
            numRow = vista.tableProductos.getSelectedRow();
            if (numRow >= 0){
                int id = Integer.parseInt(String.valueOf(vista.tableProductos.getValueAt(numRow, 0)));
                
                Producto p = new Producto();
                
                p.setId(Integer.valueOf(vista.boxIdConsultar.getText()));
                p.setNombre(vista.boxNombreConsultar.getText());
                p.setCantidad (Integer.valueOf(vista.boxCantConsultar.getText()));
                p.setPrecio (Double.valueOf(vista.boxPrecioConsultar.getText()));
                p.setCategoria(String.valueOf(vista.comboCategoriaConsultar.getSelectedItem()));
                
                modeloProducto.actualizar(p, id);
                
                model.setRowCount (0);
                for (Producto producto : this.modeloProducto.listar()){
                    System.out.println(producto);
                    model.addRow(new Object[] {producto.getId(), producto.getNombre(), producto.getCantidad(), producto.getCategoria(), producto.getPrecio()});
                    
                }
            }
                
                vista.tableProductos.setModel(model);
                clearConsultar();
                System.out.println("Actualizar");
                
            }  else if (e.getSource()  == vista.btnEliminar){
                numRow = vista.tableProductos.getSelectedRow();
                
                if (numRow >= 0){
                    int id = Integer.parseInt(String.valueOf(vista.tableProductos.getValueAt(numRow, 0)));
                    modeloProducto.borrar(id);
                    
                    model.setRowCount(0);
                    for (Producto producto : this.modeloProducto.listar()){
                        System.out.println(producto);
                        model.addRow(new Object[] {producto.getId(), producto.getNombre(), producto.getCantidad(), producto.getCategoria(), producto.getPrecio()});
                    }
                    
                    vista.tableProductos.setModel(model);
                    clearConsultar();
                    System.out.println("Eliminar");
                }
                
            }
                
            
        }
    }
    
    

