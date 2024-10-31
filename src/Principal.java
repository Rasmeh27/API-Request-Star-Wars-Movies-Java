import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        //clase capaz de realizar una busqueda
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escribe el numero de la pelicula de SW: ");


        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
            System.out.println(pelicula);

            //Llamar al metodo guardar pelicula
            GenerardorArchivo generador = new GenerardorArchivo();
            generador.guardarJson(pelicula);

        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizacion de la aplicacion");
        }

    }
}
