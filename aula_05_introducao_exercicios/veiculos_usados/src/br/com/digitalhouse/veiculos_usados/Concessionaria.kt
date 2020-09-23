package br.com.digitalhouse.veiculos_usados

class Concessionaria(){

    lateinit var venda : Venda

    fun registrarVenda(veiculo: Veiculo,cliente: Cliente, valor: Double){
        venda = Venda(cliente, veiculo, valor)
        println("Venda registrada: \nCliente: ${venda.cliente.nome} \nVeiculo: ${venda.veiculo.modelo}\nValor: R$ $valor")
    }

}
