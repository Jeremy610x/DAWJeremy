/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author jepa2698
 */
public class VentanaPrincipal extends JFrame{
    
    
    
    
    public VentanaPrincipal(String titulo)
    {
        super(titulo);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void anyadir_label()
    {
       JLabel etiqueta = new JLabel("Hello World!!!");
       
       
       this.getContentPane().add(etiqueta);

    }
    
    //afegir jbutton a la finestra
    public void anyadir_boto()
    {
         JButton boton = new JButton("aprieta");
          boton.setSize(30, 30);
          this.getContentPane().add(boton);
    }
    
    public void etiquetasBorderLayout()
    {
        //recupero contenedor
        Container panel_contenedor = this.getContentPane();
        //indico el layout del contendor
        panel_contenedor.setLayout(new BorderLayout());
        
        //componentes
        JLabel[] etiquetas = new JLabel[5];

        etiquetas[0] = new JLabel("superior");
        etiquetas[0].setBackground(Color.RED);
        etiquetas[1] = new JLabel("inferior");
        etiquetas[1].setBackground(Color.BLUE);
        etiquetas[2] = new JLabel("centro");
        etiquetas[2].setBackground(Color.GREEN);
        etiquetas[3] = new JLabel("izquierda");
        etiquetas[3].setBackground(Color.CYAN);
        etiquetas[4] = new JLabel("derecha");
        etiquetas[4].setBackground(Color.ORANGE);
        
        for (int i = 0; i < etiquetas.length; i++) {
            //lletres estiguin al centre
            etiquetas[i].setHorizontalAlignment(SwingConstants.CENTER);
            etiquetas[i].setOpaque(true);
        }
        JButton boton = new JButton("aprieta");
        //boton.setBackground(Color.MAGENTA);
        panel_contenedor.add(etiquetas[0], BorderLayout.NORTH);
        //panel_contenedor.add(etiquetas[1], BorderLayout.SOUTH);
        panel_contenedor.add(boton,BorderLayout.SOUTH);
        panel_contenedor.add(etiquetas[2], BorderLayout.CENTER);
        panel_contenedor.add(etiquetas[3], BorderLayout.WEST);
        panel_contenedor.add(etiquetas[4], BorderLayout.EAST);
        
        this.setSize(300, 200);
        
    }
      
      
}
