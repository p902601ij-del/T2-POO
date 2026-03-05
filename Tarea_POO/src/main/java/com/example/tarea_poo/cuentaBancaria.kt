package com.example.tarea_poo

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Depósito exitoso de $cantidad. Nuevo saldo: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro exitoso de $cantidad. Saldo restante: $saldo")
        } else {
            println("Fondos insuficientes para retirar $cantidad. Tu saldo actual es $saldo")
        }
    }
    fun mostrarSaldo() {
        println("El saldo actual del titular $titular es: $saldo")
    }
}


fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)

    cuenta.mostrarSaldo()
}