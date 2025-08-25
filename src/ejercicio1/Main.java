package ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numeroCuenta = "001";
        cuenta1.nombreTitular = "Ana Perez";
        cuenta1.tipoCuenta = "Ahorros";

        CuentaBancaria cuenta2 = new CuentaBancaria("002", "Luis Gomez", "Corriente");

        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.retirar(400);
        cuenta1.mostrarDatos();

        cuenta2.depositar(1000);
        cuenta2.retirar(1200);
        cuenta2.retirar(800);
        cuenta2.mostrarDatos();
    }
}
