package com.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

  public Node root;

  public static class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
    }

    public boolean isLeaf() {
      return (this.left == null) && (this.right == null);
    }

    public int getValue() {
      return value;
    }

  }

  public void insert(int value) {
    if (root == null) root = new Node(value);
    else {

      Node newNode = new Node(value);
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);

      while (!queue.isEmpty()) {
        Node currentNode = queue.remove();

        // Verifica se o lado esquerdo é nulo 
        if (currentNode.left == null) {
          currentNode.left = newNode;
          break;
        } else {
          queue.add(currentNode.left); // Incluí o lado esquerdo na Fila (filho esquerdo) caso já exista
        }
        
        // Verifica se o lado direito é nulo
        if (currentNode.right == null) {
          currentNode.right = newNode;
          break;
        } else {
          queue.add(currentNode.right); // Incluí o lado direito na Fila (filho direito) caso já exista
        }
      }
    }
  }

  public void preOrder() {  // A Busca em Profundidade (DFS) - É exatamente o mesmo retorno da preOrder
    preOrder(root);
  }

  private void preOrder(final Node node) {
    // R E D
    if (node == null) return;
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(final Node node) {
    // E R D
    if (node == null) return;
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }

  public void posOrder() {
     posOrder(root);
  }

  private void posOrder(final Node node) {
    // E D R
    if (node == null) return;
    posOrder(node.left);
    posOrder(node.right);
    System.out.println(node.value);
  }

  public void BFS() { // Implementado como travessia
    if (root == null) return;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      Node node = queue.remove();
      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);

      System.out.println(node.value);
    }
  }
}
