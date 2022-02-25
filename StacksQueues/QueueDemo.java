package StacksQueues;

class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(5); //create the queue
    
        if(queue.isEmpty())
        System.out.print("Queue is empty.");
        else
        System.out.print("Queue is not empty.");
        
        System.out.printf("%n");
        
        if(queue.isFull())
        System.out.print("Queue is full.");
        else
        System.out.print("Queue is not full.");
	}
}
