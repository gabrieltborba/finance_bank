package model.Contas

class ContaPoupanca(
    nomeTitular: String,
    numeroConta: Int
) : Conta(nomeTitular, numeroConta) {
    override fun sacar(valor: Double): Boolean {
        if((this.saldo - valor) < 0.0){
            return false
        }

        this.saldo -= valor
        return true
    }

}