abstract class Loan1{
abstract public void dispInt();
public void welcomeNote(){
  System.out.println("Welcome to xxx bank");
}
}
class HomeLoan extends Loan1{
 public void dispInt(){
System.out.println("RI is 12%");
}
}
class EductionsLoan1 extends Loan1{

 public void dispInt(){
 System.out.println("RI is 10%");
}
}
public class LaunchAbs{

public static void main(String []args){

Loan1 loan=new HomeLoan();
loan.welcomeNote();

Loan1 loan1=new EductionsLoan1();
loan1.dispInt();
loan.welcomeNote();

}
}