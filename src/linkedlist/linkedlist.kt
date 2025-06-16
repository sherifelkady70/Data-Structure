package linkedlist

import kotlin.jvm.Throws


class Node<T>(val data : T , var next : Node<T>?=null)



class CustomLinkedList<T> {
    var head : Node<T>? = null //first node in list

    fun add(data : T){
        val newNode = Node(data)
        if(head==null){
            head = newNode
        }else{
            var temp = head
            while (temp?.next!=null){
                temp=temp.next
            }
            temp?.next = newNode
        }
    }

    fun delete(data : T) {
        if (head==null) return
        if(head?.data==data){
            head = head?.next
            return
        }
        var temp = head
        while (temp?.next!=null){
            if(temp.next!!.data==data){
                temp.next = temp.next!!.next
                return
            }
            temp = temp.next
        }
    }

    fun printList(){
        while (head?.next!=null){
            println(head?.data)
            head = head?.next
        }
        println(head?.data)//last item
    }

}