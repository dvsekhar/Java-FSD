package queue;

public class Queue {
	final int capacity;
	int[] items;
	
	int REAR = -1;
	int FRONT = -1;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.items = new int[this.capacity];
	}
	
	void enqueue(int val) {
		
		if (isFull())
			System.out.println("Queue is full. cannot add.." + val);
		else {
			
			if (FRONT == -1)
				FRONT=0;
			
			REAR++;
			
			items[REAR] =val; 
			
		}
	}
	
	void display() {
		
		if (REAR==-1)
			System.out.println("Queue is empty");
		else
		{
			System.out.println("Items -> ");
		for(int i=FRONT;i<=REAR;i++)
			System.out.println(items[i] + " ");
		}
	
	}
	
	boolean isFull() {
		if (REAR - FRONT == capacity-1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Queue queue1 = new Queue(5);
		
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(60);
		
		queue1.display();
		
		queue1.enqueue(45);
		queue1.enqueue(34);
		queue1.enqueue(56);
		
		queue1.display();

	}

}
