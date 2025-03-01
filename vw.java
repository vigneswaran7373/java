import java.util.Scanner;

class vw{
    public static void main(String args[]){
        int a=5;
        int b=5;
        System.out.println(a+b);
        Scanner va=new Scanner(System.in);//user input get this function
        System.out.println("enter the 2 names");
        String name1=va.nextLine();//normal variable incase same name create one reference memory 
        String name2=va.nextLine();//normal variable incase same name create one reference memory 
        String name3=new String("vw"); //object string crate new raference memory each object string
        String name4=new String("vw"); //object string crate new raference memory each object string
        System.out.println(name1.equals(name2));//equal inbuilt function
        System.out.println(name1==name2);
        System.out.println(name3==name4);
    }
}



// hint !!!
// java string comparision campare referance memory not string values or inside content  ok dont forget