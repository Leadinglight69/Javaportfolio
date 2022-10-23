public class Stack {
    private final int[] stack;
    private final int size;
    private int top;

    public Stack (int size){
        stack = new int[size];
        this.size=size;
        top= -1;
    }
    public void push(int value) {
        if (!isFull()){
            stack[++top] =value;
        }else {
            System.out.println("Der Stack ist voll");
        }
    }
    public int pop(){
        if (!isEmpty()) {
            return stack[top--];
        }
        return -1;
    }
    public int peek () {
        if(!isEmpty()){
            return stack[top];
        }
            return -1;
    }
    public int size(){
        return size;
    }
    public int getCapacity() {
        return top + 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size -1;
    }
}
