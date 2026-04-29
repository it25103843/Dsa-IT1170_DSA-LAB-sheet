package question01;

public class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

     public StackArray(int s){
         maxSize = s;
         stackArray=new int[maxSize];
         top=-1;

     }

     public void push(int s){
         if(top==maxSize-1){
             System.out.println("Stack is full");
         }
         else{
             stackArray[++top]=s;
         }
     }

     public int pop(){
         if(top==-1){
             System.out.println("Stack is empty.");
             return -1;

         }
         else{
             return stackArray[top--];
         }
     }

     public int peek(){
         if(top==-1){
             System.out.println("Stack is Empty,");
             return -1;
         }
         else{
             return stackArray[top];
         }

     }

     public boolean isEmpty(){
         return top==-1;
     }

     public boolean isFull(){
         return top==maxSize-1;
     }

     public void display(){
         System.out.println("Stack Elements:");
         for(int i=0;i<=top;i++){
             System.out.println(stackArray[i]+' ');
         }
         System.out.println();
     }

}
