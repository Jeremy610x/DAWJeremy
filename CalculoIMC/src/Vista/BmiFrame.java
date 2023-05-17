/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author jepa2698
 */
public class BmiFrame extends JFrame implements ActionListener{
    private ActionListener listener;
    
    private BmiPanel bmiPanel;
    
    public BmiFrame(){
    
    listener = this;
    
    initComponents();
    
    }
    
    
    
    

    
    
    private void initComponents(){
    
    this.setTitle("IMC CALULADORA");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //menu
    
    setUpMenu();
    
    
    
    
    
    //panell
    displayBmiPanel();
    //TAMANY
    
    setSize(100,300);
    
    
        setLocationRelativeTo(null);// center of Screen
    
    }

    private void setUpMenu() {
       JMenuBar menuBar = new JMenuBar();//barra principal
       JMenu menu;
       
       JMenuItem menuItem;
       
       menu = new JMenu("File");
       
       
       menuItem = new JMenuItem("calc");
       menuItem.setActionCommand("calc");
       menuItem.addActionListener(listener);
       menu.add(menuItem);
       menuItem = new JMenuItem("exit");
       menuItem.addActionListener(listener);
       menuItem.setActionCommand("exit");
       menu.add(menuItem);
       
       menuBar.add(menu);
       
       
       menu = new JMenu("About");
       
       
       menuItem = new JMenuItem("Acerca de ");
        menuItem.addActionListener(listener);
        menuItem.setActionCommand("about");
       menu.add(menuItem);
       
            menuBar.add(menu);
       
       
       
     this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action){
        
            case "exit":
                doExit();
                break;
            case "calc":
                   System.out.println("Hem fet clic al menu" + action);
                break;
            case "about":
                showAbout();
                break;
        }
        
        System.out.println("Hem fet clic al menu" + action);
    }

    private void doExit() {
              int option = JOptionPane.showConfirmDialog(this,"quieres salir",
               "salir ",JOptionPane.YES_NO_OPTION);
         if(option==0){
        System.exit(0);
         }
         }

    private void showAbout() {
       JOptionPane.showMessageDialog(this,"Ceado por JEREMY",
               "Acerca de ",JOptionPane.INFORMATION_MESSAGE);
    }

    private void displayBmiPanel() {
        
        bmiPanel = new BmiPanel();
        //JFrame 
        this.setContentPane(bmiPanel);
        this.validate();
        
        
      
    }
}
