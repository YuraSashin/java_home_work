import java.util.Scanner;

public class redBlackTree {
  private class Node {
    private int value;
    private Color color;
    private Node leftChild;
    private Node rightChild;
  }

  private enum Color {
    red, black
  }

  private Node root;
  public boolean add(int value){
    if(root!= null){
      boolean result = addNode(root,value);
      root = rebalance(root);
      root.color = Color.black;
      return result;
    }else{
      root = new Node();
      root.color = Color.black;
      root.value = value;
      return true;
    }
  }

  private boolean addNode(Node node, int value) {//Добавление ноды
    if (node.value == value)
      return false;
    else {
      if (node.value > value) {
        if (node.leftChild != null) {
          boolean result = addNode(node.leftChild, value);
          node.leftChild = rebalance(node.leftChild);
          return result;
        } else {
          node.leftChild = new Node();
          node.leftChild.color = Color.red;
          node.leftChild.value = value;
          return true;
        }
      } else {
        if (node.rightChild != null) {
          boolean result = addNode(node.rightChild, value);
          node.rightChild = rebalance(node.rightChild);
          return result;
        } else {
          node.rightChild = new Node();
          node.rightChild.color = Color.red;
          node.rightChild.value = value;
          return true;
        }
      }
    }
  }

  private void  colorSwap(Node node){//смена цвета
    node.leftChild.color = Color.black;
    node.rightChild.color = Color.black;
    node.color = Color.red;
  }

  private Node leftSwap(Node node){//Левосторонний перевод
    Node leftChild = node.leftChild;
    Node betweenChild = leftChild.rightChild;
    leftChild.rightChild = node;
    node.leftChild = betweenChild;
    leftChild.color = node.color;
    node.color = Color.red;
    return leftChild;
  }

  private Node rightSwap(Node node){//Правосторонний перевод
    Node rightChild = node.rightChild;
    Node betweenChild = rightChild.leftChild;
    rightChild.leftChild = node;
    node.rightChild = betweenChild;
    rightChild.color = node.color;
    node.color = Color.red;
    return rightChild;
  }

  private Node rebalance(Node node){//Ребаланс
    Node result = node;
    boolean needRebalance;
    do{
      needRebalance = false;
      if(result.rightChild != null && result.rightChild.color == Color.red &&
        (result.leftChild != null && result.leftChild.color == Color.black)){
          needRebalance = true;
          result = rightSwap(result);
        }
      if(result.leftChild != null && result.leftChild.color == Color.red &&
        (result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.red)){
          needRebalance = true;
          result = leftSwap(result);
        }
      if(result.leftChild != null && result.leftChild.color == Color.red &&
        (result.rightChild != null && result.rightChild.color == Color.red)){
          needRebalance =true;
          colorSwap(result);
        }
    }
    while(needRebalance);
    return result;
  }
}
