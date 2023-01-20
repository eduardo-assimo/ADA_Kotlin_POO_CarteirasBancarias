package com.desafiocarteira.objects

abstract class Cliente(
    val nome: String,
    val sobrenome: String,
    private val cpf: String,
    private val senha: String,
    val plano: String) {

}