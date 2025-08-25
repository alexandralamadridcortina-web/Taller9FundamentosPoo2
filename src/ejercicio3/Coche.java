package ejercicio3;

public class Coche {
    public String marca;
    public String modelo;
    public int anio;
    public int kilometraje;

    public Coche(){
        this.kilometraje = 0;
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + anio);
    }

    public void mostrarInformacionDetallada(){
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + anio + " | Kilometraje: " + kilometraje);
    }

    public void actualizarKilometraje(int km){
        if (km > 0) {
            kilometraje += km;
            System.out.println("Kilometraje actualizado + " + km + " km");
        }else {
            System.out.println("Kilometraje invalido");
        }
    }
}
