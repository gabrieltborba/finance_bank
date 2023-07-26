package br.com.gabrielborba.financebank.model.contas

import br.com.gabrielborba.financebank.model.Cliente

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) : Boolean {
        if((this.saldo - valor) < 0.0){
            return false
        }

        this.saldo -= valor
        return true
    }
}