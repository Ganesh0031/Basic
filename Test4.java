import java.io.*;
public class Test4{

public static void main(String []args){
 int fileCount=0;
 int dirCount=0;
 int jpgFileCount=0;
 int txtFileCount=0;
 int zipFileCount=0;
 String location="C:\\ineuron\\Basic";
 File f=new File(location);
 String[]names=f.list();
 for(String name: names){
 File f1=new File(f,name);
   if(f1.isDirectory())
      dirCount++;

   else if(f1.isFile()){
      if(name.endsWith(".png"))
         jpgFileCount++;
      if(name.endWith(".txt"))
         txtFileCount++;
      if(name.endWith(".zip")
         zipFileCount++;
}
}
System.out.println("Total no of file "+fileCount);
System.out.println("Total no of the dirctory"+dirCount);


}
}