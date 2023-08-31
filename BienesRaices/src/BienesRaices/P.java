
package BienesRaices;


public class P {
   private double largo;
   private double ancho;
   private int nH;
   private int nB;
   private String ubi;

    public P(double largo, double ancho, int nH, int nB, String ubi) {
        this.largo = largo;
        this.ancho = ancho;
        this.nH = nH;
        this.nB = nB;
        this.ubi = ubi;
    }
     public String toString() {
        return "Dimensiones: " + largo + "x" + ancho + "\n" +
               "Habitaciones: " + nH + "\n" +
               "Baños: " + nB + "\n" +
               "Ubicación: " + ubi;
    }
}
