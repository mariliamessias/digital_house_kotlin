package br.com.digital_house.exercicio01

class Foto(override val nome: String, override val tipoDocumento: String) : Imprimível {
    override fun imprimir() {
        println("Eu sou uma selfie - TipoDocumento: $tipoDocumento - Nome: $nome")
    }
}