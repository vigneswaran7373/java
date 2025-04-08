import java.util.Scanner; 
 import fruite.orange;  //fruite is a package name orange is a class name
 import fruite.tree.mango;//fruite is a package tree also package inside the fruite mango is a class name it is a nested package

public class dummy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
         orange d1= new orange();
         mango m1=new mango();
         d1.orange1();//this is method is another package method 
         m1.mango1();//this is method is another nested package method 
        
    }
}
//package is a collection class contain 
//one package is use another package methods using import keyword
//package use for maintain lot of class its help big project