package fundamentos

fun main(){
//    testeWhen()

    when{
        comecaComOI(5) -> println("é o numero 5")
        comecaComOI("oi") -> println("oi, tudo bem?")

        else -> println("não mapeado")
    }
}

fun testeWhen(){
    val x = 10

    when(x){
        5 -> println("X == 5")
        7 -> println("X==7")
        10 -> {
            println("x == 10")
            println("X é uma dezena")
        }
        else -> println("Numero não mapeado")
    }
}

fun comecaComOI(x: Any): Boolean{
    return when(x){
        is String -> x.startsWith("oi")
        else -> false
    }
}