package Threads;

public class Runs implements  Runnable{
    int x;
    public Runs(int x){
        this.x = x;
    }
    public void run(){
        while (true){
            System.out.println(this.x);
        }
    }
}
