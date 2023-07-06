package model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(nome = nome,cpf = cpf, salario = salario)  {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int) : Boolean{
        return this.senha == senha
    }
}