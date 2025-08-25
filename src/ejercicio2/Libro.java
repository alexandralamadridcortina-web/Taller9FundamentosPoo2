package ejercicio2;

public class Libro {
    public String titulo;
    public String autor;
    public int anioPublicacion;
    public boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public void mostrarDetalles(){
        System.out.println("Titulo: " + titulo +
                " | Autor: " + autor +
                " | Año: " + anioPublicacion +
                " | Disponible " + (disponible ? "Si" : "No"));
    }

    public void devolver() {
        if(!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "'ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible");
        }
    }

    public void prestar(){
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "'Ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "'No está disponible") ;
        }
    }
}
