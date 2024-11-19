package ejercicioTres;

public class Usuario implements ActualizarUsuario {
    //Esta mala practica rompe con el principio de segregación de interfaces.
    //Este sugiere que las clases no deben estar obligadas a implementar metodos que no usan
    //ya que aumenta la complejidad, reduce la cohesión entre clases, gnera codigo sin uso rompiendo
    // la regla de la responsabilidad unica.
    public void actualizarPrecios() {
        System.out.println("Cambiando los precios de los productos.");
    }
}
