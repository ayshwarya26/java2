import java.util.*; 
import java.io.*;
public class Demoo_read
{
  public static void main(String[] args)
  {
try
{
 List<String> s = new ArrayList<String>();
String aa="";
int b;
 File file = new File("E:\\madhu\\Std.txt");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
String st;
int count=0;
while ((st = br.readLine()) != null)
{
//System.out.println(st);
StringTokenizer t = new StringTokenizer(st);  
     while (t.hasMoreTokens()) {  
        s.add(t.nextToken());
}
}

//TO CHECK IF STUDENT AGE IS MORE THAN 21 ND COUNT THEM.
int i=0;
while(i<3)
{

aa=s.get((5*i)+4);
int l=Integer.parseInt(aa);
if(l>21)
//System.out.println(l);
count++;
i++;
}
System.out.println("No.of students with age more than 21 is"+ count);


//TO CHECK IF STUDENT NAME STARTS WITH 'A'
String f;
for(int j=0;j<3;j++)
{ f=s.get(5*j);
char c=f.charAt(0);
if(c=='a')
{
System.out.println("Displaying the name,id,city,country and age of the student");
int k=0;
while(k<4)
{
System.out.println(s.get((5*j)+k));
k++;
}}
}
}
catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}}

