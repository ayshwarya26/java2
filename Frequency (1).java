import java.util.Scanner;
class Frequency
{
public static void main(String[] args)
{
int f[]=new int[6];
int l;
String a;
System.out.println("Enter any string");
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
l=a.length();
for(int i=0;i<6;i++)
{f[i]=0;
}
char ch[]=a.toCharArray();
for(int i=0;i<l;i++)
{
switch(ch[i])
{case 'a':
{
f[0]++;
break;
}
case 'e':
{
f[1]++;
break;
}
case 'i':
{
f[2]++;
break;
}
case 'o':
{
f[3]++;
break;
}
case 'u':
{
f[4]++;
break;
}
default:
{
f[5]++;
}
}}
for(int i=0;i<6;i++)
{
switch(i)
{
case 0:
{ 
System.out.println("a's in String: "+f[i]);
break;
}
case 1:
{ 
System.out.println("e's in String: "+f[i]);
break;
}
case 2:
{ 
System.out.println("i's in String: "+f[i]);
break;
}
case 3:
{ 
System.out.println("o's in String: "+f[i]);
break;
}
case 4:
{ 
System.out.println("u's in String: "+f[i]);
break;
}
case 5:
{ 
System.out.println("Consonants's in String: "+f[i]);
break;
}
}}
int h=0,r=0;
for(int i=0;i<5;i++)
{
r=r+f[i];
if(f[i]!=0)
{h++;
}}
System.out.println("the no. of vowels:  "+h);
System.out.println("Total no. of vowels: "+r);

}}
