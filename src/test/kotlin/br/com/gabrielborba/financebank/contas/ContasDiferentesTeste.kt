package br.com.gabrielborba.financebank.contas

import br.com.gabrielborba.financebank.model.Cliente
import br.com.gabrielborba.financebank.model.contas.ContaCorrente
import br.com.gabrielborba.financebank.model.contas.ContaPoupanca
import br.com.gabrielborba.financebank.model.contas.ContaSalario
import io.kotest.core.spec.style.AnnotationSpec
import org.junit.jupiter.api.Assertions

class ContasDiferentesTeste : AnnotationSpec() {


    @Test
    fun `Should different account` (){
        val alex = Cliente("Alex","123456",12345,false)
        val fran = Cliente("Fran","654321",12345,false)
        val joao = Cliente("Joao","112233",12345,false)

        val contaCorrente = ContaCorrente(
            titular = alex,
            numeroConta = 1000
        )
        val contaPoupanca = ContaPoupanca(
            titular = fran,
            numeroConta = 1001
        )

        val contaSalario = ContaSalario(
            titular = joao,
            numeroConta = 1999
        )

        contaCorrente.depositar(1000.0)
        contaPoupanca.depositar(1000.0)
        contaSalario.depositar(1500.0)

        println("saldo corrente: ${contaCorrente.saldo}")
        println("saldo poupança: ${contaPoupanca.saldo}")
        println("saldo salario: ${contaSalario.saldo}")

        contaCorrente.sacar(100.0)
        contaPoupanca.sacar(100.0)

        println("saldo após saque corrente: ${contaCorrente.saldo}")
        println("saldo após saque poupança: ${contaPoupanca.saldo}")

        contaCorrente.transferir(contaCorrente, contaPoupanca,100.0)

        println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
        println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

        contaPoupanca.transferir(contaInicio = contaPoupanca, valor = 200.0, contaDestino = contaCorrente)

        println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
        println("saldo corrente após receber transferência: ${contaCorrente.saldo}")


        contaPoupanca.transferir(contaInicio = contaSalario, valor = 500.0, contaDestino = contaPoupanca)

        println("saldo salario após transferir para poupanca: ${contaSalario.saldo}")
        println("saldo poupanca após receber transferência: ${contaPoupanca.saldo}")

        Assertions.assertEquals(999.8, contaCorrente.saldo)
        Assertions.assertEquals(800.0,contaPoupanca.saldo)
        Assertions.assertEquals(1500.0,contaSalario.saldo)
    }



}
