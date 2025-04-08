class Table {
    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5); // print table of 5
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100); // print table of 100
    }
}

public class Syncthread{
    public static void main(String[] args) {
        Table obj = new Table(); // only one object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
//Two threads (t1, t2) are trying to use the same object obj.
//Without synchronized, they would interleave, making output messy.
//With synchronized, one thread waits until the other finishes using printTable().
