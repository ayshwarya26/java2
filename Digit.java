import java.util.Scanner;
class Digit
{
public static void main(String[] args)
{
int a,c,s,w=0;
int h=0;
System.out.println("Enter any number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
s=a;
while(s!=0)
{s=s/10;
w++;
}
int b[]=new int[w];
int i=0,k=0,j=1,l=1,d=0;
while((a!=0) && (i<w))
{
c=a%10;
h=h*10+c;
b[i]=c;
a=a/10;
i++;
}
while(d<w)
{
l=l*10;
d++;
}
while(j<l)
{ 
System.out.println(j+"'s place digit :   "+b[k]);
k++;
j=j*10;
}
System.out.println("The reverse of input no is: "+h);
j=1;
k=w-1;
while(j<l)
{ 
System.out.println(j+"'s place digit :   "+b[k]);
k--;
j=j*10;
}


}}