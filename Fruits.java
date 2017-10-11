import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
class Fruits
{
public static void main(String[] args)
{
try
{
String s[]=new String[5];
BufferedWriter output=new BufferedWriter(new FileWriter("E:\\madhu\\Fruits.txt"));
System.out.println("Enter 5 fruit names");
Scanner a=new Scanner(System.in);
for(int i=0;i<5;i++)
{s[i]=a.nextLine();
if(s[i].contains("orange"))
{System.out.println("Orange cant be stored in file!!!");
}
else
{
output.write(s[i]);
output.newLine();
}}



output.close();

System.out.println("data written successfully");
}
catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}

}