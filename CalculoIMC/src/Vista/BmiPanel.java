/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Model.BMI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jepa2698
 */
public class BmiPanel extends JPanel implements ActionListener{
    private BMI model;
    
    private JTextField tfWeight;
    private JTextField tfHeight;
    private JTextField tfBMI;
    private ActionListener listener;

    public BmiPanel() {
        listener = this;
        initComponents();
        doClear();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        
        
        
        JLabel lbHeader = new JLabel("bmi Calculator");
        lbHeader.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbHeader,BorderLayout.NORTH);
        
        JPanel form_principal = createBmiform();
        this.add(form_principal,BorderLayout.CENTER);
        
        
        
    }

    private JPanel createBmiform() {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(0,2));
      
      panel.add(new JLabel("Weight"));
      tfWeight = new JTextField(20);
      panel.add(tfWeight);
      
      
      panel.add(new JLabel("Height"));
      tfHeight = new JTextField(20);
      panel.add(tfHeight);
      
      
     
      
      JButton btIMC = new JButton("CALC IMC");
      btIMC.addActionListener(listener);
      btIMC.setActionCommand("calc");
      panel.add(btIMC);
      
      JButton btClear = new JButton("Clear");
      
      
      btClear.addActionListener(listener);
      btClear.setActionCommand("clear");
      panel.add(btClear);
      
       panel.add(new JLabel("Result"));
      tfBMI = new JTextField(20);
      tfBMI.setEditable(false);
      panel.add(tfBMI);
      return panel;
      
    }

    private void doClear() {
       tfWeight.setText("0.0");
       tfHeight.setText("0.0");
       tfBMI.setText("0.0");
       
       
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action){
            case"clear":
            doClear();
            break;
            case"calc":
                doCalculate();
               
                break;
                
                
                
                
        
        }
    }

    private void doCalculate() {
        String sWeight = tfWeight.getText();
         String sHeight = tfHeight.getText();
    
    double weight = Double.parseDouble(sWeight);
     double height = Double.parseDouble(sHeight);
     
     model = new BMI(weight, height);
     double result =model.bmiCalc();
     tfBMI.setText(String.valueOf(result));
     
     
     
    }
    
    
    
}
