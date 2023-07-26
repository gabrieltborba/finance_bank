package br.com.gabrielborba.financebank.model.contas

import br.com.gabrielborba.financebank.model.Cliente

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(titular, numeroConta) {
    override fun sacar(valor: Double): Boolean {
        if((this.saldo - valor) < 0.0){
            return false
        }

        this.saldo -= valor
        return true
    }

}