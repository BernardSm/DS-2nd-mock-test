package mlt2;

public class Node {
	private Item data;
	private Node next;
	
	public Node() {
		super();
		this.data = new Item();
		this.next = null;
	}
	
	public Node(Item data) {
		super();
		this.data = data;
	}
	
	public Node(Item data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Item getData() {
		return data;
	}

	public void setData(Item data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	public void display() {
		toString();
	}
}
