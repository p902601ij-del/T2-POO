package com.example.tarea_poo


class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun saludar() {
        println("Hola, me llamo $nombre y tengo $edad años")
    }
    fun esMayorDeEdad(): Boolean {
        if (edad >= 18) {
            return true
            } else {
                return false
            }
        }
    }

fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    persona1.saludar()
    println("${persona1.nombre} es mayor de edad: ${persona1.esMayorDeEdad()}")
    val persona2 = Persona("Luis", 15, "León")
    persona2.saludar()
    println("${persona2.nombre} es mayor de edad: ${persona2.esMayorDeEdad()}")
}