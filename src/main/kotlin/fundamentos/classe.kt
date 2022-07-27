package fundamentos

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe pessoa - Nome: ${nome}, Idade: ${idade}"
    }

    // a função to string transforma os parmetros do contrutor em string, ficando assim mais inteligivel a leitura
}

fun main(){
    val gustavo = Pessoa("Gustavo", 23)
    println(gustavo)
}