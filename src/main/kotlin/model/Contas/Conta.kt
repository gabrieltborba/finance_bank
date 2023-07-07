package model.Contas

abstract class Conta(private var nomeTitular: String, private val numeroConta: Int) {
    var saldo: Double = 0.0
        protected set

    fun welcome() {
        println("Bem vindo ao Bytebank, ${this.nomeTitular} ")
        println("Número da conta: ${this.numeroConta}")
        println("Saldo Total: R$ ${this.saldo}")
        println("------------")
    }

    fun depositar(valor: Double){
        saldo += valor
    }

    abstract fun sacar(valor: Double): Boolean

    fun transferir(contaDestino: Conta, valor: Double) : Boolean{

        if(!this.sacar(valor)){
            return false;
        }

        contaDestino.depositar(valor)
        return true;
    }
}