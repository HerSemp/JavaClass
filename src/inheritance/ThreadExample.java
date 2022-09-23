package inheritance;

public class ThreadExample extends Thread{
    public ThreadExample(){

    }
    public void run(){
        System.out.println("Thread created");
    }
    public static void main(String[] args){
        ThreadExample t = new ThreadExample();
        //t.run();
        t.start();
    }

}
