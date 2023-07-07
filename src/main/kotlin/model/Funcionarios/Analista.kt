package model.Funcionarios

import kotlin.time.times

open class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome,cpf,salario) {
    override val bonificacao: Double
        get() = salario*0.1 + (this.salario* 0.1)

}