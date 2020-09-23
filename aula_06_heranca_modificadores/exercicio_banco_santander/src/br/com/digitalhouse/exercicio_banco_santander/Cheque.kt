package br.com.digitalhouse.exercicio_banco_santander

import java.math.BigDecimal
import java.time.LocalDateTime

class Cheque (var valor:BigDecimal, var bancoEmissor : String, var dataPagamento: LocalDateTime) {
}