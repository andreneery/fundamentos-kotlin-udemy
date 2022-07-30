package fundamentos

fun main(){

    //a ? torna a variavel anulavel

    var lista : List<Int?> = listOf(1, 2 , null, 4)
    // a ? junto com o int permite que no array receba elementos null

    var listaNull: List<Int>? = null
    // já a ? fora das chaves pode receber a lista toda null

    var nome: String? = null

    var tamanho: Int = nome?.length ?: 0
    // a ?: se chama elvis operator - funciona como um if else ou seja:
    // se o nome não for null ele irá mostrar o tamanho da variavel, caso contrario irá retornar 0

    println(tamanho)
}