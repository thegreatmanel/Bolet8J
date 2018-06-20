/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin8 {

 
    public static void Ejewhile(){
   int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
   
    while(numero<10){JOptionPane.showMessageDialog(null, "O número era"+ numero);}
    
    }
    public static void main(String[] args) {
        Ejewhile();
    }
    
}
