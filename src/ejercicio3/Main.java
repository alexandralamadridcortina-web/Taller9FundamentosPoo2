package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.marca = "Toyota";
        coche1.modelo = "Corolla";
        coche1.anio = 2018;

        Coche coche2 = new Coche("Mazda", "CX-5", 2022);

        coche1.actualizarKilometraje(15000);
        coche1.actualizarKilometraje(-200);

        coche1.mostrarInformacionDetallada();
        coche2.mostrarInformacion();
    }
}
