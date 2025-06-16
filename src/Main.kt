import linkedlist.CustomLinkedList

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    val customLinkedList : CustomLinkedList<Int> = CustomLinkedList()

    customLinkedList.add(15)
    customLinkedList.add(10)
    customLinkedList.delete(10)
    customLinkedList.printList()
}