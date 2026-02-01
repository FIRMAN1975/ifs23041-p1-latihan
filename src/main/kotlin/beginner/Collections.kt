package beginner

fun main(){
    val readOnlyShape = listOf ("Segitiga" , "lingkaran")
    println(readOnlyShape)

    val shapes : MutableList<String> = mutableListOf("Segitiga" , "Lingkaran" ,"SegiEmpat")
    println(shapes)

    val shapesLocked: List<String> = shapes

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes[0]}")
// The first item in the list is: triangle
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The first item in the list is: ${readOnlyShapes.last()}")



}