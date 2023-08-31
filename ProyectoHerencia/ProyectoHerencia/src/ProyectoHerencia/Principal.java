
package ProyectoHerencia;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Datos del esudiante","Datos",JOptionPane.ERROR_MESSAGE);
       Estudiante estudiante1 = new Estudiante(0224, 2.3f, "kevin", "martinez", 18);
       estudiante1.mostarDatos();
    }
    
}
