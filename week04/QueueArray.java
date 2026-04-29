package Question01;

public class QueueArray {
    private int front, rear, maxSize, nItems;
    private int[] queue;

    public QueueArray(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        nItems = 0;
        queue = new int[maxSize];

    }

    public void insert(int item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");

        } else {
            queue[++rear] = item;
            nItems++;


        }
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
        }
        nItems--;
        return queue[front++];


    }

    public int peekFront(){
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;

        }
        return queue[front];
    }

    public boolean isFull(){
        return rear == maxSize - 1;
    }
    public boolean isEmpty(){
        return nItems == 0;
    }

    public int getCount(){
        return nItems;
    }
}