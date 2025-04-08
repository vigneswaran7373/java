class A extends Thread {
    int j = 0;
    public void run() {
        j = 50;
    }
}

public class thread3 {
    public static void main(String args[]) {
        A a1 = new A();
        a1.start();        // Start the thread (runs `run()` method)

        try {
            a1.join();     // Waits for thread a1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a1.j);  // Should print 50
    }
}
// JOIN USE main thread wait sub thread is finish 
