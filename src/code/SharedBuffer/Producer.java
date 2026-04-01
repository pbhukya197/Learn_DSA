package code.SharedBuffer;

public class Producer implements Runnable {
    SharedBuffer buffer;
    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        int value = 1;
        try {
            while (true) {
                buffer.produce(value++);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
