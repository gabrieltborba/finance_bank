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

    println(contaGabriel.consultaSaldo())
    contaGabriel.sacar(150.0)
    println(contaGabriel.consultaSaldo())

}

