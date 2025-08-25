package ejercicio4;

public class Estudiante {
    public String nombre;
    public int edad;
    public String grado;
    public double promedio;

    public Estudiante() {
        this.promedio = 0;
    }

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.promedio = 0;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre +
                " | Edad: " + edad +
                " | Grado: " + grado +
                " | Promedio: " + promedio);
    }

    public void actualizarPromedio(double nuevoPromedio){
        if(nuevoPromedio >= 0 && nuevoPromedio <= 5) {
            promedio = nuevoPromedio;
            System.out.println("Promedio actualizado a: " + nuevoPromedio);
        }else{
            System.out.println("Promedio invalido");
        }
    }

    public void aprobo(){
        if (promedio >= 3){
            System.out.println(nombre + " aprobo.");
        }else{
            System.out.println(nombre + " no aprobo");
        }
    }
}
