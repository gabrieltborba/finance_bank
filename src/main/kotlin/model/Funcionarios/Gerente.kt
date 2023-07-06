package model.Funcionarios

import model.Funcionarios.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(nome = nome,cpf = cpf, salario = salario)  {

    override val bonificacao: Double
        get() = super.bonificacao + salario


    fun autentica(senha: Int) : Boolean{
        return this.senha == senha
    }
}