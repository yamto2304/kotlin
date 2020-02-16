package hello
class Bat: AnimalInterface, BirdInterface{
    override  fun walk(){
        super.walk()
        println("I'm a Bat, i can walk")
    }
    override fun fly(){
        super.fly()
        println("I'm a Bat, i can fly")
    }

    override fun eat(){
        super<BirdInterface>.eat()
        super<AnimalInterface>.eat()
    }
}
fun main(args: Array<String>){
    var bat: Bat = Bat()
    bat.walk()
    bat.eat()
    bat.fly()
}
