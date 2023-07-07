package model.Funcionarios

import model.Funcionarios.Funcionario

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
): Funcionario(nome = nome,cpf = cpf, salario = salario)  {

    override val bonificacao: Double
        get() = salario*0.1 + salario + plr


    fun autentica(senha: Int) : Boolean{
        return this.senha == senha
    }
}