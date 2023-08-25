
package arreglosbidimensionales;

import javax.swing.JOptionPane;


public class ArreglosBidimensionales {

    
    public static void main(String[] args) {
     
        
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas de la matriz:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas de la matriz:"));
      
        
        
        int[][] matriz = new int[filas][columnas];
        
     
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String valor = JOptionPane.showInputDialog(null,"Ingrese el valor de la nota en fila " + i + ", columna " + j,"Notas",JOptionPane.WARNING_MESSAGE);
                matriz[i][j] = Integer.parseInt(valor);
            }
        }
        
      
        String resultado = "Notas:";
        for (int i = 0; i < filas; i++) {
            resultado += "\n | ";
            for (int j = 0; j < columnas; j++) {
                resultado += matriz[i][j] + "\t | ";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
