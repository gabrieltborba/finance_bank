package model

class Conta(private val nomeTitular: String, private val numeroConta: Int) {
    private var saldoTotal = 0.0

    fun welcome() {
        println("Bem vindo ao Bytebank, ${this.nomeTitular} ")
        println("Número da conta: ${this.numeroConta}")
        println("Saldo Total: R$ ${this.saldoTotal}")
        println("------------")
    }

    fun depositar(saldo: Double){
        saldoTotal += saldo
    }

    fun sacar(saldo: Double): Boolean {

        if(saldo < 0.0){
            return false
        }

        if((this.saldoTotal - saldo) < 0.0){
            return false
        }

        saldoTotal -= saldo
        return true
    }

    fun consultaSaldo(): Double {
        return this.saldoTotal
    }


}