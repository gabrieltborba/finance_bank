package br.com.gabrielborba.financebank.model.contas

import br.com.gabrielborba.financebank.infrastructure.ContaService
import br.com.gabrielborba.financebank.model.Cliente

abstract class Conta(
    private var titular: Cliente,
    private val numeroConta: Int
) : ContaService {
    var saldo: Double = 0.0
        protected set

    fun welcome() {
        println("Bem vindo ao Bytebank, ${this.titular} ")
        println("Número da conta: ${this.numeroConta}")
        println("Saldo Total: R$ ${this.saldo}")
        println("------------")
    }

    fun depositar(valor: Double){
        saldo += valor
    }

    abstract fun sacar(valor: Double): Boolean


}