package Stack;

import java.util.Stack;

public class Stack32StackMin {
    int stackSize[] ;
    int items;
   // int stackCapacity = 5;
        Stack<Integer> stack = new Stack<Integer>();
        int max = Integer.MAX_VALUE;

    public void push(int x) {
        if(stack.empty()|| x>=max) {
            max = x;
            stack.push(max);
        }
         else {
            stack.push(x);
        }
    }

    public void pop() {
        if(stack.pop()==max) max = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        System.out.println(max);
        return max;
    }



    public static void main(String[] args) {

        Stack32StackMin min = new Stack32StackMin();
        min.push(3);
        min.push(5);
        min.getMin();
        min.push(7);
        min.push(19);
        min.getMin();
        min.pop();
        min.getMin();
        min.pop();
        min.top();

    }
}