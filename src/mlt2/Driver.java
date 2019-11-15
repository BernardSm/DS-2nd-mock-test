package mlt2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item a = new Item(1, "ps4", 16);
		Item b = new Item(2, "iphone", 76);
		Item c = new Item(3, "s10", 54);
		Item d = new Item(4, "patek phillip", 99);
		
		Stack stack = new Stack();
		Queue que = new Queue();
		
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.push(d);
		
		que.enqueue(stack.pop());
		que.enqueue(stack.pop());
		
		System.out.println("Sum of items in the stack is " + sumStackItems(stack));
		System.out.println("Number of items in the queue is " + countQueueItems(que));
		
		stack.destroy();
		que.destroy();
	}
	
	public static int countQueueItems(Queue q) {
		int count = 0;
		Queue dummyQ = q;
		while(!dummyQ.isEmpty()) {
			dummyQ.dequeue();
			count++;
		}
		return count;
	}
	
	public static float sumStackItems(Stack s) {
		float sum = 0;
		Stack dummyS = s;
		while(!dummyS.isEmpty()) {
			sum += dummyS.getTop().getData().getCost();
			dummyS.pop();
		}
		return sum;
	}

}
