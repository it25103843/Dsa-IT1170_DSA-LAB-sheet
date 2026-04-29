package question03;

public class StackArray {
    private int maxSize;
    private char[] stackArray;
    private int top;

     public StackArray(int s){
         maxSize = s;
         stackArray=new char[maxSize];
         top=-1;

     }

     public void push(char s){
         if(top==maxSize-1){
             System.out.println("Stack is full");
         }
         else{
             stackArray[++top]=s;
         }
     }

     public char pop(){
         if(top==-1){
             System.out.println("Stack is empty.");
             return '0';

         }
         else{
             return stackArray[top--];
         }
     }

     public char peek(){
         if(top==-1){
             System.out.println("Stack is Empty,");
             return '0';
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

     public boolean isBalanced(String string){
         StackArray stack=new StackArray(string.length());

         for(int i=0;i<string.length();i++){

             char ch=string.charAt(i);

             if(ch=='[' || ch=='('|| ch=='{'){
                 stack.push(ch);
             }
             else if(ch==']' || ch=='}' || ch==')'){
                 if(stack.isEmpty()){
                     return false;
                 }

                 char top=stack.pop();

                 if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                     return false;
                 }



             }
         }
         return stack.isEmpty();
     }

}
