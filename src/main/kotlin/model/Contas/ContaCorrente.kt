package model.Contas

class ContaCorrente(
    nomeTitular: String,
    numeroConta: Int
) : Conta(nomeTitular, numeroConta) {

    override fun sacar(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1
        return super.sacar(valorComTaxa)
    }
}