package com.hai.collection_.set_.linkedhashset.source;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */
public class LinkedHashSetExercise01 {
    /*
       1. 模拟LinkedHashSet的实现方式
     */
    public static void main(String[] args) {
        // 创建一个table数组
        Node[] table = new Node[16];

        Node node1 = new Node(null, "ball", null);
        Node node2 = new Node(null, "messi", null);

        table[0] = node1;
        node1.before = null;
        node1.after = node2;

        table[1] = node2;
        node2.before = node1;

        System.out.println(table[0]);



    }
}

class Node {
    Object item;
    public Node before;
    public Node after;

    public Node(Node before, Object item, Node after) {
        this.item = item;
        this.before = before;
        this.after = after;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", before=" + before +
                ", after=" + after +
                '}';
    }
}