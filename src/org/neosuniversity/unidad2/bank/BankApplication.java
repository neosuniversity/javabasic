package org.neosuniversity.unidad2.bank;

public class BankApplication {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.deposito(-34);
        cuenta.deposito(4555);
        cuenta.imprimirSaldo();

        Cuenta cuenta2 = new Cuenta(50000);
        cuenta2.retiro(51000);
        cuenta2.imprimirSaldo();

        cuenta.traspaso(cuenta2, 50000);
        cuenta2.imprimirSaldo();
        cuenta.imprimirSaldo();

    }
}
