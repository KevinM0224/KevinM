
package nombres;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Nombres {

    
    public static void main(String[] args) {
 int cn = 3;
 String[] nombres = new String [cn];
        for (int i = 0; i < cn; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Digite un nombre " + (i+1) + ":","Nombres",JOptionPane.ERROR_MESSAGE);
        }
        Arrays.sort(nombres);
        
        String resultado = "Nombres organizados ascendentemente: \n";
    for (int i = 0; i < cn; i++) {
           resultado += nombres[i] + "\n";
        }
    JOptionPane.showMessageDialog(null, resultado, "Nombres",JOptionPane.ERROR_MESSAGE );
    }
    
    
}
