package br.com.digital_house.exercicio01

class Documento(override val nome: String, override val tipoDocumento: String) : Imprimível {
    override fun imprimir() {
       println("Eu sou um documento word - TipoDocumento: $tipoDocumento - Nome: $nome")
    }
}