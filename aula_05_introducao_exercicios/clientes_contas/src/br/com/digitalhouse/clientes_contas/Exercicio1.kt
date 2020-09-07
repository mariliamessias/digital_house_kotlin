package br.com.digitalhouse.clientes_contas

    fun main(){

        val anaConta : Conta = Conta(1, 200.00, Cliente("Ana", "Silva" ))
        val carlosConta : Conta = Conta(2, 0.00, Cliente("Carlos", "Mendozas" ))

        anaConta.depositar(100.0)
        anaConta.sacar(50.0)
        anaConta.sacar(1000.0)
        carlosConta.sacar(100.0)
        carlosConta.depositar(500.0)
        carlosConta.sacar(160.0)

    }
