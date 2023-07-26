package br.com.gabrielborba.financebank.model.funcionarios

import br.com.gabrielborba.financebank.infrastructure.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var logado: Boolean = false
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) logado = true
        return logado
    }
    override fun welcome() : String {
        return super.toString()
    }

}