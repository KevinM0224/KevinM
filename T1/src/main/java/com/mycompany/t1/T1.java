

package com.mycompany.t1;

import javax.swing.JOptionPane;


public class T1 {

    public static void main(String[] args) {
      /* int[] A = new int [10];
       int [] B = new int [10];
       int p = 1;
       
        for (int i = 0; i < 10; i++) {
            A [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de "+i+ " del arreglo A"));
             B [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de "+i+ " del arreglo B"));
        }
       
        for (int i = 0; i < 10; i++) {
            p*= A[i]*B[i];
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los arreglos A ,B es: "+p);*/
        
        
           int[] A = new int[10];
        int[] B = new int[10];
        double producto = 1;
        for (int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del vector A"));
            B[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del vector B"));
            producto *= A[i] * B[i];
        }
        JOptionPane.showMessageDialog(null, "El producto de los elementos de los vectores A y B es: " + producto);
    }
}
