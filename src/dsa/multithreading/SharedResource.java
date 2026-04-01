package dsa.multithreading;

public class SharedResource extends dsa.learnmultithreading.SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("producer thread calling the notify method.");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumeItem method.");
        while(!isItemPresent){
            try{
                System.out.println("Consumer thread is waiting");
                wait(); // Release all monitor Locks
            } catch (Exception e){
                // exception handling goes here
            }
        }
        System.out.println("Consumer thread consume the item.");
        isItemPresent = false;
    }
}
