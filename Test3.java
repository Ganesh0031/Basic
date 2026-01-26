import java.io.*;
public class Test3{

public static void main (String [] args)throws Exception{

  String location="C:\\ineuron";
  File f=new File(location);
f.mkdir();
File f1=new File(f,"java.txt");
f1.createNewFile();
}
}