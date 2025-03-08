public enum LibrosDisponibles {

    LIBRO1(1, "Cien años de soledad"),
    LIBRO2(2, "Los fuegos del hambre"),
    LIBRO3(3, "Harry Potter");


    private final int code;
    private final String libro;

    LibrosDisponibles(int code, String libro) {
        this.code = code;
        this.libro = libro;
    }
}
