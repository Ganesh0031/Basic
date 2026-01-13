class Demo1{

int a;
int b;
static int count;
{
count++;
}
Demo1(){
 this(100);
 System.out.println("First con");
}
Demo1(int a){
System.out.println(a);
this.a=a;
}
Demo1(int a,int b){
 this.a=a;
 this.b=b;
}

}
public class LaunchNonStaticBlock{

public static void main(String []args){

 Demo1 d=new Demo1();
 Demo1 d2=new Demo1(10);
 Demo1 d3=new Demo1(20,39); 
System.out.println(Demo1.count); 
}
}