import java.io.*;
public class Test7{
public static void main(String[]args){

 FileReader f1=new FileReader("abc.txt");
 int i=f1.read();
 while(i!=-1){

 System.out.println((char )i);
 i=f1.read();
}

}

}