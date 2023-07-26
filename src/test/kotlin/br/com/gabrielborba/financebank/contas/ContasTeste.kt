import br.com.gabrielborba.financebank.model.Cliente
import br.com.gabrielborba.financebank.model.contas.Conta
import br.com.gabrielborba.financebank.model.contas.ContaCorrente
import br.com.gabrielborba.financebank.model.contas.ContaPoupanca
import io.kotest.core.spec.style.AnnotationSpec
import org.junit.jupiter.api.Assertions

class ContasTeste : AnnotationSpec() {

        @Test
        fun `Should teste account `(){
                val arrayContas = ArrayList<Conta>()

                val gabriel = Cliente("Gabriel","11111",1234,false)
                val contaGabriel = ContaCorrente(gabriel, 1000)
                contaGabriel.depositar(1000.0)
                arrayContas.add(contaGabriel)

                val millena = Cliente("Millena","222222",12345,false)
                val contaMillena = ContaPoupanca(millena, 1001)
                contaMillena.depositar(900.0)
                arrayContas.add(contaMillena)

                contaGabriel.transferir(contaGabriel,contaMillena, valor = 200.0)
                contaGabriel.sacar(100.00)
                contaMillena.sacar(300.00)

                Assertions.assertEquals(699.8, contaGabriel.saldo)
                Assertions.assertEquals(800.0,contaMillena.saldo)
        }

    }


