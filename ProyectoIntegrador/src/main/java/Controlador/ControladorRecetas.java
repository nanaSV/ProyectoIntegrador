/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmRecetas;
import Vista.PanelBotones;
import Vista.PanelReceta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nanas
 */
public class ControladorRecetas implements ActionListener{
      private FrmRecetas frmRecetas;
      private PanelBotones panelBotones;
      private PanelReceta panelRecetas;


    public ControladorRecetas() {
        frmRecetas= new FrmRecetas(this);
        panelBotones= frmRecetas.getBotones();
        panelRecetas= frmRecetas.getPanel();
       
        frmRecetas.setVisible(true);
    }

      
      
    public void actionPerformed(ActionEvent e) {
     switch(e.getActionCommand()){
         case "Consultar":
             System.err.println("Estoy ejecutando la opcion de consultar");
             break;
         case "Agregar":
             System.err.println("Estoy ejecutando la opcion de agregar");
             break;
         case "Modificar":
             System.err.println("Estoy ejecutando la opcion de modificar");
             break;
         case "Eliminar":
             System.err.println("Estoy ejecutando la opcion de eliminar");
             break;
         case "Salir":
             JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
            frmRecetas.dispose();
             break;
     }
    }

  }
