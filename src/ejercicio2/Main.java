package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967);

        libro1.mostrarDetalles();
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();
        libro1.prestar();
        libro1.mostrarDetalles();
    }
}
