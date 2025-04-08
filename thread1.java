class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from Thread1");
            try {
                Thread.sleep(10);//wait 10 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from Thread2");
            try {
                Thread.sleep(10);//wait 10 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread1{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setPriority(10); // Highest priority
        t2.setPriority(5);  // Normal priority

        t1.start();
        t2.start();
    }
}



// thread is a using multi tasking same time execute multi process
// thread use 2 methods 1,thread class 2,runnable interface
//thread must use run method 
//set priority means which execution execute priority  1to4 low ,5 is normal ,6 to 10 high priority