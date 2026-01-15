@FunctionalInterface
interface Add{
void add(int a,int b);
}
@FunctionalInterface
interface Sub{
void sub(int a,int b);
}
public class LaunchLambda{
public static void main(String []args){
 Add add=(a,b)->{
 int res=a+b;
System.out.println(res);
};
add.add(10,30);
Sub sub=(a,b)->{
int res=b-a;
System.out.println(res);

};
sub.sub(10,30);

}

}