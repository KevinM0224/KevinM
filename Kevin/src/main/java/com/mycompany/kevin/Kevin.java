

package com.mycompany.kevin;


public class Kevin {

    public static void main(String[] args) {
        /*
        
        
        ---ENTRADA Y SALIDA X CONSOLA ---
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese la cadena");
        cadena = entrada.nextLine();
        System.out.println("La palabra que ingreso es que ingreso es: "+cadena);
        String cadena;
        int entero;
        double decimal;
        char letra;
        
        
        ---ENTRADA---
        cadena = JOptionPane.showInputDialog("Digite un nombre");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        
        
        ---SALIDA---
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero es: "+entero);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        
        
        --- Operadores ---
        int n1,n2,suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dos numeros");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        suma = n1+n2;
        System.out.println("El resultado es: "+suma);
        Scanner entrada = new Scanner(System.in);
        int numero = 10;
        numero+= 5;
        System.out.println(""+numero);
        
        
        --- OPERADORES CON CLASE MATH ---
        double potencia = Math.pow(3, 2);
        Scanner entrada = new Scanner(System.in);
        System.out.println(""+potencia);
        int numero = 10;
        double raiz = Math.sqrt(numero);
        numero /=raiz;
        JOptionPane.showMessageDialog(null, "El numero es: "+numero);
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado"));
        int area = (int)Math.pow(entero, entero);
        JOptionPane.showMessageDialog(null, "El area es de: "+area);
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        int resto = n1%n2;
        int diferencia = Math.abs(n1-n2);
        if (resto ==  0) {
        JOptionPane.showMessageDialog(null, "El primer numero es multiplo del segundo");
        }
        if (resto !=0) {
        JOptionPane.showMessageDialog(null, "El primer numero es multiplo del primero");
        }
        int numero = 18;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita tu edad"));
        if (n1>=numero) {
        JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }else {
        JOptionPane.showMessageDialog(null, "No eres mayor de edad");
        }
        }
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        if (n1>0) {
        JOptionPane.showMessageDialog(null, ""+n1 +" Es positivo");
        }
        else if (n1==0) {
        JOptionPane.showMessageDialog(null, ""+n1 +" Es igual a 0");
        }
        else    {
        JOptionPane.showMessageDialog(null, ""+n1 +" El numero es negativo");
        }
        char letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        if (letra=='a'|| letra=='e'||letra=='i'|| letra=='o'|| letra=='u') {
        JOptionPane.showMessageDialog(null, ""+letra +" es una vocal");
        }
        else    {
        JOptionPane.showMessageDialog(null, ""+letra +"  es una consonate");
        }
        
        
        --- USO DEL SWITH ---
        Mientras que con switch podremos evaluar múltiples decisiones y ejecutar un bloque asociado a cada una de ellas*/
        /*  int i = 2;
        switch(i) {
        case 0:
        System.out.println("i es cero.");
        break;
        case 1:
        System.out.println("i es uno.");
        break;
        case 2:
        System.out.println("i es dos.");
        break;
        case 3:
        System.out.println("i es tres.");
        break;
        default:
        System.out.println("i es mayor a tres.");
        }
        String tipoDia = "";
        String diaSemana = "domingo";
        switch (diaSemana.toLowerCase()) {
        case "lunes":
        tipoDia = "Inicio de semana";
        break;
        case "martes":
        case "míercoles":
        case "jueves":
        tipoDia = "Mediados de semana";
        break;
        case "viernes":
        tipoDia = "Inicio de fin se semana";
        break;
        case "sábado":
        case "domingo":
        tipoDia = "Fin de seman";
        break;
        }
        System.out.println(diaSemana + " es " + tipoDia);*/
        
        
        //--USO DEL WHILE--
        /* int a = 0;
        while (a<10) {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }*/
        
        
        //---USO DEL DO WHILE---
        /*int a = 0;
        do {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        } while (a<10);*/
             
        
        
        //---USO DEL CICLO FOR--
        
       /* for (int i = 0; i < 10; i+=1) {
            JOptionPane.showMessageDialog(null, "El numero es: "+i);
        }
       
       //--MENU--
      
             //---BLOQUE DE TEXTO---

       int entero = 0;
      entero = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               MENU PRINCIPAL
                                                               1.SUMA
                                                               2.RESTA
                                                               3.SALIR
                                                               """));
     
       
       
       
       
      
       int op = 0;
        do {            
             op = Integer.parseInt(JOptionPane.showInputDialog(
             "MENU PRINCIPAL\n"
            +"1.SUMA\n"
            +"2.Resta\n"
            +"3.Salir\n"));
           
            
            switch (op) {
                case 1 -> {
                    int total,i;
                    int cn = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a sumar"));
                    total = 0;
                    for(i = 1; i <= cn; i++)
                    {
                        int nn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero (" + i + ") : "));
                        total = total + nn;
                    }          JOptionPane.showMessageDialog(null, "La suma total de los numeros es : " + total);
               }
                    case 2 -> {
                   int cn = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a restar"));
                   int total = 0;
                   int i;
                   for(i = 1; i <= cn; i++)
                   {
                       int nn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero (" + i + ") : "));
                       total = total + (nn-nn);
                   }          JOptionPane.showMessageDialog(null, "La resta total de los numeros es : " + total);
               }
                    case 3 -> op =3;
                default -> JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (op!=3);
        System.exit(0);/*  
        
        
        --ARREGLOS--
         
int[] numeros = new int[5];
        
        // Solicitamos los valores del arreglo al usuario
        for (int i = 0; i < numeros.length; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor del elemento " + i);
            numeros[i] = Integer.parseInt(valor);
        }
        
        // Imprimimos los valores del arreglo
        String resultado = "Valores del arreglo:";
        for (int i = 0; i < numeros.length; i++) {
            resultado += "\n" + numeros[i];
        }
        JOptionPane.showMessageDialog(null, resultado);
        
        
        //--MATRIZ--
        
         // Solicitamos la cantidad de filas y columnas al usuario
        String strFilas = JOptionPane.showInputDialog("Ingrese la cantidad de filas de la matriz:");
        String strColumnas = JOptionPane.showInputDialog("Ingrese la cantidad de columnas de la matriz:");
        
        int filas = Integer.parseInt(strFilas);
        int columnas = Integer.parseInt(strColumnas);
        
        // Creamos la matriz
        int[][] matriz = new int[filas][columnas];
        
        // Solicitamos los valores de la matriz al usuario
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String valor = JOptionPane.showInputDialog("Ingrese el valor de la fila " + i + ", columna " + j);
                matriz[i][j] = Integer.parseInt(valor);
            }
        }
        
        // Imprimimos los valores de la matriz
        String resultado = "Valores de la matriz:";
        for (int i = 0; i < filas; i++) {
            resultado += "\n";
            for (int j = 0; j < columnas; j++) {
                resultado += matriz[i][j] + "\t";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
        
        
    // Crear un arreglo de objetos para los botones
        Object[] botones = {"Sumar", "Restar"};
        
        // Mostrar el diálogo con los botones y obtener la opción seleccionada
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Selecciona una opción","Menu", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, botones, botones[0]);
        
        // Realizar una acción dependiendo de la opción seleccionada
        switch (opcionSeleccionada) {
                case JOptionPane.YES_OPTION -> {
                    int total,i;
                    int cn = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a sumar"));
                    total = 0;
                    for(i = 1; i <= cn; i++)
                    {
                        int nn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero (" + i + ") : "));
                        total = total + nn;
                    }          JOptionPane.showMessageDialog(null, "La suma total de los numeros es : " + total);
               }
                    case JOptionPane.NO_OPTION -> {
                   int cn = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a restar"));
                   int total = 0;
                   int i;
                   for(i = 1; i <= cn; i++)
                   {
                       int nn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero (" + i + ") : "));
                       total = total + (nn-nn);
                   }          JOptionPane.showMessageDialog(null, "La resta total de los numeros es : " + total);
               }
      
        }
        
        --ICONOS JOPTION--
        JOptionPane.ERROR_MESSAGE: Muestra un ícono de error (una "X" en un círculo rojo).
JOptionPane.INFORMATION_MESSAGE: Muestra un ícono de información (una "i" en un círculo azul).
JOptionPane.WARNING_MESSAGE: Muestra un ícono de advertencia (un triángulo amarillo con un signo de exclamación).
JOptionPane.QUESTION_MESSAGE: Muestra un ícono de pregunta (un signo de interrogación).
JOptionPane.PLAIN_MESSAGE: No muestra un ícono, solo un cuadro de diálogo sin ícono.
        
        
        --Uso del GET--
        public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan");

        // Usar el método getNombre para obtener el nombre de la persona
        String nombreDeLaPersona = persona.getNombre();

        // Mostrar el nombre en un método void
        mostrarNombre(nombreDeLaPersona);
    }

    public static void mostrarNombre(String nombre) {
        System.out.println("El nombre de la persona es: " + nombre);
    }
}La clase Persona tiene un atributo privado llamado nombre y un método "getter" llamado getNombre que permite obtener el valor del atributo nombre.
En el método main, creamos una instancia de Persona llamada persona con el nombre "Juan".
Luego, utilizamos el método getNombre para obtener el nombre de la persona y lo almacenamos en la variable nombreDeLaPersona.
Finalmente, llamamos al método mostrarNombre y pasamos el nombre obtenido como argumento para mostrarlo en la consola.
Este es un ejemplo sencillo de cómo utilizar un método "getter" para acceder a un atributo privado de una clase y mostrarlo en un método void.
        
        
        */


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }//void
}//clase
