import java.io.*;
public class Test{
  public static void main (String []args) throws IOException{
       String fileName="abc.txt";
       File f=new File(fileName);
       System.out.println(f.exists());
       f.createNewFile();
  System.out.println(f.exists());
}
}