import java.util.*;
public class LaunchHS{

public static void main (String []args){

HashSet hs=new HashSet();
hs.add(100);
hs.add(50);
hs.add(50);
hs.add(70);
System.out.println(hs);
LinkedHashSet lhs=new LinkedHashSet();
lhs.add(100);
lhs.add(50);
lhs.add(150);
lhs.add(20);
System.out.println(lhs);

}

}