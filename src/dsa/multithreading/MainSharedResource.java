package dsa.multithreading;

public class MainSharedResource {
    public static void main(String[] args){
        SharedResource sharedResourceobj = new SharedResource();

        Thread producerThread = new Thread(() ->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResourceobj.addItem();
        });

        Thread consumerThread = new Thread(() ->{
           sharedResourceobj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
