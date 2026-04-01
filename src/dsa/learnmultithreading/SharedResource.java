package dsa.learnmultithreading;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem() {

        System.out.println("ConsumeItem method invoked by: "
                + Thread.currentThread().getName());

        while (!itemAvailable) {
            try {
                System.out.println("Thread "
                        + Thread.currentThread().getName() + " is waiting now");
                wait();   // releases monitor lock
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
