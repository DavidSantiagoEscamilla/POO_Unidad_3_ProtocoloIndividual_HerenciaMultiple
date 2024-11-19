package herenciaMultiple.ejercicioUno;

public class Ave implements Volador, Cantante{
    @Override
    public void volar() {
        System.out.println("Las aves pueden volar.");
    }

    public void cantar() {
        System.out.println("Las aves pueden cantar.");
    }
}
