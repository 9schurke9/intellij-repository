package Thread;

//Kapitel: Threads
public class ThreadImplements implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i<=10; i++)
            System.out.println("Thread Implements");
    }

}