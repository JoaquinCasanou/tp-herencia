package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 35, 450000);

        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: $" + empleado.getSalario());
    }
}
