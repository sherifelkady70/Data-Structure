//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val resize = ResizeArray()
    val array = arrayOf("sherif","mhmd","amr")
    val newSizeArray = resize.resize(5,array,String.javaClass)

    newSizeArray.forEach {
        println(it)
    }
}