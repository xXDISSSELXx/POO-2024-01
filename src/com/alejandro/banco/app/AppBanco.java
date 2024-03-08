package com.alejandro.banco.app;

import com.alejandro.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria vanessaCuenta = new CuentaBancaria();

        miCuenta.consignar(1000000);
        miCuenta.retirar(950000);
        miCuenta.transferir(400000, vanessaCuenta);
        miCuenta.mostrarSaldo();
        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();
    }
}
