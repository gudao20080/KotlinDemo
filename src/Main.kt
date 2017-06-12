import org.w3c.dom.Node

object Main {

    @JvmStatic fun main(args: Array<String>) {

//        var student = Student()
//        student.age = 10

        var a: String? = null
//        println(a?.length)
//        a?.let { println(a.length) }


        println(a?.length ?: "333")

        val nullableList: List<Int?> = listOf(1,2 ,null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        println(intList)
    }


}
