import java.util.Scanner;
class Reversea
{
public static void main(String args[])
{
String a;
String r ="";
System.out.println("enter name");
Scanner s=new Scanner(System.in);
a=s.nextLine();
int l=a.length();
for(int i=l-1;i>=0;i--)
{
r=r+(a.charAt(i));
} 
System.out.println(r);
}}