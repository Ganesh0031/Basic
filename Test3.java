import java.io.*;
class Test3{

public static void main(String[]args) throws Exception{

 File f=new File("Ineuron");
 f.mkdir();
System.out.println("Is f pointing to directory :: "+f.isDirectory());
File f1=new File(f,"abc.txt");
f1.createNewFile();
System.out.println("Is f1 pointing to a file ::"+f.isFile());
 
}
}