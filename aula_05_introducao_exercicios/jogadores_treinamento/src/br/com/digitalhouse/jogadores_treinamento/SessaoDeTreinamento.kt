package br.com.digitalhouse.jogadores_treinamento

class SessaoDeTreinamento (var experiencia : Int){

    fun treinarA(jogador : JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experiencia

        println("_______[TREINAR]_______ \n Jogador: ${jogador.nome} \n ExperienciaInicial: ${jogador.experiencia - experiencia} \n ExperienciaFinal: ${jogador.experiencia}" )
    }

}