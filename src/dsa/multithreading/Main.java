package dsa.multithreading;

public class Main {
    public static void main(String[] args){
        System.out.println("Going inside main method : "+Thread.currentThread().getName());
        MultithreadingLearning runnableobj = new MultithreadingLearning();
        Thread thread = new Thread(runnableobj);
        thread.start();
        // start() internally calls run method
        System.out.println("Finish main method : "+Thread.currentThread().getName());
    }
}
