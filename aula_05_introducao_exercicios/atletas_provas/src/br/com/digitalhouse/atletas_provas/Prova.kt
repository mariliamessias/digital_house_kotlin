package br.com.digitalhouse.atletas_provas

class Prova (var dificuldade : Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta ): Boolean{

        when{
            atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria -> return true
            else -> return false
        }
    }
}