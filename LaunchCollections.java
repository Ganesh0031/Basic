import java.util.*;
public class LaunchCollections{

public static void main(String []args){

 TreeSet ts=new TreeSet();
 ts.add(100);
 ts.add(50);
 ts.add(150);
 ts.add(25);
 ts.add(75);
 System.out.println(ts);
 ArrayList al=new ArrayList();
 al.add(100);
 al.add(50);
 al.add(150);
 al.add(25);
 al.add(125);
 System.out.println(al);
 Collections.sort(al);
 System.out.println(al);
 ArrayList<String>al2=new ArrayList<String>();
 al2.add("Hyder");
 al2.add("ineuron");
 al2.add("Ganesh");
 Collections.sort(al2);
 System.out.println(al2);
 }
}