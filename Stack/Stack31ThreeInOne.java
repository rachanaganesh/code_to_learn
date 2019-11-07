package Stack;

public class Stack31ThreeInOne {

        int[] aSize;  //array size of stack.
        int[] values; //actual main array with size StackSize*noOfStack
        int noOfStack = 3;
        int StackCapacity ; //StackSize

       public Stack31ThreeInOne(int StackSize ){
           aSize = new int[noOfStack];
           StackCapacity = StackSize;
           values = new int [StackSize * noOfStack];

        }

        public void Push(int StackNo, int val) {
            //update Stackno and push item to stack
            aSize[StackNo]++;
            values[indexOf(StackNo)] = val;

        }

        public int indexOf(int stacknum) {
            int offSet = stacknum * StackCapacity;
            int size = aSize[stacknum];

            return offSet+size-1;
        }

        public int pop(int StackNum) {
            int top = indexOf(StackNum);
            int value = values[top];
            values[top] = 0;
            aSize[StackNum]--;
            return value;
        }

        public int peek(int stacknum){
            return values[indexOf(stacknum)];
        }


public static void main(String[] args) {
    Stack31ThreeInOne stack = new Stack31ThreeInOne(3);
    stack.Push(0,1);
    stack.Push(0,2);
    stack.Push(0,3);

    stack.Push(1,4);
    stack.Push(1,5);
    stack.Push(1,6);

    System.out.println(stack.pop(0));
    System.out.println(stack.pop(1));

    System.out.println(stack.peek(1));

}





}
