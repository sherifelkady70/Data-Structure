package linkedlist


class Node<T>(val data: T, var next: Node<T>? = null)


class CustomLinkedList<T> {
    var head: Node<T>? = null //first node in list
    var tail: Node<T>? = null //last node in list

    fun add(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var temp = head
            while (temp?.next != null) {
                temp = temp.next
            }
            temp?.next = newNode
        }
    }

    fun insertLast(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }

    fun delete(data: T) {
        if (head == null) return
        if (head?.data == data) {
            head = head?.next
            return
        }
        var temp = head
        while (temp?.next != null) {
            if (temp.next!!.data == data) {
                temp.next = temp.next!!.next
                return
            }
            temp = temp.next
        }
    }

    fun printList() {
        while (head?.next != null) {
            println(head?.data)
            head = head?.next
        }
        println(head?.data)//last item
    }

    fun print(){
        val itr = this.begin()
        while (itr.currentNode!=null){
            println(itr.currentNode?.data)
            itr.next()
        }
    }

    fun getHeadData() : T{
        val itr = this.begin()
        return itr.data()
    }

    fun begin() : CustomLinkedListIterator<T>  {
        val newNode = CustomLinkedListIterator(head)
        return newNode
    }

}


class CustomLinkedListIterator<T> {

    var currentNode: Node<T>? = null

    constructor(node : Node<T>?){
        currentNode = node
    }

    constructor() : this(null)


    fun data() : T = currentNode?.data!!

    fun  next() : CustomLinkedListIterator<T> {
        currentNode = currentNode?.next
        return this
    } //It then returns this, which means you can chain the calls.
    // This lets you perform multiple operations in a fluent style.

    fun current() : Node<T>? = currentNode
}