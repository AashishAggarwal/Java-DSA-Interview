package StacksQueues;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);
        System.out.println("Succesfully created Stack!");
        
        //output if stack is empty or not
        if(stack.isEmpty())
        System.out.print("Stack is empty");
        else
        System.out.print("Stack is not empty");
        
        System.out.printf("%n");
        
        //output if stack is full or not
        if(stack.isFull())
        System.out.print("Stack is full");
        else
        System.out.print("Stack is not full");

        System.out.print("Elements pushed in the Stack: ");
        for (int i = 0; i < 5; i++) {
            stack.push(i); //pushes 5 elements (0-4 inclusive) to the stack
            System.out.print(i + " ");
        }
        System.out.println("\nIs Stack full? \n" + stack.isFull());
        System.out.print("Elements popped from the Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop()+" "); //pops all 5 elements from the stack and prints them
        }
        System.out.println("\nIs Stack empty? \n" + stack.isEmpty());

    
    }
}
