package Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<String> aQueue=new ArrayQueue<String>();
        aQueue.enqueue("ali");
        aQueue.enqueue("mohmmmed");
        aQueue.enqueue("saleh");
        System.out.println("the front is :"+aQueue.front());
        while (!aQueue.isEmpty()){
            System.out.println("element removed="+aQueue.dequeue());
        }

    }
}