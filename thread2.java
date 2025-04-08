class ThreadRun implements Runnable {
        public void run(){ 
            System.out.print("Thread using Runnable interface."); 
        } 
   }
   public class thread2{ 
    public static void main(String[] args){ 
        ThreadRun tr = new ThreadRun();//it is a uveal class and t is a object
        Thread t = new Thread(tr);// it is a thread class and t is a object
        t.start();  
    } 
}
// it is 2 method runnable interface