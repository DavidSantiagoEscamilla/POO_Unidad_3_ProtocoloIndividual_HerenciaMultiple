package ejemploSeis.parteDos;

public interface Nadador {
    default void despegar() {
    System.out.println("Nadador despega.");
    }
}