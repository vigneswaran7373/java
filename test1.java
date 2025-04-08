import java.util.Scanner;
class test{
    void move(){
        System.out.println("move from car for test");
    }
}
class test0 extends test{
      @Override void move(){
        System.out.println("move from car for test0");
    }
}
public class test1 extends test0 {
     void move(){
        System.out.println("move from car for test1");
     }
     
    
        public static void main(String args[]){
            Scanner in= new Scanner(System.in);
            test1 t1=new test1();
           t1.move();
           
        }      
    }
    

