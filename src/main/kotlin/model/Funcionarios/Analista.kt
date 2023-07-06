package model.Funcionarios

import kotlin.time.times

open class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome,cpf,salario) {
    override val bonificacao: Double
        get() = super.bonificacao + (this.salario* 0.1)

}