// single inheritance  1 parent 1 child
class Dad {
    int amount = 2300; //parent class
    void info(){
        System.out.println("son of vasu indian lorry private limte owner");
    }
}


class Son extends Dad { //child class
    String name = "arun";
}

public class inheritance {
    public static void main(String args[]) {
        Son s1 = new Son();// object create child class call parent class also 
        child1 c1=new child1();
         child2 c2=new child2();
         s1.info();
        System.out.println(s1.amount);
        System.out.println(c2.amount);
        c1.pinfo();
        c2.pinfo();
    }
}
// below code for hierarchial inheritance 1 parent multiple child
class parent{
  int amount=4300;
   void pinfo(){
        System.out.println("parent of two children");
   }
}
class child1 extends parent{
    String child1="child one";
}
class child2 extends parent{
    String child2="child two";
}
