import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
class Files
{public static void main(String[] args)
{try
{
String s[]=new String[5];

BufferedWriter f=new BufferedWriter(new FileWriter("E:\\madhu\\Filesvowel.txt"));
BufferedWriter d=new BufferedWriter(new FileWriter("E:\\madhu\\Filesconsonent.txt"));

System.out.println("Enter 5 names");
Scanner a=new Scanner(System.in);
for(int i=0;i<5;i++)
{s[i]=a.nextLine();
char[] ch=s[i].toCharArray();
if(ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u' || ch[0]=='A' || ch[0]=='E' || ch[0]=='I' || ch[0]=='O' || ch[0]=='U')
{
f.write(s[i]);
f.newLine();
}
else
{

d.write(s[i]);
d.newLine();
}
}

f.close();
d.close();

System.out.println("data s written successfully");
}
catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}

}