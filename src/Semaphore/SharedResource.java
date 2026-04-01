package Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);
    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch (Exception e){
            // exception goes here
        }
        finally {
            lock.release();
            System.out.println("Lock release by : "+Thread.currentThread().getName());
        }
    }
}

// A Semaphore controls the number of threads that can access a shared resource simultaneously using permits.
// The number of allowed threads is controlled by permits.