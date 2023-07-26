package br.com.gabrielborba.financebank.infrastructure

import br.com.gabrielborba.financebank.model.contas.Conta
import br.com.gabrielborba.financebank.model.contas.ContaSalario

interface ContaService {

    fun transferir(contaInicio: Conta, contaDestino: Conta, valor: Double) : Boolean{
        if(contaInicio.javaClass.simpleName == ContaSalario::class.simpleName)
            return false

        if(!contaInicio.sacar(valor))
            return false

        contaDestino.depositar(valor)
        return true;
    }


}