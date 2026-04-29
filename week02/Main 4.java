package question01;

public class Main {
    public static void main(String[] args) {
        StackArray stack=new StackArray(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek: " +stack.peek());
        System.out.println("Popped: " +stack.pop());

        stack.display();

        System.out.println("Is stack empty? " +stack.isEmpty());
        System.out.println("Is stack full? "  +stack.isFull());


    }
}
