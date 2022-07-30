package fundamentos

import java.lang.invoke.StringConcatFactory

fun main(){
    val nomeVal = "Andre"
    var nome = "Andre"

    nome = "Pedro"

    // var - é mutável | val é imutável

    val teste: String
    teste = "Teste"

}

class variaveis{
    lateinit var teste: String

    //em classes para usar variaveis vazias tem que usar o lateinit

    fun iniciarVariavel(){
        teste = "Olá, teste"
    }
}