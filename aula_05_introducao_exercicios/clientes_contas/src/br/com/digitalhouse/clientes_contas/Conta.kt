package br.com.digitalhouse.clientes_contas

class Conta(var numero: Int, var saldo: Double, val titular: Cliente) {

    init{
        println(" _______ [INICIO] _______ \n Cliente: ${titular.nome} \n Saldo: $saldo  \n Numero: $numero")

    }

    fun depositar(quantia: Double) {
        saldo += quantia
        println(" _______ [DEPOSITO] _______ \n Conta: $numero \n Valor: $quantia \n SaldoAtual: $saldo")
    }

    fun sacar(quantia: Double) {
        if(saldo >= quantia ){
            saldo-=quantia
            println(" _______ [SAQUE] _______ \n Conta: $numero \n Valor: $quantia \n SaldoAtual: $saldo")
        }else{
            println(" _______ [SAQUE] _______ \n Conta: $numero \n Valor: $quantia \n Mensagem: saldo insuficiente")
        }
    }
}