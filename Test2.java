import java.io.*;
class Test2{

public static void main(String []args) throws Exception{

 String directoryName="IPLTeams";
  File f=new File(directoryName);
  System.out.println(f.exists());
  f.mkdir();
  System.out.println(f.exists());


}
}