import model.Conta
import model.Diretor
import model.Funcionario
import model.Gerente

fun main() {
    testafuncionario()
    //testaContas()
}

private fun testafuncionario() {
    val gabriel = Funcionario(
        "Gabriel",
        "99999999935",
        salario = 2000.00
    )

    val fran = Gerente(
        "Fran",
        "1111111",
        salario = 8000.00,
        senha = 12340
    )

    val gui = Diretor(
        "Guilherme",
        "222222",
        salario = 15000.00,
        senha = 12345,
        plr = 500.0
    )

    println("nome ${gabriel.nome}")
    println("cpf ${gabriel.cpf}")
    println("salario ${gabriel.salario}")
    println("bonficacao ${gabriel.bonificacao()}")
    println("------------")

    if(fran.autentica(12340)){
        println("------------------")
        println("Gerente ${fran.nome} Autenticada com sucesso")
        println("------------------")
        println("nome ${fran.nome}")
        println("cpf ${fran.cpf}")
        println("salario ${fran.salario}")
        println("bonficacao ${fran.bonificacao()}")
    }

    if(gui.autentica(12345)){
        println("------------------")
        println("Diretor ${gui.nome} Autenticado com sucesso")
        println("------------------")
        println("nome ${gui.nome}")
        println("cpf ${gui.cpf}")
        println("salario ${gui.salario}")
        println("bonficacao ${gui.bonificacao()}")
        println("plr ${gui.plr}")
    }

}

private fun testaContas() {
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

    println(contaGabriel.saldo)
    contaGabriel.transferir(contaMillena, 1225.0)

    contaGabriel.welcome()
    contaMillena.welcome()
}

