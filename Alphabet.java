import java.util.Scanner;
class Alphabet
{public static void main(String[] args)
{
String a[]= new String[10];
int k=0;
String b;
char ch1,ch2;
System.out.println("Enter 10 names");
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
a[i]=sc.nextLine();
}
for(int i=0;i<10;i++)
{
for(int j=i+1;j<10;j++)
{
if(a[i].charAt(0)>a[j].charAt(0))
{b=a[i];
a[i]=a[j];
a[j]=b;
}

if(a[i].charAt(k)==a[j].charAt(k))
{
if(a[i].charAt(k+1)>a[j].charAt(k+1))
{b=a[i];
a[i]=a[j];
a[j]=b;

}}}}
for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}

}
}