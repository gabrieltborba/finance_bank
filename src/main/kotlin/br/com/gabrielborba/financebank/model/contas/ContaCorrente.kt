package br.com.gabrielborba.financebank.model.contas

import br.com.gabrielborba.financebank.model.Cliente

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(titular, numeroConta) {

    override fun sacar(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1

        if(this.saldo < valorComTaxa){
            return false
        }

        this.saldo -= valorComTaxa
        return true
    }
}