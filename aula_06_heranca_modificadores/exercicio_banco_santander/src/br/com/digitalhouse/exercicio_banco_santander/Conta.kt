package br.com.digitalhouse.exercicio_banco_santander

import java.math.BigDecimal

open class Conta (var numeroConta: Int, val titular: Cliente){

    var saldo : BigDecimal = BigDecimal.ZERO

    fun depositar(valor: BigDecimal) {
        saldo += valor
        println("Valor depositado: $valor")
    }

    fun consultarSaldo(){
        println("Saldo atual em conta: $saldo")
    }

    open fun sacar(valor : BigDecimal){
    }
}
