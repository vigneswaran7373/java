// multilevel  inheritance  1 parent 1 child 1grand father
class grandfather {
    int amount=800000;
}
class dad extends grandfather{
   String name="vasu";
}
class son extends dad{
  String name="son of vasu";
}
public class inheritance2{
  public static void main(String args[]){
    son s1 =new son();
    child c1=new child();
    System.out.println(s1.amount);
    System.out.println(s1.name);
    System.out.println(c1.relative);
    System.out.println(c1.money);
	D obj = new D();
	obj.disp();
   }
  }
// multiple inheritance 2 parent 1 child
interface parent1{
int money=4500;
}
interface parent2{
String relative="parent2";
}
class child implements parent1,parent2 
{
String name="parent1 and parent2 son";
}
//hybrid more then two type inheritance
class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class D extends A
{
   public void disp()
   {
	System.out.println("D");
   }
}
