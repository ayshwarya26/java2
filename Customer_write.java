import java.io.*;
import java.util.*;
class Customer_write
{
public static void main(String[] args)
{
try
{
 List<String> s = new ArrayList<String>();
BufferedWriter f=new BufferedWriter(new FileWriter("E:\\madhu\\Customer.txt"));
String name[]=new String[3];
String id[]=new String[3];
char gender[]=new char[3];
int age[]=new int[3];
String address[]=new String[3];
String city[]=new String[3];
String dob[]=new String[3];
String country[]=new String[3];
int pin[]=new int[3];
int phone[]=new int[3];

Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter Customer Details");
System.out.println("enter Name");
name[i]=sc.next();
System.out.println("enter gender");
gender[i]=sc.next().charAt(0);
System.out.println("enter id ");
id[i]=sc.next();
System.out.println("enter Age");
age[i]=sc.nextInt();
System.out.println("enter Pin no.");
pin[i]=sc.nextInt();
System.out.println("enter Address");
address[i]=sc.next();
System.out.println("enter Phone no");
phone[i]=sc.nextInt();
System.out.println("enter City");
city[i]=sc.next();
System.out.println("enter Country");
country[i]=sc.next();
System.out.println("enter DOB as ddmmyyyy");
dob[i]=sc.next();


f.write(name[i]+"\t"+id[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+address[i]+"\t"+city[i]+"\t"+country[i]+"\t"+pin[i]+"\t"+phone[i]+"\t"+dob[i]);
f.newLine();
}

f.close();
}

catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}
}