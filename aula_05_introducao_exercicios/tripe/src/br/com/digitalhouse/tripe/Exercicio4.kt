package br.com.digitalhouse.tripe

fun main(){

    val tripe : Tripe = Tripe(true, 5.00, 12.00 , 7.00 )

    tripe.definirAltura(2)
    tripe.desdobrar()
    tripe.dobrar()
    tripe.usar()
    tripe.guardar()
    tripe.prontoParaGuardar()
    tripe.desdobrar()
    tripe.definirAltura(20)
    tripe.prontoParaUsar()
    tripe.usar()

}


