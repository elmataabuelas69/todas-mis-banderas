package com.example.allflagsofcountriesworld.models

class Farenheit(override var number: Double): Tipos_de_grados() {
    override var symbol: Char = '°'
    override var unidad: Char = 'F'
    fun Parse(C: Celcius){

    }
    fun Parse(K: Kelvin){

    }
}