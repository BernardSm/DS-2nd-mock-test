package mlt2;

public class Stack {
	private Node top;

	public Stack() {
		super();
		this.top = null;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		return false;
	}

	public Node getTop() {
		return top;
	}

	public Item pop() {
		if(isEmpty()) {
			return top.getData();
		}
		Node current = top;
		top = top.getNext();
		current.setNext(null);
		
		return current.getData();
	}
	
	public void push(Item i) {
		Node temp = new Node(i);
		if(isEmpty()) {
			top = temp;
		}
		else {
			temp.setNext(top);
			top = temp;
		}
	}
	
	public void destroy() {
		while(top != null) {
			pop();
		}
	}
}
