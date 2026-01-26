@FunctionalInterface
interface Trial{
int getNum();
}
class JavaLearning{
public void disp1(){ 
  System.out.println("Parent disp");
 }
}
class Focus extends JavaLearning{
@Override
public void disp1(){
System.out.println("Focus is key");
}
}
public class LaunchAnno{

public static void main(String [] args){

Trial t=()->10;
System.out.println(t.getNum());
}
}