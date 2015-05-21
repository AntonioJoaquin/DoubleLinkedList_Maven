package ingsoft.doublelinkedlistmaven;

import java.util.*;

public class DoubleLinkedList {

  //points to first node of list
  public DNode first;
  //points to last node of list
  public DNode last; 

  public void insertAfter(DNode node, DNode newNode) {
    newNode.previous = node;
    newNode.next = node.next;
    if (node.next == null) {
      last = newNode;
      node.next = newNode;
    } else {
      node.next.previous = newNode;
      node.next = newNode;
    }
  }

  public void insertBefore(DNode node, DNode newNode) {
    newNode.previous = node.previous;
    newNode.next = node;
    if (node.previous == null) {
      first = newNode;
      node.previous = newNode;
    } else {
      node.previous.next = newNode;
      node.previous = newNode;
    }
  }

  public void insertBeginning(DNode newNode) {
    if (first == null) {
      first = newNode;
      last = newNode;
      newNode.previous = null;
      newNode.next = null;
    } else {
      insertBefore(last, newNode);
    }
  }

  public void insertEnd(DNode newNode) {
    if (last == null) {
      insertBeginning(newNode);
    } else {
      insertAfter(last, newNode);
    }
  }

  public void remove(DNode node) {
    if (node.previous == null) {
      first = node.next;
    } else if (node.next == null) {
      last = node.previous;
    } else {
      node.previous.next = node.next;
      node.next.previous = node.previous;
    }

  }

}

