import java.io.*;
class Test6{

public static void main(String []args) throws Exception{
   File f1=new File("abc.txt");
   FileWriter f2=new FileWriter(f1);
    f2.write(97);
    f2.write("Hellow Sachin HOw are you");
    char[] ch={'G','A'};
    f2.write(ch);
      f2.close();


}
}