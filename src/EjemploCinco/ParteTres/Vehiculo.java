package EjemploCinco.ParteDos;

public interface Vehiculo {
    void acelerar();
    default void encender() {
    System.out.println("El vehículo está encendido.");
    }
}