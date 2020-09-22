package br.com.digitalhouse.atletas_provas

fun main(){

    val atleta1 : Atleta = Atleta("mol", 1, 10)
    val atleta2 : Atleta = Atleta("coita", 2, 20)

    val prova1 : Prova = Prova(10, 10)
    val prova2 : Prova = Prova(1, 1)
    val prova3 : Prova = Prova(0, 2)
    val prova4 : Prova = Prova(2, 7)
    val prova5 : Prova = Prova(4, 3)
    val prova6 : Prova = Prova(5, 100)

    println("Atleta: ${atleta1.nome} Pode realizar a prova? ${prova1.podeRealizar(atleta1)}")
    println("Atleta: ${atleta1.nome} Pode realizar a prova? ${prova2.podeRealizar(atleta1)}")
    println("Atleta: ${atleta1.nome} Pode realizar a prova? ${prova3.podeRealizar(atleta1)}")

    println("Atleta: ${atleta2.nome} Pode realizar a prova? ${prova4.podeRealizar(atleta2)}")
    println("Atleta: ${atleta2.nome} Pode realizar a prova? ${prova5.podeRealizar(atleta2)}")
    println("Atleta: ${atleta2.nome} Pode realizar a prova? ${prova6.podeRealizar(atleta2)}")


}
