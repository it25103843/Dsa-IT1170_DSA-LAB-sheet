package question02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sentence=input.nextLine();

        StackArray stack=new StackArray(sentence.length());

        for(int i=0;i<sentence.length();i++){
            stack.push(sentence.charAt(i));
        }

        System.out.print("Reversed String: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
