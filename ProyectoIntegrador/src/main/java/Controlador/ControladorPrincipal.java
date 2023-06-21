/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nanas
 */
public class ControladorPrincipal implements ActionListener{
    private FrmPrincipal frmPrincipal;
    private ControladorRecetas cntroladorRecetas;
    private ControladorUsuarios controladorUsuarios;

    public ControladorPrincipal() {
        frmPrincipal = new FrmPrincipal(this);
        frmPrincipal.setVisible(true);    }

        
    @Override
    public void actionPerformed(ActionEvent e) {
      switch(e.getActionCommand()){
         case "Ayuda":
             System.err.println("Estoy ejecutando la opcion de ayuda");
             break;
         case "Inicio Sesion":
             System.err.println("Estoy ejecutando la opcion de Inicio Sesion");
             
             break;
         case "Administracion Recetas ":
             System.err.println("Estoy ejecutando la opcion de Administracion Recetas");
             new ControladorRecetas();
             break;
         case "Administracion Usuarios":
             System.err.println("Estoy ejecutando la opcion de Administracion Usuarios");
             new ControladorUsuarios();
             break;
         case "Recetas":
             System.err.println("Para consultar recetas");
             break;
         case "Usuarios":
             System.err.println("Para consultar usuarios");
             break;
         case "Salir":
             JOptionPane.showMessageDialog(null, "Hasta Pronto");
             System.exit(0);
             break;
     }
    }
    
    public static void main(String[] args) {
        new ControladorPrincipal(){
            
        };
    }
    
}
