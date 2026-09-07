//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("hola fundamentos")
    println()
    //functions()
    //varAndString()
    //numbers()
    //constants()
    //nulls()
    //lists()
    //sentences()
    //returns()
    //dataClass()
    //interfaces()//compatiilidad sin tener clase definida, estructura de comportamiento, definir qué puede hacer una clase
    //whenAndMutableList()
}

fun whenAndMutableList() {

    println("sentencia when y lista mutable")
    val names = mutableListOf<String>("Laura", "Arturo", "Alex")
    println(names)


    println("ingrese un numero(1 para añadir  y 2 para limpiar)")
//val option  = readln().ifBlank { 0 }.toString().toInt()
                               //"0".toInt
    val option  = readln().toIntOrNull()
    when(option){
              1 -> {  // opcion int or string
            names.add("Juan")

        }
            2 -> {
                names.clear()

            }

        else -> {

            println("accion invalida")
            return// como no devuelvo un vaor returna / se sale
        }
    }

    println("Lista actualizada $names")


}

fun interfaces() {
    println("interfaces")
    val contact: SafeInfo = Contact("juan", 22,"3215667278","juanm")
    println(contact.getInfo())
}

fun dataClass() {
    println("clases (modelos de datos, entidad u objetos)")
    //val nombre : String = "algo"
    //val age: Int = 21;

    val contact = Contact("juan", 22,"3215667278","juanm")//en bruto, clase normal no muestra, dat class facilita y actua como modelo de datos
    println(contact)// data class
    //println(contact.realName) normal class
}

//retornos

//se puede retorn una funcion en un afuncion
fun returns(){
println("Retorno")
    val name = collectName()
    println(name)
   // println(collectName())
}

fun collectName(): String {
    println("Ingresa un nombre")
val name = readln()
    if(name.isNotEmpty()) {
        return name
    } else {
        return "No se ingresO un nombre"
    }


}

fun sentences() {
    println("sentencias if y while")
    println("ingresa un nombre")
    val name = readln()

    if(name.isNotEmpty()) {
        println(name)
    } else {
        println("No se ingresO un nombre")
    }

var counter = 1
var resultado = 0

while(counter <= 2) {

    println("Ingresa un numero para sumar")
    val numero = readln().toInt()
    resultado += numero
    counter++
    //println("Resultado $resultado")
    //println(resultado)
    //resultado cada vuelta

}

    println(resultado)//resultao cuando termine el ciclo
}

fun lists() {
    println("Lista y sus metodos")
    val names = listOf("Aladin", "juan", "Miguel")//listOf<String>("juan")
    println(names)

    names.forEach { println(it)}//este elemento = it

        val name = readln()

        val search = names.find { it == name }
        println(search)


    val searchAdvance = names.find { it.equals(name, true) }
    println(searchAdvance)


    }


    fun nulls() {
        println("valores nulos")

        var name: String = "clara"
        var day: String
        var nullName: String? = "roberto"
        println(name)
        println(nullName)
        nullName = null
        println(nullName)


        //?null
        //valor null: valor invalido, podria llegar a tener valor nulo
    }

//global variables and contants
    var year = 2026
    const val monday = "lunes" //conoces valor

    fun constants() {
        println("constantes")
        //local variables o constants
        val name = readln() //desconoces valor
        println(name)
        println(monday)
        println(year)

        year = 2027
        print(monday)

    }

    fun numbers() {


        println("numbers")

        var counter = 21
        println(counter)
        counter = 4 * 2
        println(counter)
        counter = 4 / 2
        println(counter)
        counter = 4 - 2
        println(counter)
        counter = 4 + 2
        println(counter)


        counter = counter + 2
        println(counter)
        counter += 2 //igual
        println(counter)


        counter++ // = counter + 1 o counter-- = counter - 1
        println(counter)


    }


    fun functions() {
        println("mi primera funcion personalizada")
        println("hola, buen dia")
        println("Hola")
    }


    fun varAndString() {
        println("variables y String")

        var name: String = "Juan" //String
        println(name)
        name = "aladin"
        println(name)
        var freeText = """aladin"""
        println(freeText)

        name = "aladin\n?"
        println(name)
        freeText = """aladin\n"""//war String
        println(freeText)

    }

/*
Principios:
KISS
DRY
YAGNI
*/

//CLEAN CODE    