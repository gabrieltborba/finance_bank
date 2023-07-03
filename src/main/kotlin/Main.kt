import model.Conta

fun main() {

    val arrayContas = ArrayList<Conta>()

    val contaGabriel = Conta("Gabriel", 1000)
    contaGabriel.depositar(1000.0)
    arrayContas.add(contaGabriel)

    val contaMillena = Conta("Millena", 1001)
    contaMillena.depositar(900.0)
    arrayContas.add(contaMillena)


    arrayContas.forEach { conta ->
        conta.welcome()
    }

    println(contaGabriel.getSaldo())
    contaGabriel.transferir(contaMillena, 1225.0)

    contaGabriel.welcome()
    contaMillena.welcome()

}

