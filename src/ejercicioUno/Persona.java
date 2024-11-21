package ejercicioUno;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando: ¡Hola, cómo estás!");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando: Terminando el informe.");
    }
}
