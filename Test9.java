import java.io.*;
public class Test9{

public static void main(String[]args) throws Exception{

 FileWriter fw=new FileWriter("abc.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(105);
bw.write("Neuron");
bw.newLine();
char[]ch={'B','a','d'};
bw.write(ch);
bw.write("unicorn");
bw.flush();
bw.close();

}
}