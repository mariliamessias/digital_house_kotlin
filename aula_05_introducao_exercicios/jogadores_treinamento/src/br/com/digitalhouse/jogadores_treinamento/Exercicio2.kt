package br.com.digitalhouse.jogadores_treinamento

fun main() {

    val treinamento : SessaoDeTreinamento = SessaoDeTreinamento(10)

    treinamento.treinarA(JogadorDeFutebol("Rafael", 0, 0, 0, 0))
    treinamento.treinarA(JogadorDeFutebol("Camila", 10, 10, 2, 7))

}