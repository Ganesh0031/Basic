interface Demo{

void disp();
void add(int a,int b);
}
public class Launch1{
public static void main(String ...args){

 Demo demo=new Demo(){

  public void disp(){
  System.out.println("Hello");
}
public void add(int a,int b){
 int c=a+b;
 System.out.println(c);
}
};
demo.disp();
demo.add(10,20);
}
}