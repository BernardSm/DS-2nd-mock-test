package mlt2;

public class Queue {
	private Node front;

	public Queue() {
		super();
		this.front = null;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public void enqueue(Item i) {
		Node temp = new Node(i);
		if(isEmpty()) {
			front = temp;
		}
		else {
			Node current = front;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
	}
	
	public Item dequeue() {
		if(isEmpty()) {
			return front.getData();
		}
		else {
			Node temp = front.getNext();
			Item n = front.getData();
			front = temp;
			return n;
		}
	}
	
	public void destroy() {
		while(!isEmpty()) {
			dequeue();
		}
	}
}
