package br.com.digitalhouse.clientes_contas

    fun main(){

        val anaConta : Conta = Conta(1, 200.00, Cliente("Ana", "Silva" ))

        anaConta.depositar(100.0)
        anaConta.sacar(50.0)
        anaConta.sacar(1000.0)
        anaConta.depositar(850.0)
        anaConta.sacar(20.0)

    }
