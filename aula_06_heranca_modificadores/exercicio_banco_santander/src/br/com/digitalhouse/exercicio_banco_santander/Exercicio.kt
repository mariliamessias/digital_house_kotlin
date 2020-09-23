package br.com.digitalhouse.exercicio_banco_santander

import java.math.BigDecimal
import java.time.LocalDateTime

fun main(){

    val cliente : Cliente = Cliente("mol", "teste", BigDecimal(123), "666", "123-X" )

    val contaCorrente : ContaCorrente = ContaCorrente(BigDecimal(100),  123, cliente )

    contaCorrente.depositar(BigDecimal(800))
    contaCorrente.depositarCheques(Cheque(BigDecimal(1000), "santander", LocalDateTime.now()))
    contaCorrente.sacar(BigDecimal(200))
    contaCorrente.sacar(BigDecimal(950))
    contaCorrente.sacar(BigDecimal(51))
    contaCorrente.consultarSaldo()

    val contaPoupanca : ContaPoupanca = ContaPoupanca(5.00,  1234, cliente )

    contaPoupanca.depositar(BigDecimal(110))
    contaPoupanca.sacar(BigDecimal(100))
    contaPoupanca.recolherJuros()
    contaPoupanca.consultarSaldo()

}