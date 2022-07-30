package fundamentos

fun main(){

    println(parOuImpar(5))
    println(parOuImpar(10))
    println(parOuImpar(58214))
    println(verificarNota(10))
    println(verificarNota(3))
    println(verificarNota(5))



}

fun parOuImpar(numero: Int): String{
    if(numero % 2 == 0){
        return "Par"
    }else {
        return "Impar"
    }

}

//nota: >= 6 - passou
// >= 4 - recuperação
// < 4 - reprovado
fun verificarNota(nota: Int): String{
    return if(nota >= 6){
        "Aprovado"
    }else if (nota >= 4){
        "Recuperação"
    } else "Reprovado"
}