package br.com.gabrielborba.financebank.domain

import br.com.gabrielborba.financebank.model.funcionarios.Funcionario

class CalculadorBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}