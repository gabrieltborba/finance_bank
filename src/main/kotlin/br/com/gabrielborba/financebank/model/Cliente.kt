package br.com.gabrielborba.financebank.model

import br.com.gabrielborba.financebank.infrastructure.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    val senha: Int,
    var logado: Boolean = false
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) logado = true
        return logado
    }

    override fun welcome() : String{
        val text = StringBuilder()
            .append("---------------------- \n")
            .append("Bem vindo ao Byte Bank, ${this.nome}")
            .append("----------------------")
        return text.toString()
    }
}