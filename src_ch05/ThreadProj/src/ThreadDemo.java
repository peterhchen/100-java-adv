class RunnableThread implements Runnable {
    private Thread t;
    private String threadName;
    RunnableThread (String name) {
        threadName = name;
        System.out.println ("Creating " + threadName);
    }
    public void run () {
        System.out.println ("Running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println ("Thread: " + threadName + ", " + i);
                Thread.sleep (50);
            }
        } catch (InterruptedException inter) {
            System.out.println ("Thread: " + threadName + " interripted.");
        }
        System.out.println ("Thread " + threadName + " exiting.");
    }
    public void start () {
        System.out.println ("Thread: " + threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start();
        }
    }
}

public class ThreadDemo {
    public static void main (String[] args) {
        RunnableThread r1 = new RunnableThread ("Thread-1");
        r1.start ();
        RunnableThread r2 = new RunnableThread ("Thread-2");
        r2.start();
    }
}
