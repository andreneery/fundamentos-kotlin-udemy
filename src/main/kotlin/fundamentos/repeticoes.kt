package fundamentos

fun main(){
//    for1a10()
//    for10a1()
//    forStep()
//    forInRange(5,25)
//    while1a10()
    doWhile()
}

fun for1a10(){

    for(numero in 1 .. 10){
        println(numero)
    }
}

fun for10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}

fun forStep(){
    for (numero in 1 .. 20 step 2){
        println(numero)
    }
}

fun forInRange(inicio: Int, fim: Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}

fun while1a10(){
    var x = 0
    while(x <= 10){
        println(x)
        x++
    }
}

fun doWhile(){
    var x = 10
    do{
        println(x)
        x++
    }while (x <10)

    // o do While ele roda primeiro para depois verificar
}