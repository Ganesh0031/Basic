//final class d{}
class Vehicle extends d{
 int i=10;
final void disp(){
  i=20;
  System.out.println(i);
  System.out.println("Vehical");
}

}
class Car extends Vehicle{

 
}
public class LaunchFinalK{

 public static void main(String []args){

 Car c=new Car();
c.disp();
}
}