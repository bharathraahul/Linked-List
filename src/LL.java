

public class LL {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	
	
	public LL() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		//create a new box
		Node node = new Node(val);
		//next node should be the current head if we are passing the new node to the first
		node.next = head;
		//head should always point to the first element so we are doing this
		head = node;
		
		if(tail==null) {
			tail=head;
		}
		
		size+=1;
	}
	
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail=node;
		size+=1;
	}
	
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+ " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}



	private class Node{
		private int value;
		private Node next;
		
		
		
		public Node(int value) {
			super();
			this.value = value;
		}



		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		
		
	}

}
