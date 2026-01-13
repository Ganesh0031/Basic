class Student1{

private int age;
private String name;
private String city;
private Boolean married;

public int getAge(){
  return age;
}
public void setAge(int age){
  this.age=age;
}
public String getName(){
return name;
}
public void setName(String name){
 this.name=name;
}
public String getCity(){
  return city;
}
public void setCity(String city){
    this.city=city;
}
public boolean isMarried(){
  return married;
}
//public void isMarried(boolean married){
//this.married=married;

//}
}
public class LauchEncap{

public static void main(String []args){


 Student1 st=new Student1();
 st.setName("Ganesh");
 System.out.println(st.getName());
 st.setCity("Pune");
 System.out.println(st.getCity());
 st.setAge(12);
 System.out.println(st.getAge());
//st.isMarried(true);
}

}