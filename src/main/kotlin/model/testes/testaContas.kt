import model.Contas.Conta
import model.Contas.ContaCorrente
import model.Contas.ContaPoupanca

fun testaContas() {
        val arrayContas = ArrayList<Conta>()

        val contaGabriel = ContaCorrente("Gabriel", 1000)
        contaGabriel.depositar(1000.0)
        arrayContas.add(contaGabriel)

        val contaMillena = ContaPoupanca("Millena", 1001)
        contaMillena.depositar(900.0)
        arrayContas.add(contaMillena)

        arrayContas.forEach { conta ->
            conta.welcome()
        }

        println(contaGabriel.saldo)
        contaGabriel.transferir(contaMillena, 200.0)
        contaGabriel.sacar(100.00)
        contaMillena.sacar(300.00)

        contaGabriel.welcome()
        contaMillena.welcome()
    }


