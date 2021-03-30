package com.jokerinya;

public class Node {
    public int key;
    public String value;

    Node leftChild;
    Node rightChild;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
