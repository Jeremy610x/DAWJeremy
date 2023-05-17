/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author jepa2698
 */
public class VentanaPrincipalGUID extends JFrame {
 
    public VentanaPrincipalGUID(String titulo)
    {
        super(titulo);
        //this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    

    
    public void botonesGridLayout()
    {
        //recupero contenedor
        Container panel_contenedor = this.getContentPane();
        //indico el layout del contendor
        GridLayout gl = new GridLayout(4, 3);
        gl.setHgap(5);
        gl.setVgap(5);
        panel_contenedor.setLayout(gl);
        
        for (int i = 1; i <=9; i++) {
            panel_contenedor.add(new JButton(String.valueOf(i)));
        }
        
        panel_contenedor.add(new JButton("*"));
        panel_contenedor.add(new JButton("0"));
        panel_contenedor.add(new JButton("#"));
        //componentes
        this.setSize(400, 300);
        
        
        
    }
    
    
}
