package com.jokerinya;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(5, "five");
        binaryTree.addNode(1, "one");
        binaryTree.addNode(2, "two");
        binaryTree.addNode(3, "three");
        binaryTree.addNode(23, "twenty three");

        binaryTree.inOrderTraverseTree(binaryTree.root);
        System.out.println("===========================");
        binaryTree.preOrderTraverseTree(binaryTree.root);
        System.out.println("===========================");
        binaryTree.postOrderTraverseTree(binaryTree.root);
        System.out.println("===========================");
        System.out.println(binaryTree.findNode(3));
        System.out.println("===========================");

        // Also can be implemented from Node level
        FromNode root = new FromNode(34, "root");
        root.addFromNode(22, "hello");
        root.addFromNode(12, "hi");
        root.addFromNode(2, "vay");
        root.addFromNode(26, "zay");
        root.addFromNode(21, "tay");
        root.addFromNode(20, "kay");
        root.inOrderPrint(root);
    }
}
