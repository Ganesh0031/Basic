import java.util.*;
public class LaunchImp{
public static void main(String []args){

ArrayList al=new ArrayList();
al.add(10);
al.add(10.5);
al.add('c');
System.out.println(al);
ArrayList al2=new ArrayList();
al2.add(10);
al2.add(20);
al2.add(30);
al2.add(40);
al2.add(50);
System.out.println(al2);
for(int i=0;i<al2.size();i++){
System.out.println(al2.get(i)+" ");
}
System.out.println();
for(Object obj:al2){

System.out.println(obj+" ");
}

System.out.println("***************");
Iterator itr1=al2.iterator();
while(itr1.hasNext()){

 System.out.println(itr1.next());
}
System.out.println("reverse");
ListIterator litr=al2.listIterator(al2.size());
while(litr.hasPrevious()){
System.out.println(litr.previous());
TreeSet ad=new TreeSet();
ad.add(10);
ad.add(20);
ad.add(30);
ad.add(40);
Iterator it=ad.iterator();
while(it.hasNext()){

Integer i=(Integer)it.next();
System.out.println("Array De"+i);
}
System.out.println("added linked list");
LinkedList ll=new LinkedList();
ll.addAll(ad);
ListIterator litr2=ll.listIterator(ll.size());
while(litr2.hasPrevious()){
System.out.println(litr2.previous());
}

}
}

}