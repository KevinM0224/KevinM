
package BienesRaices;

public class Casa {
   private P propiedad;

    public Casa(double dimensionLargo, double dimensionAncho, int numHabitaciones, int numBanos, String ubicacion) {
        this.propiedad = new P(dimensionLargo, dimensionAncho, numHabitaciones, numBanos, ubicacion);
    }

    public String toString() {
        return "Casa:\n" + propiedad.toString();
    }  
}
