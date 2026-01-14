class Loan{
 void disp(){
System.out.println("Welcome to ineuron Bank");
}

}
class PersonalLoan extends Loan{
  void disp(){
 System.out.println("Personal loan app");
}
}
public class LaunchLoan{

public static void main(String []args){

 Loan pl=new Loan();
pl.disp();
}
}