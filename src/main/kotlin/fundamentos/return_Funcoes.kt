package fundamentos

fun main(){
    println(numero(5))
    println(numero(7))
    println(numero(10))
}

fun numero(numero: Int): String{

    if(numero == 5){
        return "Cinco"
    } else if(numero == 6){
        return "Seis"
    } else if(numero == 7){
        return "Sete"
    } else return "Numero não mapeado"
}