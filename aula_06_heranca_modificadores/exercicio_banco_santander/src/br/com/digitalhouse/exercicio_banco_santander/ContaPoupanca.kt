package br.com.digitalhouse.exercicio_banco_santander

import java.math.BigDecimal

class ContaPoupanca (var taxaJuros: Double, numeroConta : Int, cliente: Cliente ) : Conta(numeroConta, cliente) {

    init {
        println("\nConta Poupança\n")
    }


    override fun sacar(valor : BigDecimal) {
        if(saldo >= valor){
           saldo-= valor
            println("Valor sacado com sucesso: $valor \nNovo saldo: $saldo")
        }else println("Saldo insuficiente para saque no valor: $valor\nSaldo: $saldo")
    }

    fun recolherJuros(){
        val taxa = taxaJuros * 0.01
        saldo+=saldo* BigDecimal.valueOf(taxa)
        println("Novo saldo $saldo\nTaxa de juros aplicada: $taxa")
    }

}