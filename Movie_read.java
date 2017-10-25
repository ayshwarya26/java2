import java.util.*; 
import java.io.*;
import java.lang.*;

public class Movie_read
{
  public static void main(String[] args)
  {
try
{
 List<String> s = new ArrayList<String>();
String aa="";
char ty;
int b;
 File file = new File("E:\\madhu\\Movie_Details.txt");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
String st;
int count=0;
while ((st = br.readLine()) != null)
{
System.out.println(st);
StringTokenizer t = new StringTokenizer(st);  
     while (t.hasMoreTokens()) {  
        s.add(t.nextToken());
}}

//TO DISPLAY MOVIES WITH TYPE U
int i=0;
while(i<3)
{

aa=s.get((7*i)+5);
//System.out.println(aa);

if(aa.charAt(0)=='u')
{
System.out.println("Displaying Movie details with rating u");
int k=0;
while(k<7)
{
System.out.println(s.get((7*i)+k));
k++;
}

}
i++;
}
//TO DISPLAY MOVIES WITH RATING GREATER THAN 4
String r;

for(int g=0;g<3;g++)
{
r=s.get((7*g)+6);
int q=Integer.parseInt(r);

if(q>4)
{

System.out.println("Displaying Movie details with rating greater than 4 ");
int z=0;
while(z<7)
{
System.out.println(s.get((7*g)+z));
z++;
}
}
}


//TO DISPLAY MOVIES IN YEAR 2015
String yy,dd;
for(int g=0;g<3;g++)
{dd=s.get((7*g)+4);
yy=dd.substring(4);
int c=Integer.parseInt(yy);
if(c==2015)
{
System.out.println("Displaying Movie details in year 2015 ");
int x=0;
while(x<7)
{
System.out.println(s.get((7*g)+x));
x++;
}
}
}

//TO DISPLAY MOVIES WITH ACTORS AS KHANS
String ac;
for(int g=0;g<3;g++)
{
ac=s.get((7*g)+3);
//System.out.println(ac);
if(ac.contains("khan"))
{
System.out.println("Displaying Movie details with actor names as khans ");
int xx=0;
while(xx<7)
{
System.out.println(s.get((7*g)+xx));
xx++;
}
}
}



}
catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}

}}

