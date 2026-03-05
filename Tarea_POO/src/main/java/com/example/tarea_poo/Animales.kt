package com.example.tarea_poo

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("$nombre esta ladrando: Guau!")
    }
}
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("$nombre esta maullando: Miau!")
    }
}
class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("$nombre esta haciendo: Moo!")
    }
}
// TODO: Crea Gato y Vaca de forma similar
fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato("Garfield", 8)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca("Lola", 7)
    vaca.describirse()
    vaca.hacerSonido()
}