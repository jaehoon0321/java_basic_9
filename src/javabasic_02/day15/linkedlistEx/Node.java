package javabasic_02.day15.linkedlistEx;

public class Node<T> {
    T data;
    Node<T> next = null;
    public  Node(T data){
        this.data = data;
    }
}