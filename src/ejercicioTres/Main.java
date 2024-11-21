package ejercicioTres;

public class Main {
    public static void main(String[] args) {

        Usuario nuevoUsuario = new Usuario();
        //error de complicación al no existir implementación del método
        nuevoUsuario.actualizarFoto();

        nuevoUsuario.actualizarFoto();
    }
}
