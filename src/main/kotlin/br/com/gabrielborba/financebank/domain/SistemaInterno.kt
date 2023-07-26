package br.com.gabrielborba.financebank.domain

import br.com.gabrielborba.financebank.infrastructure.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
           println(admin.welcome())
        } else {
            println("Falha na autenticação")
        }
    }
}