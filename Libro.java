public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }
    int count;
    public Boolean getPrestamo() {
        if (numEjemplares - numEjemplaresPrestados > 0) {
            count++;
            return true;
        } else {
            return false;
        }
    }

    public Boolean devolucion() {
        return count > 0;
    }

    public void getDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numEjemplares);
        System.out.println("Numero de ejemplares prestados: " + numEjemplaresPrestados);
        System.out.println("Se prestaron libros " + getPrestamo( ));
        System.out.println("Se devolvieron libros " + devolucion( ));
    }

}
