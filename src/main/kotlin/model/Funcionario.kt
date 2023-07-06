package model

import kotlin.time.times

open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    open fun bonificacao(): Double = salario * 0.1

}