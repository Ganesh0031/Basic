import java.io.*;
public class Text2{
public static void main(String[]args) throws Exception{

String directoryName="IPLTeams";
//it treats as directory for jvm no different b/w directory and filename.this //acknowdgement with file and directory 
 File f=new File(directoryName);
System.out.println(f.exists());

}
}