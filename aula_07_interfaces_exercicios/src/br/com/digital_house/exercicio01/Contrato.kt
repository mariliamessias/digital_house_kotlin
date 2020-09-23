package br.com.digital_house.exercicio01

class Contrato(override val nome: String, override val tipoDocumento: String) : Imprimível {
    override fun imprimir() {
        println("Sou um contrato muito legal - TipoDocumento: $tipoDocumento - Nome: $nome")
    }
}