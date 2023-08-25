
/*
.put: 
el método .put() se utiliza para insertar un par clave-valor en un objeto Map. Toma dos argumentos: la clave y el valor que se deben 
insertar en el mapa. Si la clave ya está presente en el mapa, el valor anterior se reemplaza con el nuevo valor. Si la clave no está 
presente, se agrega el nuevo par clave-valor

.containsKey():
 el método containsKey(Object key) se utiliza en las colecciones basadas en clave, como HashMap, para verificar si una clave 
específica está presente en la colección.

HashMap:
es una implementación de la interfaz Map que almacena pares de elementos clave-valor. Es una estructura de datos que 
proporciona un acceso rápido a los elementos basándose en las claves.
*/
package com.mycompany.d1;
import java.util.HashMap;
import javax.swing.JOptionPane;
 //Importo HashMap y JOptionPane
public class D1 {

    public static void main(String[] args) {
       //creo la instancia con la clase Hashmap y la defino con los guenericos que tanto la clave como el valor van a ser de tipo String
        HashMap<String, String> diccionario = new HashMap<>();
        
        boolean seguirAgregando = true;

        while (seguirAgregando) {
            String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
            String sinonimo = JOptionPane.showInputDialog("Ingrese un sinónimo para " + palabra + ":");
            
            //uso el método containsKey() para verificar si la clave específica (palabra) está presente en mi objeto HashMap
            //esto que quiere decir que si es verdadero ira al primer if y este sila clave (palabra)coincide con la que esta registrada en el map
            //esta se concatena una coma y un espacio con la variable sinonimo antes de agregarlo al valor actual de palabra
            if (diccionario.containsKey(palabra)) {
                diccionario.put(palabra, diccionario.get(palabra) + ", " + sinonimo);
            } else {
            //Si la clave palabra no está presente en el diccionario, entonces se ejecutará la segunda parte del if
            //con la función put simplemente agrego una nueva entrada al diccionario con la clave palabra y el valor de sinonimo
                diccionario.put(palabra, sinonimo);
            }

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro sinónimo?", "Agregar sinónimo", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.NO_OPTION) {
                seguirAgregando = false;
            }
        }

        boolean seguirBuscando = true;
        //creo un bucle y le pregunto al usuario que ingrese la palabra a la que quiere conocer los sinonimos
        //inicializo mi variable "seguirBuscando" en true

        while (seguirBuscando) {
            String palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra que desea buscar:");
            String sinónimos = diccionario.get(palabraBuscada);

            if (sinónimos != null) {
                JOptionPane.showMessageDialog(null, "Sinónimos de " + palabraBuscada + ": " + sinónimos);
            } else {
                JOptionPane.showMessageDialog(null, "La palabra " + palabraBuscada + " no tiene sinónimos en este diccionario.");
            }
            
            //pregunto al usuario si desea buscar más sinónimos. Si el usuario responde "no" la variable booleana 
            //"seguirBuscando" se establece en "false" lo que hace que el bucle se detenga y el programa termine.
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea buscar más sinónimos?", "Buscar sinónimos", JOptionPane.YES_NO_OPTION);
            //Si el usuario responde "sí" el bucle continúa y se vuelve a solicitar la entrada de otra palabra para buscar sinónimos.

            if (opcion == JOptionPane.NO_OPTION) {
                seguirBuscando = false;
            }
        }
    }
            
    }
        
    

