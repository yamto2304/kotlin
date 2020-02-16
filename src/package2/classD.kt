package package2
import package1.ClassA

open class ClassD{
    protected open val p1 = 1
    init {
        println("Initialize ClassD")
    }
}

class SubClassD: ClassD(){
    override val p1 = 2
    init{
        println("Access p1. p1 = $p1")
    }
}

fun function4(){
    println("This is function4")
    var classA = ClassA()
    var subClassD = SubClassD()
    //subClassD.p1
}
