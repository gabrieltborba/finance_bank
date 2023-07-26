package br.com.gabrielborba.financebank.model.funcionarios

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    abstract val bonificacao : Double

    override fun toString(): String {
        val text = StringBuilder()
            .append("---------------------- \n")
            .append("Nome: ${this.nome} \n")
            .append("Cpf: ${this.cpf} \n")
            .append("Cargo: ${this.javaClass.simpleName} \n")
            .append("Salario: R$ ${this.salario} \n")
            .append("Bonficacao: R$ ${this.bonificacao} \n")
            .append("----------------------")
        return text.toString()

    }

}