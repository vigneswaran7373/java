class sw{
    String names="vicky";
}
class ww extends sw {
    int age;
    String naam;
    String name="arun";
    void printn(int age,String naam){
        System.out.println(super.names); //super use for same name use parent class name
       this. naam=naam; //this class variable store it
        this.age=age;  //this class variable store it
        
}
}

public class inpuiltfun {
    public static void main(String args[]){
        final int age=18; //final key word is constant not change value final key word use methods and  attributes
        ww s1=new ww();
        info i1=new info();
        arun a1=new arun();
        s1.printn(18,"vicky");
        System.out.println(age);
         System.out.println(s1.naam);
         System.out.println(s1.age);
         System.out.println(i1.payru);
        i1.display();
        a1.show();

    }
    //public-- any palce or package accses
    //private-- only use inside the class
    //producted-- this pakage act public but other pakage not acces
    //default--like public but package is private
}
class  info2{
    protected String payru="ballu";
}
class info extends info2{
    private int id=101;
    void display(){
        System.out.println(id);
    }
}
// abstract class and abstract methods
abstract class vicky{ //abstract class
    void show(){   // this is abstract class so not create object this class ,then how to access this class craete one child class inherite then call
        System.out.println("hi how are you");
    }
    abstract void eat(); //this is abstract method just define not give definition give coniform over write another class
                         // abstract method only use abstract class
}
class arun extends vicky{
    int num=78;
    void eat(){
        System.out.println("you eat well");
    }
}

