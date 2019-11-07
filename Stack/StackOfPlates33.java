package Stack;

import java.util.Stack;

public class StackOfPlates33 {
    Stack<Integer> stack = new Stack<Integer>();

    int limit ;
    int capacity;

    public  StackOfPlates33 (int size){
         Stack s = new Stack() ;
         capacity = size;
         limit = 1;

    }
    public void push(int item) {

        if(limit<=capacity){
            stack.push(item);
            limit++;
        }
        else {
          //  stack2.push(item);
        }
        System.out.println(stack);
       // System.out.println(stack2);

    }

    public static void main(String[]args) {
        Stack<Integer> stack = new Stack<Integer>();

        StackOfPlates33 plate = new StackOfPlates33(3);
        plate.push(3);
        plate.push(6);
        plate.push(9);
        plate.push(12);
    }
}
