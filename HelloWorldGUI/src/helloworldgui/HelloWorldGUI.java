/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldgui;




import javax.swing.*;
import vista.VentanaPrincipal;
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
        
        JFrame windows_principal = new JFrame("Hello World  ");
        windows_principal.setSize(800, 800);
        windows_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows_principal.setVisible(true);
        
        clase_ventana_principal();

    }
           public static void clase_ventana_principal(){
           
           VentanaPrincipal window_principal = new VentanaPrincipal("Hello");
           window_principal.anyadirlabel();
           window_principal.anyadirboto();
           window_principal.setVisible(true);
           
           
           
           
           }
        
        }
        
        
        
        
        
        
        

        
    
    

