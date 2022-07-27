package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono){

}

class Dono(val nome: String, val idade: Int){

    override fun toString(): String {
        return "Proprietário: ${nome}, Idade: ${idade}"
    }
}


fun main(){
    val carro = Carro("Branco", 2022, Dono("Pedro", 20))
    println(carro.cor)
    println(carro.anoFabricacao)
    println(carro.dono)
}