class Persona(var peso : Double, var altura : Double){
    var nombre : String = ""
    var imc : Double = peso*(altura*altura)

    constructor(peso: Double,altura: Double, nombrenuevo : String) : this(peso,altura){
        this.nombre = nombrenuevo
    }

    override fun toString(): String {
        return "$nombre, de altura $altura metros,peso de $peso kilos, tiene un IMC de $imc"
    }
}

fun main(){
    val persona1 = Persona(69.6,1.8)
    persona1.nombre = readln()
    println(persona1.nombre)
    println(persona1.peso)
    println(persona1.altura)

    val persona2 = Persona(68.0,1.6,"Eustaquio")
    println(persona2)
    persona2.altura = 1.8
    println(persona2.peso)
    println(persona2.altura)
    println(persona2.imc)

    val persona3 = Persona(70.5,1.2)
    persona3.altura = 1.8
    println(persona2)
    println(persona3)
    println(persona2.equals(persona3))

}