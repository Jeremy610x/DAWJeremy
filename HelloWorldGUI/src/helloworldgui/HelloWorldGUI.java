/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldgui;




import javax.swing.*;
import vista.VentanaPrincipal;
import vista.VentanaPrincipalGUID;
/**
 *
 * @author jepa2698
 */
public class HelloWorldGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          ventana_telefono();
        }
    
    
    private static void finestra_principal() {
        JFrame window_principal = new JFrame("Hello World");
        //ficar el tamany si vols direccionar-lo
        window_principal.setSize(400, 300);
        //marcar la opció de tancar la finestra quant apretis x
        window_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ferla visible
        window_principal.setVisible(true);
    }

    private static void clase_ventana_principal() {
         VentanaPrincipal window_principal = new VentanaPrincipal("Hello");
//         window_principal.anyadir_label();

//         window_principal.anyadir_boto();
         window_principal.etiquetasBorderLayout();
         window_principal.setVisible(true);
    }

    private static void ventana_telefono() {
        VentanaPrincipalGUID principal = new VentanaPrincipalGUID("telefono");
        principal.botonesGridLayout();
        principal.setVisible(true);
    }
    
        
        
}
        
        
        
        

        
    
    

