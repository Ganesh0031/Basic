class Parent{

int a,b;
Parent(){

a=10;
b=20;
System.out.println("Parentt Const");

}
Parent(int a,int b){

this.a=a;
this.b=b;
System.out.println("Parent para const");
}



}
class child extends Parent{

int x, y;
child(){
 this(111,222);
  x=100;
  y=200;

}
child(int x,int y){
this.x=x;
this.y=y;

}
void disp(){

System.out.println(a);
System.out.println(b);
System.out.println(x);
System.out.println(y);

}
}
public class LaunchConst{

public static void main(String []args){

  child c=new child();
  c.disp();
  child ch1=new child(11,22);
  ch1.disp();
}
}