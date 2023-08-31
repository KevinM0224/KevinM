
package BienesRaices;

/**
 *
 * @author kevin
 */
public class Apartamento {
     private P propiedad;

    public Apartamento(double dimensionLargo, double dimensionAncho, int numHabitaciones, int numBanos, String ubicacion) {
        this.propiedad = new P(dimensionLargo, dimensionAncho, numHabitaciones, numBanos, ubicacion);
    }

 
    public String toString() {
        return "Apartamento:\n" + propiedad.toString();
    }
}
