package ejercicio2;

public class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de puertas: " + cantPuertas);
    }
}
