import java.util.Scanner;
class Reversen
{
public static void main(String args[])
{
int a,r=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(a!=0)
{
r=r*10;
r=r+a%10;
a=a/10;
}
System.out.println(r);
}
}

