package fundamentos

fun main(){

    dizOI("André", 23)
}

fun nome(): String {
    return "Gustavo"
}

fun dizOI(nome: String, idade: Int){
    println("Oi ${nome}, parabens pelo seus ${idade} anos")
}