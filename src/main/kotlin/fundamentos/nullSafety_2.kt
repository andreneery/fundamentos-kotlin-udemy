package fundamentos

fun main(){
    var pessoa: Pessoa? = Pessoa("André", 23)

    println(pessoa!!)

    // o exclamação serve para forçar uma operação que pode receber um valor null, porém se receber o null o código vai quebrar todo
}