package ingsoft.DoubleLinkedList_Maven;

import java.util.*;

public class DoubleLinkedList {

  DNode first; // points to first node of list
  DNode last; // points to last node of list

  public void insertAfter(List<DNode> list, DNode node, DNode newNode) {
    newNode.previous = node;
    newNode.next = node.next;
    if (node.next == null) {
      last = newNode;
      node.next = newNode;
    } else {
      node.next.previous = newNode;
      node.next = newNode;
    }
    list.add(newNode);
  }

  public void insertBefore(List<DNode> list, DNode node, DNode newNode) {
    newNode.previous = node.previous;
    newNode.next = node;
    if (node.previous == null) {
      first = newNode;
      node.previous = newNode;
    } else {
      node.previous.next = newNode;
      node.previous = newNode;
    }
    list.add(newNode);
  }

  public void insertBeginning(List<DNode> list, DNode newNode) {
    if (first == null) {
      first = newNode;
      last = newNode;
      newNode.previous = null;
      newNode.next = null;
    } else {
      insertBefore(list, last, newNode);
    }
  }

  public void insertEnd(List<DNode> list, DNode newNode) {
    if (last == null) {
      insertBeginning(list, newNode);
    } else {
      insertAfter(list, last, newNode);
    }
  }

  public void remove(List<DNode> list, DNode node) {
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
