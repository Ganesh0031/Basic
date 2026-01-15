import java.util.Scanner;
public class ExceptionExm1{
 public static void main(String []args){
   System.out.println("Connection to calc app is installed");
try{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the first num to divide ");
 int num1=sc.nextInt(); 
System.out.println("Enter the 2nd num to divide");
 int num2=sc.nextInt();
int res=num1/num2;
System.out.println(res);

}
catch(Exception e){
System.out.println("You're trying to divide by zero illogical");
}
System.out.println("Connection is terminated");

}
}