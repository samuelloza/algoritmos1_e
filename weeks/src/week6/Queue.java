public class Queue {
    private int array[];
    private int maxSize = 0;
    private int size;
    private int  front;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        front = 0;
        size = 0;
    }

    //Puede ser add
    public void push(int value) {
        array[size] = value;
        size++;
    }

    public int pop() {
        int tmp = array[front];
        front++;
        return tmp;
    }

    public int peek() {
        return array[front];
    }

    public boolean isEmpty() {
        return size <= 0; 
    }
}