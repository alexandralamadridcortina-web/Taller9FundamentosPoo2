package ejercicio1;

public class CuentaBancaria {
    public String numeroCuenta;
    public String nombreTitular;
    public double saldo;
    public String tipoCuenta;
    public double retirar;

    public CuentaBancaria(){
        this.saldo = 0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public void retirar(double monto){
       if (monto <= 0 ) {
           System.out.println("Monto invalido para retirar");
           return;
       }
       if (saldo >= monto) {
           saldo -= monto;
           System.out.println("Retiro exitoso: $" + monto);
       }else{
           System.out.println("Fondos insuficiente");
       }
    }


    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso: $" + monto);
        }else {
            System.out.println("Monto invalido para depositar.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Cuenta: " + numeroCuenta +
                " | Titular: " + nombreTitular +
                " | Tipo: " + tipoCuenta +
                " | Saldo: $" + saldo);
    }
}


