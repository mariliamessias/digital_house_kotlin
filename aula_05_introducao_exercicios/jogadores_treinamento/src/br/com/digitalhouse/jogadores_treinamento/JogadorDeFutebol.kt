package br.com.digitalhouse.jogadores_treinamento

class JogadorDeFutebol(
    var nome: String ,
    var energia: Int = 0,
    var alegria: Int = 0,
    var gols: Int = 0,
    var experiencia: Int = 0
) {

    init{
        println("_______[JOGADOR]_______ \n Nome: $nome")
    }

    fun fazerGol(){
        energia-=5
        alegria+=10
        gols ++
        println("_______[GOL]_______ \n Jogador: $nome \n Mensagem: GOOOOL!")
    }

    fun correr(){
        energia-=10
        println("_______[CORRER]_______ \n Jogador: $nome \n Mensagem: Cansei")

    }

}