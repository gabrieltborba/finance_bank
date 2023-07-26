package br.com.gabrielborba.financebank.funcionarios

import br.com.gabrielborba.financebank.domain.CalculadorBonificacao
import br.com.gabrielborba.financebank.model.Cliente
import br.com.gabrielborba.financebank.model.funcionarios.Analista
import br.com.gabrielborba.financebank.model.funcionarios.Diretor
import br.com.gabrielborba.financebank.model.funcionarios.Gerente
import br.com.gabrielborba.financebank.domain.SistemaInterno
import io.kotest.core.spec.style.AnnotationSpec
import org.junit.jupiter.api.Assertions

class FuncionariosTeste : AnnotationSpec() {

    @Test
    fun `Should test employee` () {
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

        val joao = Cliente(
            "Joao",
            "99999999935",
            senha = 12346
        )

        println(gabriel.toString())

        val sistema = SistemaInterno()
        sistema.entra(fran, 12340)
        sistema.entra(gui, 12344)
        sistema.entra(joao, 12344)

        val calculadora = CalculadorBonificacao()
        calculadora.registra(gabriel)
        if (fran.logado) calculadora.registra(fran)
        if (gui.logado) calculadora.registra(gui)

        Assertions.assertEquals(9200.0,calculadora.total)
    }
}
