package br.com.digitalhouse.exercicio_banco_santander

import java.math.BigDecimal

class ContaCorrente (var limiteAutorizado: BigDecimal, numeroConta : Int, cliente: Cliente ) : Conta(numeroConta, cliente) {

    init {
        println("\nConta Corrente\n")
    }

    override fun sacar(valor : BigDecimal) {
        val saldoTotalComLimite = limiteAutorizado+saldo
        if(saldoTotalComLimite < valor){
            println("Operação saque não realizada por falta de saldo.\nValor: $valor\nSaldo: $saldo\nLimite: $limiteAutorizado")
        }else if(saldo >= valor){
            saldo-= valor
            println("Operação saque realizada.\nValor: $valor\nSaldo: $saldo")
        }else{
            saldo=BigDecimal.ZERO
            limiteAutorizado = saldoTotalComLimite - valor
            println("Operação saque realizada.\nValor: $valor\nSaldo: $saldo\nLimite: $limiteAutorizado")
        }
    }

    fun depositarCheques(cheque: Cheque){
        saldo+=cheque.valor
        println("Valor depositado em cheque: ${cheque.valor}\nNovo saldo: $saldo")
    }
}