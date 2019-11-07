package classes;

import java.util.EmptyStackException;

public class Stacks<T> {
    private static class StackNode<T> {
        private StackNode<T> next;
        private T data;

        public StackNode (T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if(top==null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return  item;

    }

    public void push(T item) {
        if(item==null) throw new EmptyStackException();
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;

    }

    public boolean IsEmpty() {
        return  top ==null;
    }

    public T peek(){
        if (top== null) throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.pop();
        stack.push(stack);
    }
}
