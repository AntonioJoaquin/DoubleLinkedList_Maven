package ingsoft.DoubleLinkedList_Maven;

public class DNode {

	int data; //Data or reference to data
	DNode previous; //A reference to the previous node
	DNode next; //A reference to the next node
	
	public DNode (int data){
		this.data = data;
		this.previous = null;
		this.next = null;
	}
	
	public DNode (int data, DNode previous, DNode next){
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
	
}
