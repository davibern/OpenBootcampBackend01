package segundaparte;

public class Coche {

    private int puertas;

    public void incrementarPuerta() {
        this.puertas++;
    }

    public int numeroPuertas() {
        return this.puertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();

        System.out.println("Numero de puertas: " + miCoche.numeroPuertas());
    }

}
