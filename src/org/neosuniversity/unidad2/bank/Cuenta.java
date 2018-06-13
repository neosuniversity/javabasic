package org.neosuniversity.unidad2.bank;

public class Cuenta {

    private double saldo;

    public Cuenta () {
        saldo = 0;
    }

    public Cuenta (double cant) {
        saldo = cant;
    }

    public void deposito(double deposito) {
        if (deposito <= 0) {
            System.out.println("No es posible realizar el deposito, el deposito debe ser mayor a 0 ");
        } else {
            saldo = saldo + deposito;
        }
    }

    public void traspaso(Cuenta cuenta, double cant) {
        if (cuenta.getSaldo() >= cant) {
            cuenta.retiro(cant);
            deposito(cant);
        }

    }

    public void retiro(double retiro) {
        if (retiro > saldo) {
            System.out.println("No es posible realizar el retiro ya que supera el saldo de la cuenta");
        } else {
            saldo = saldo - retiro;
        }

    }

    public void imprimirSaldo() {
        System.out.println("Saldo de la cuenta: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
