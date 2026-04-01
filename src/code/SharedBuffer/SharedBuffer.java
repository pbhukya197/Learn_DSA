package code.SharedBuffer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(buffer.size() == capacity){
            System.out.println("Buffer is full... Producer waiting.");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced : "+item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while(buffer.isEmpty()){
            System.out.println("Buffer empty... Consumer waiting.");
            wait();
        }
        int item = buffer.remove();
        System.out.println("Consumed : "+item);
        notifyAll();
    }
}
