package com.jokerinya;

public class FromNode {
    public int key;
    public String value;

    FromNode leftChild;
    FromNode rightChild;

    public FromNode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "FromNode{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public void addFromNode(int key, String value){
        if (key<=this.key){
            if (this.leftChild==null){
                this.leftChild = new FromNode(key, value);
            } else {
                this.leftChild.addFromNode(key, value);
            }
        } else {
            if (this.rightChild ==null){
                this.rightChild = new FromNode(key, value);
            } else {
                this.rightChild.addFromNode(key, value);
            }
        }
    }
    public void inOrderPrint(FromNode parentFromNode){
        if (parentFromNode.leftChild != null){
            parentFromNode.leftChild.inOrderPrint(parentFromNode.leftChild);
        }
        System.out.println(parentFromNode);
        if (parentFromNode.rightChild != null){
            parentFromNode.rightChild.inOrderPrint(parentFromNode.rightChild);
        }
    }
}
