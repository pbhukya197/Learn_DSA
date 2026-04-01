package code.SharedBuffer;

public class Main {
    public static void main(String[] args){
        SharedBuffer buffer = new SharedBuffer(2);

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();

    }
}
