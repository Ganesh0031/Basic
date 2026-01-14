class Parents{

public void cry(){
System.out.println("Parent Crying");
}
}
class Child11 extends Parents{
  public void cry(){
          System.out.println("Child1 is crying");
}
public void eat(){
System.out.println("Child1 eats less");
}
}

class Child12 extends Parents{
public void cry(){
  System.out.println("Child2 is Crying");
}
public void eat(){
 System.out.println("Chidl 2 eat more");
}

}
public class LaunchParent2{
public static void main(String []args){

Child11 p=new Child11();
p.cry();
p.eat();
//((Child11)p).eat();
Parents p1=new Child12();
p1.cry();
((Child12)p1).eat();
}
}



