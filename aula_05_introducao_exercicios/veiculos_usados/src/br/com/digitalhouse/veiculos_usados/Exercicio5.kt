package br.com.digitalhouse.veiculos_usados

import java.math.BigDecimal

fun main(){

    val carro : Veiculo = Veiculo("volks", "gol", 2020, "branco", BigDecimal(200))
    val cliente : Cliente = Cliente("mol", "lontra", "email@email.com")
    val venda : Concessionaria = Concessionaria()

    venda.registrarVenda(carro, cliente, 20000.00)
}