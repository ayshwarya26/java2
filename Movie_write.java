import java.io.*;
import java.util.*;
class Movie_write
{
public static void main(String[] args)
{
try
{

BufferedWriter f=new BufferedWriter(new FileWriter("E:\\madhu\\Movie_Details.txt"));
String name[]=new String[3];
String id[]=new String[3];
int rate[]=new int[3];
String director[]=new String[3];
String actor[]=new String[3];
char type[]=new char[3];
String date[]=new String[3];


Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);

for(int i=0;i<3;i++)
{
System.out.println("enter Movie Details");
System.out.println("enter MovieID");
id[i]=sc.next();

System.out.println("enter movie name");
name[i]=sc1.nextLine();
System.out.println("enter rating");
rate[i]=sc.nextInt();
System.out.println("enter director");
director[i]=sc.next();
System.out.println("enter movie type ");
type[i]=sc1.nextLine().charAt(0);

System.out.println("enter date as ddmmyyyy");
date[i]=sc.next();
System.out.println("enter actor");
actor[i]=sc1.nextLine();




f.write(id[i]+"\t"+name[i]+"\t"+director[i]+"\t"+actor[i]+"\t"+date[i]+"\t"+type[i]+"\t"+rate[i]);
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