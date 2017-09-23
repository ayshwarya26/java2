import java.util.Scanner;
class Pin
{
public static void main(String[] args)
{
int q=0,n,s=0,p=0,c,m=0;
String a;
char x,y,z;
System.out.println("enter ur name and no");
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
Scanner sc1=new Scanner(System.in);
n=sc.nextInt();
q=n;
//first char

while(n!=0)
{
s=s+(n%10);
n=n/10;
}
while(s!=0)
{
p=p+(s%10);
s=s/10;
}
while(p!=0)
{
m=m+(p%10);
p=p/10;
}
System.out.println("The pin is");
System.out.print(m);

char[] b=a.toCharArray();
c=a.length();
x=b[0];
y=b[c-1];
System.out.print(x);
System.out.print(y);

q=q%10;
switch(q)
{
case 0:
{
z=')';
System.out.print(z);
break;
}
case 1:
{
z='!';
System.out.print(z);
break;
}
case 2:
{
z='@';
System.out.print(z);
break;
}
case 3:
{
z='#';
System.out.print(z);
break;
}
case 4:
{
z='$';
System.out.print(z);
break;
}
case 5:
{
z='%';
System.out.print(z);
break;
}
case 6:
{
z='^';
System.out.print(z);
break;
}
case 7:
{
z='&';
System.out.print(z);
break;
}
case 8:
{
z='*';
System.out.print(z);
break;
}
case 9:
{
z='(';
System.out.print(z);
break;
}
default:
{
System.out.println("error");
}
}





}}