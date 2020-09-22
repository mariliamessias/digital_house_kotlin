package br.com.digitalhouse.tripe

class Tripe (var dobrado : Boolean, var alturaMinima : Double, var alturaMaxima: Double, var alturaAtual : Double){

    fun definirAltura( novaAltura : Int){
        alturaAtual = novaAltura.toString().toDouble();
        println("Altura atual: $alturaAtual")
    }

    fun dobrar(){
        dobrado = true;
        println("Dobrado: $dobrado")

    }

    fun desdobrar(){
        dobrado = false;
        println("Dobrado: $dobrado")

    }

    fun guardar(){
        alturaAtual = alturaMinima;
        println("Guardado, altura atual: $alturaAtual")

    }

    fun prontoParaGuardar(){
        if(dobrado && alturaAtual == alturaMinima){
            println("Pronto para guardar")
        }else{
            println("Não está pronto para guardar")
        }
    }

    fun usar(){
        if(!dobrado && alturaAtual > alturaMaxima/2 ){
            println("Usando")
        }
        else println("Não pode usar")
    }

    fun prontoParaUsar(){
        if(!dobrado && alturaAtual > alturaMaxima/2 ){
            println("Pronto para usar - Dobrado: $dobrado - AlturaAtual: $alturaAtual")
        }
        else println("Não está pronto para usar - Dobrado: $dobrado - AlturaAtual: $alturaAtual")
    }
}





