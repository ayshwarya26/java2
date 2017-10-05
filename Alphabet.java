import java.util.Scanner;
class Alphabet
{public static void main(String[] args)
{
String a[]= new String[10];
String v[]= new String[10];
String c[]= new String[10];
int q=0,r=0;
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
{if(a[i].charAt(0)=='a' || a[i].charAt(0)=='e' || a[i].charAt(0)=='i' || a[i].charAt(0)=='o' || a[i].charAt(0)=='u' )
{ v[q]=a[i];
q++;
}
else
{
c[r]=a[i];
r++;
}
}
System.out.println("THE VOWEL STRINGS IN THE LIST ARE");
for(int i=0;v[i]!=null;i++)
{
System.out.println(v[i]);
}
System.out.println("THE CONSONANT STRINGS IN THE LIST ARE");
for(int i=0;c[i]!=null;i++)
{
System.out.println(c[i]);
}



for(int i=0;i<10;i++)
{
for(int j=1;j<10;j++)
{
if(a[j-1].compareTo(a[j])>0)
{b=a[j-1];
a[j-1]=a[j];
a[j]=b;
}
}
}

System.out.println("THE SORTED LIST:");
for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}

}
}