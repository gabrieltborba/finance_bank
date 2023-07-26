package br.com.gabrielborba.financebank.infrastructure

interface Autenticavel {
    fun autentica(senha: Int): Boolean
    fun welcome() : String
}