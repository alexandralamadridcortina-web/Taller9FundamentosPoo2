package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Carlos";
        est1.edad = 15;
        est1.grado = "9°";

        Estudiante est2 = new Estudiante("Maria", 16, "10°");

        est1.actualizarPromedio(3.5);
        est1.mostrarDatos();
        est1.aprobo();

        est2.actualizarPromedio(2.8);
        est2.mostrarDatos();
        est2.aprobo();

        est2.actualizarPromedio(5.5);
    }
}
