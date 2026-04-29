package question03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an expression with parentheses: ");
        String paran=input.next();

        StackArray stack=new StackArray(paran.length());

        if (stack.isBalanced(paran)){
            System.out.println("The expression has balanced parentheses");
        }
        else{
            System.out.println("The expression has inbalanced parentheses");
        }
    }
}
