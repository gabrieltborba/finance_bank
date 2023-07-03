package model

class Conta(private val nomeTitular: String, private val numeroConta: Int) {
    private var saldoTotal = 0.0

    fun welcome() {
        println("Bem vindo ao Bytebank, ${this.nomeTitular} ")
        println("Número da conta: ${this.numeroConta}")
        println("Saldo Total: R$ ${this.saldoTotal}")
        println("------------")
    }

    fun depositar(valor: Double){
        saldoTotal += valor
    }

    fun sacar(valor: Double): Boolean {

        if(valor < 0.0){
            return false
        }

        if((this.saldoTotal - valor) < 0.0){
            return false
        }

        saldoTotal -= valor
        return true
    }

    fun transfere(contaDestino: Conta, valor: Double) : Boolean{

        if(!sacar(valor)){
            return false;
        }

        contaDestino.depositar(valor)
        return true;

    }

    fun consultaSaldo(): Double {
        return this.saldoTotal
    }


}