
package ProyectoHerencia;

import javax.swing.JOptionPane;


public class Estudiante extends Persona{

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    //Definir variables propias de esta clase con encapsulamiento
    private int codigoEstudiante;
    private float notaFinal;
    
    //Metodo para mostar datos
    public void mostarDatos(){
        
        JOptionPane.showMessageDialog(null, "Nombre y apedllido del estudiamte: " + getNombre()+" " + getApellido());
        JOptionPane.showMessageDialog(null, "Edad del estudiante: " + getEdad());
        JOptionPane.showMessageDialog(null, "Codogo del estudiante: " + codigoEstudiante);
        JOptionPane.showMessageDialog(null, "Codogo del estudiante: " + getNotaFinal());
    }


}
