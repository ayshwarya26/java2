package abc;
class Checks extends Exception
{
int q;
Checks(String msg,int sal)
{
q=sal;
System.out.println(msg+sal);
}
public String toString()
{
return("exception in salary"+q);
}}
class Checka extends Exception
{
int q1;
Checka(String msg,int age)
{
q1=age;
System.out.println(msg+"  "+age);
}
public String toString()
{
return("exception in age"+q1);
}}
class Checkavg extends Exception
{
int q2;
Checka(String msg,int avg)
{
q2=avg;
System.out.println(msg+"  "+avg);
}
public String toString()
{
return("exception in avg"+q2);
}}
class Employeee
{
public static void main(String args[])
{
double a=0;
int m1[]=new int[10];
int m3[]=new int[10];
String s[]=new String[10]
System.out.println("enter employee details");
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
for(int i=0;i<10;i++)
{System.out.println("Name:  "):
sc1=s[i].nextLine();
System.out.println("Age:  "):
sc2=m1[i].nextLine();
System.out.println("Salary:  "):
sc3=m3[i].nextLine();
}
for(int i=0;i<10;i++)
{
a=a+m3[i];
}
a=a/10;
try
{
for(int i=0;i<10;i++)
{if(m3[i]==0
{
throw new Checks("Exception: Salary cant be zero",m3[i]);
}
if(m2[i]<21)
{throw new Checka("exception : Age must be more than 21",m2[i]);
}
if(a<100000)
{ 
throw new Checkavg("Exception: Avg is low!!",a);
}
}}
catch(Checks c)
{
System.out.println(c);
}
catch(Checka b)
{
System.out.println(b);
}
catch(Checkavg u)
{
System.out.println(u);
}
}}
 

 