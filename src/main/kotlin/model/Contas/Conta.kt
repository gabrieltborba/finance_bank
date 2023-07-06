package model.Contas

open class Conta(private var nomeTitular: String, private val numeroConta: Int) {
    var saldo: Double = 0.0
        private set
    fun welcome() {
        println("Bem vindo ao Bytebank, ${this.nomeTitular} ")
        println("Número da conta: ${this.numeroConta}")
        println("Saldo Total: R$ ${this.saldo}")
        println("------------")
    }

    fun depositar(valor: Double){
        saldo += valor
    }

    open fun sacar(valor: Double): Boolean {

        if(valor < 0.0){
            return false
        }

        if((this.saldo - valor) < 0.0){
            return false
        }

        saldo -= valor
        return true
    }

    fun transferir(contaDestino: Conta, valor: Double) : Boolean{

        if(!this.sacar(valor)){
            return false;
        }

        contaDestino.depositar(valor)
        return true;
    }
}