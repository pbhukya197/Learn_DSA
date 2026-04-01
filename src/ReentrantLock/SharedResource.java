package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    public void producer(){
        try{
            lock.lock();
            System.out.println("Lock acquired by : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
            System.out.println("Work done by : " + Thread.currentThread().getName());
        }catch (Exception e){
            // some exception goes here
        }
        finally {
            lock.unlock();
            System.out.println("Lock release by : "+Thread.currentThread().getName());
        }
    }
}
// A thread that already holds a lock can acquire the same lock again without getting blocked. -> Reentrant Lock