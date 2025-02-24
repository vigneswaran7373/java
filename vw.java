import java.util.Scanner;

class vw{
    public static void main(String args[]){
        int a=5;
        int b=5;
        System.out.println(a+b);
        Scanner va=new Scanner(System.in);
        System.out.println("enter the 2 names");
        String name1=va.nextLine();
        String name2=va.nextLine();
        String name3=new String("vw");
        String name4=new String("vw");
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);
        System.out.println(name3==name4);
    }
}