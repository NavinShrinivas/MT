package Threads;

public class Thread1 extends Thread{
    static int num;
    public Thread1(int num){
        this.num = num;
    }
    @Override
    public void run(){
        while(true){
            System.out.println("Thread : "+this.num);
        }
    }
}
