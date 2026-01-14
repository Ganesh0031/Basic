class Parent{
private String name;
Parent(){
System.out.println("Parent constructor");
}
void disp(){
System.out.println("Parent");

}
}
class Child extends Parent{
 void disp2(){

}
} 
public class LaunchCyclic{
 public static void main(String []args){

Child d=new Child();
d.disp();
}
}