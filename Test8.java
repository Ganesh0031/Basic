import java.io.*;
public class Test8{

 public static void main(String[] args) throws Exception{

 File f=new File("sachin.txt");
 FileReader f1=new FileReader(f);
char[] ch=new char[(int)f
.length()];
f1.read(ch);
 for(char data:ch){
System.out.print(data);
}
f1.close();

}

}