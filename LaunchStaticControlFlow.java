public class LaunchStaticControlFlow{

static int a;
static int b;
static{
System.out.println("static block");
a=10;
b=20;
}
static void disp(){
System.out.println("static disp method");

System.out.println(a);
System.out.println(b);
}
public static void main(String []args){
System.out.println("Main Method");
disp();
}

}