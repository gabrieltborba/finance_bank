package model.testes

import model.CalculadorBonificacao
import model.Funcionarios.Analista
import model.Funcionarios.Diretor
import model.Funcionarios.Funcionario
import model.Funcionarios.Gerente

class TestaFuncionarios {

    fun testafuncionario() {
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

        val marcos = Analista(
            "Marcos",
            "3334444",
            salario = 3000.00
        )

        println("nome ${gabriel.nome}")
        println("cpf ${gabriel.cpf}")
        println("salario ${gabriel.salario}")
        println("bonficacao ${gabriel.bonificacao}")
        println("------------")

        if(fran.autentica(12340)){
            println("------------------")
            println("Gerente ${fran.nome} Autenticada com sucesso")
            println("------------------")
            println("nome ${fran.nome}")
            println("cpf ${fran.cpf}")
            println("salario ${fran.salario}")
            println("bonficacao ${fran.bonificacao}")
        }

        if(gui.autentica(12345)){
            println("------------------")
            println("Diretor ${gui.nome} Autenticado com sucesso")
            println("------------------")
            println("nome ${gui.nome}")
            println("cpf ${gui.cpf}")
            println("salario ${gui.salario}")
            println("bonficacao ${gui.bonificacao}")
            println("plr ${gui.plr}")
        }


        println("------------")
        println("nome ${marcos.nome}")
        println("cpf ${marcos.cpf}")
        println("salario ${marcos.salario}")
        println("bonficacao ${marcos.bonificacao}")
        println("------------")


        val calculadora = CalculadorBonificacao()
        calculadora.registra(gabriel)
        calculadora.registra(fran)
        calculadora.registra(gui)
        calculadora.registra(marcos)

        println()
        println("Bonificacao Total: R$ ${calculadora.total}")

    }
}