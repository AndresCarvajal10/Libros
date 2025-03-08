import java.util.Scanner;

public class MainLibro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de ejemplares: ");
        int numEjemplares = scanner.nextInt();
        System.out.print("Ingrese el número de ejemplares prestados: ");
        int numEjemplaresPrestados = scanner.nextInt();

     Libro detailLibro1 = new Libro(titulo, autor, numEjemplares, numEjemplaresPrestados);
     Libro detailLibro2 = new Libro();
     detailLibro1.getDatos();
    }


}
