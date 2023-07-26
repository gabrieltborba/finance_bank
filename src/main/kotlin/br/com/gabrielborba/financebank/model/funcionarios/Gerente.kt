package br.com.gabrielborba.financebank.model.funcionarios

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(nome = nome,cpf = cpf, salario = salario, senha= senha)  {

    override val bonificacao: Double
        get() = salario*0.1 + salario

}