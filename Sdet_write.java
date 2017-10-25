import java.io.*;
import java.util.*;
class Sdet_write
{
public static void main(String[] args)
{
try
{
 List<String> s = new ArrayList<String>();
BufferedWriter f=new BufferedWriter(new FileWriter("E:\\madhu\\Std.txt"));
String name[]=new String[3];
String id[]=new String[3];
int age[]=new int[3];
String city[]=new String[3];
String country[]=new String[3];

Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);
Scanner sc5=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter Student Details");
System.out.println("enter Name");
name[i]=sc1.nextLine();
System.out.println("enter id in format S291");
id[i]=sc2.nextLine();
char ch[]=id[i].toCharArray();
if(ch[0]=='s' && (ch[1]>='0' && ch[1]<='9')&& (ch[2]>='0' && ch[2]<='9') && (ch[3]>='0' && ch[3]<='9') && (ch[4]>='0' && ch[4]<='9'))
{
}
else
{
System.out.println("ID INVALID...TRY AGAIN ");
id[i]=sc2.nextLine();
}
System.out.println("enter City");
city[i]=sc3.nextLine();
System.out.println("enter Country (Must be only India)");
country[i]=sc4.nextLine();
if(country[i]!="india")
{System.out.println("INVALID COUNTRY TRY AGAIN");
country[i]=sc4.nextLine();

}
System.out.println("enter Age");
age[i]=sc5.nextInt();

f.write(name[i]+"\t"+id[i]+"\t"+city[i]+"\t"+country[i]+"\t"+age[i]);
f.newLine();
}
String st;


f.close();
}

catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}
}