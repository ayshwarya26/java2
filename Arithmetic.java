import java.util.Scanner;
class Arithmetic
{
public static void main(String args[])
{
int a,b;
char c;
System.out.println("enter the nos");
Scanner x=new Scanner(System.in);
a=x.nextInt();
Scanner y=new Scanner(System.in);
b=y.nextInt();
System.out.println("enter the operator");
Scanner z=new Scanner(System.in);
c=z.next().charAt(0);
switch(c)
{
case '+':
System.out.println(a+b);
break;
case '-':
System.out.println(a-b);
break;
case '*':
System.out.println(a*b);
break;
case '%':
System.out.println(a%b);
break;
case '/':
System.out.println(a/b);
break;
default:
System.out.println("invalid");
}
}}

