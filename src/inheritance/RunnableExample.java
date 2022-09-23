package inheritance;

public class RunnableExample implements Runnable{
    static Thread t;
    public static void main(String[] args){
        RunnableExample r = new RunnableExample();

         t = new Thread(r);
        t.start();
        System.out.println("I am not a 5"+t);
        //r.run();


    }

    @Override
    public void run() {
        System.out.println("Thread from interface");
        try {
            t.sleep(5000);
            System.out.println("After 5");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
