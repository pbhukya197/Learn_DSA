package code.SharedBuffer;

public class Consumer implements Runnable{
    SharedBuffer buffer;
    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(2000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
