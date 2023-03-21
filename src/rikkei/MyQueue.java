package rikkei;

public class MyQueue {
    private Node front; //* Node đầu
    private Node rear; //* Node cuối

    public MyQueue() {
        //* Khởi tạo Queue rỗng
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        //* Thêm 1 phần tử ở cuối
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        this.rear.link = newNode;
        this.rear = newNode;
    }

    public int deQueue() throws IllegalAccessException {
        if (this.front == null)
            throw new IllegalAccessException("Null");
        if (this.front == this.rear) {
            this.rear = null;
        }
        int data = this.front.data;
        this.front = this.front.link;
        return data;
    }
}
