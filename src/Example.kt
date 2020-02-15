//package hello
//
//fun main(args: Array<String>) {
//    var c: Char = 'c'
//    c = '\u0040'
//    println("$c");
//    println(c)
//    var myName = "Ymt"
//    for (eachChar in myName) {
//        println("eachChar = $eachChar")
//    }
//    val strings: Array<String> = arrayOf("a","b","c","d")
//    println(strings)
//    val string2: String = "abc"
//    println(string2)
////    for (string in strings) {
////        println(strings)
////    }
//    val intNumbers: Array<Int> = Array<Int>(5, { i -> 2*  i})
//    for (intNumber in intNumbers) {
//        println("intNumber = $intNumber")
//    }
//    val text = """
//        a
//        b
//        a
//        b
//        """
//    println(text)
//    fun checkNumber( input: Int) = when(input){
//        0 -> {
//            println("so 0")
//            println("Zero")
//        }
//        1,2 -> println("one or two")
//        in 3..10 -> println("lots of")
//        else -> println("nothing")
//    }
//    checkNumber(5)
//    val x = 5
//    val s = "5"
//    when (x) {
//        Integer.parseInt(s) -> print("$s encode $x")
//        else -> print("$s does not encode $x")
//    }
    //===========06
//    var ints : Array<Int> = arrayOf(1, 2, 3, 4, 0, 5, 6)
//    labelOne@ for (i in 1..10){
//        labelTwo@ for (j in 1..10){
//            if( i == 2 && j == 2){
//                break@labelTwo
//            }
//            println(" i = $i, j = $j")
//        }
//    }
//
//    fun printIntList(intNumbers : Array<Int>){
//        intNumbers.forEach(fun(item : Int){
//            if(item == 3 ) return
//            println("item = $item")
//        })
//    }
//    printIntList(ints)
    //==============06
//    fun addTwoInts(x : Int, y : Int): Int {
//        return x + y
//    }
//    var a = addTwoInts(1,2)
//    println(a)
//
//    fun area(width: Double, heigh: Double): Double{
//        return width*heigh
//    }
//    println(area(12.0, 20.0))
//
//    fun greet(personName: String?) {
//        if(personName != null)
//            println("Hello ${personName} !")
//        else
//            println("Hi there !")
//    }
//    greet("Ymt")
//
//    infix fun Double.add(x : Double) :Double{
//        return this + x
//    }
//    println("3 + 2 + 3 = ${(3.0 add 2.0) add 3.0}")
//    tailrec fun factorial(n: Long) : Long{
//        if(n == 1L){
//            return 1
//        } else {
//            return n * factorial(n-1)
//        }
//    }
//    println(" factorial of 4 is : ${factorial(4)}")
//}
    //=================07: Lop va khoi tao ham

package hello
var a : Int? = null

open class Person constructor(open val firstName: String, val lastName: String, var age: Int?) {
    private var fullName = "$firstName $lastName"
    //initializer blocks
    init {
        println("Initializer with firstName: $this.firstName, lastName: $lastName, age: $age")
    }
    open fun talk(message: String = ""){
        println("$fullName says $message")
    }
    //getter setter
    var isAdult: Boolean
    get(){//getter
        println("Prepare to get isAdult")
        if(age == null){
            return false
        } else if(age!! >18){
            return true
        }
        return false
    }
    set(value){//setter
        println("Prepare to set isAdult")
        age = if(value == true) 10 else null
    }
    lateinit var languge : String
}

class Engineer(var fieldOfStudy:String, firstName:String, lastName: String, age: Int?)
    :Person(firstName, lastName, age){
    override  val firstName = super.firstName.toUpperCase()
    override fun talk(message: String){
        super.talk(message.toUpperCase())
        println("I am an engineer")
    }
}

fun main(args: Array<String>){
    var person = Person(firstName = "Hoang", lastName = "Dinh Tuan", age = 35)
    println("Function details.Firstname = ${person.firstName}, Lastname = ${person.lastName}")
    //person.fullName
    person.talk("Good morning")
//==============08 Ke thua//==============08 Ke thua
    var engineer: Engineer = Engineer("IT", firstName = "Mel", lastName = "mel", age = 15)
    println("Detail. Firstname = ${engineer.firstName}," +
        "last Name = ${engineer.lastName}, age = ${engineer.age}," +
        "fieldOfStudy = ${engineer.fieldOfStudy}")
    engineer.talk("Good evening")
//========Getters setter
    //getter
    println("${engineer.firstName} is an adult ? ${engineer.isAdult}")
    //setter
    engineer.isAdult = true
    if(engineer.age == null){
        println("age is null")
    } else println("age not null")

    engineer.languge = "English"
    println("Details. languge = ${engineer.languge}")
    a = 10
    println(a!!)
}

