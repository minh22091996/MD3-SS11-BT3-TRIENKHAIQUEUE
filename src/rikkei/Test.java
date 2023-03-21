package rikkei;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        int i = 5;
        System.out.print("Phần tử lấy ra là--> ");
        while (i > 0){
            System.out.print("\t" +myQueue.deQueue());
            i--;
        }
    }
}
