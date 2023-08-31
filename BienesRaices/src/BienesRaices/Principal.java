
package BienesRaices;

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        int numApartamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de apartamentos a registrar:"));
        int numCasas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de casas a registrar:"));

        Apartamento[] apartamentos = new Apartamento[numApartamentos];
        Casa[] casas = new Casa[numCasas];

        for (int i = 0; i < numApartamentos; i++) {
            double largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del apartamento " + (i + 1) + ":"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del apartamento " + (i + 1) + ":"));
            int habitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitaciones del apartamento " + (i + 1) + ":"));
            int banos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de baños del apartamento " + (i + 1) + ":"));
            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del apartamento " + (i + 1) + ":");

            apartamentos[i] = new Apartamento(largo, ancho, habitaciones, banos, ubicacion);
        }

        for (int i = 0; i < numCasas; i++) {
            double largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo de la casa " + (i + 1) + ":"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho de la casa " + (i + 1) + ":"));
            int habitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitaciones de la casa " + (i + 1) + ":"));
            int banos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de baños de la casa " + (i + 1) + ":"));
            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación de la casa " + (i + 1) + ":");

            casas[i] = new Casa(largo, ancho, habitaciones, banos, ubicacion);
        }

        StringBuilder registro = new StringBuilder("Registro de Bienes Raíces:\n\n");
        for (Apartamento apartamento : apartamentos) {
            registro.append(apartamento).append("\n\n");
        }
        for (Casa casa : casas) {
            registro.append(casa).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, registro.toString());
    }
    
}
