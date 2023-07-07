package model.testes

import model.CalculadorBonificacao
import model.Funcionarios.Analista
import model.Funcionarios.Diretor
import model.Funcionarios.Gerente
fun testafuncionarios() {
    val gabriel = Analista(
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

    println(gabriel.toString())

    if(fran.autentica(12340)){
        println(fran.toString())
    }

    if(gui.autentica(12345)){
        println(gui.toString())
    }

    val calculadora = CalculadorBonificacao()
    calculadora.registra(gabriel)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("Bonificacao Total: R$ ${calculadora.total}")

}
