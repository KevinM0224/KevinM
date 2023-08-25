/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

import javax.swing.JOptionPane;


public class MetodoBurbuja {

   
    public static void main(String[] args) {
          int[] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el valor de la venta " + (i + 1) + ":" );
            arreglo[i] = Integer.parseInt(input);
        }

        
        mB(arreglo);

        
        String mensaje = ("Ventas:\n "); 
        for (int i = 0; i < arreglo.length; i++) {
          mensaje += arreglo[i] + " \n ";
        }
        JOptionPane.showMessageDialog(null, mensaje,"Valores de ventas",JOptionPane.ERROR_MESSAGE);
    }

    public static void mB(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                  //Si quiero q sean de menor a mayor nomas debo cambiar a > el if
                if (arreglo[i - 1] < arreglo[i]) {
                   
                    int temp = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
    }
    
}
