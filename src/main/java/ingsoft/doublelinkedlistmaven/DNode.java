package ingsoft.doublelinkedlistmaven;

public class DNode {

  // Data or reference to data
  int data;
  // A reference to the previous node
  DNode previous;
  // A reference to the next node
  DNode next;

  public DNode(int data) {
    this.data = data;
    this.previous = null;
    this.next = null;
  }

  public DNode(int data, DNode previous, DNode next) {
    this.data = data;
    this.previous = previous;
    this.next = next;
  }
  
  public DNode getPrevious(){
	  return previous;
  }
  
  public DNode getNext(){
	  return next;
  }

}
