import java.io.*;
public class Test12{

public static void main(String[]args){
 File a=new File("file1.txt");
 File b=new File("files.txt");
 FileReader f1=new FileReader(a);
 FileReader f2=new FileReader(b);
 FileWriter f3 =new FileWriter("ans.txt");
char[] ch1=new char[(int)f1.length()];
char[] ch2=new char[(int)f2.length()];
f1.read(ch);
f2.read(ch);
 for(char data:ch1){
   f3.write(data);
}

for(char data:ch2){
   f3.write(data); 
}
f3.flush();
f3.close();


}
}