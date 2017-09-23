import java.util.Scanner;
class String1
{
public static void main(String args[])
{
String a;
char d;
int b,c=0,flag=0;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
b=a.length();
char[] ch=a.toCharArray();
for(int i=0;i<b;i++)
{
for(int j=0;j<b;j++)
{
if((ch[i]==ch[j]) && (i!=j))
{
d=a.toUpperCase().charAt(i);
System.out.println(d);
flag++;
}
if(flag!=0)
break;

}}
}}


