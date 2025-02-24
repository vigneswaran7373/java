import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
//file concept
public class file {
    public static void main(String args[]){
     
        try{
            File f=new File("vw.txt");
            FileWriter fw=new FileWriter(f);//file writer
            fw.write("hi da ");
            fw.close();
            File f1=new File("vw.txt");
            Scanner read=new Scanner(f1);// file read
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        }
        catch(Exception e){
           System.out.println(e);
        }
    }
}
