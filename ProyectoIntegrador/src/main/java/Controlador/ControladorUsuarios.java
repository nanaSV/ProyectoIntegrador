/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmUsuarios;
import Vista.PanelBotones;
import Vista.PanelUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nanas
 */
public class ControladorUsuarios implements ActionListener{
         private FrmUsuarios frmUsuarios;
         private PanelBotones panelBotones;
         private PanelUsuario panelUsuario;

    public ControladorUsuarios() {
        frmUsuarios= new FrmUsuarios(this);
        panelBotones= frmUsuarios.getBotones();
        panelUsuario= frmUsuarios.getPanel();
        frmUsuarios.setVisible(true);
    }
       

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
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
                frmUsuarios.dispose();
                break;
        }
    }

}
