package com.desafiocarteira.interfaces

interface Digital {
    fun transferenciaPix(valorPix: Double, chavePix: String)
    fun investir(valorInvestimento: Double)
    fun guardar(valorPoupanca: Double)
}