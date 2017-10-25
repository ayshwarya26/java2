import java.util.*; 
import java.io.*;
public class Customer_read
{
  public static void main(String[] args)
  {
try
{
 List<String> s = new ArrayList<String>();
String aa="";
String bb="";
int b;
 File file = new File("E:\\madhu\\Customer.txt");
 
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

//TO DISPLAY MALE AND FEMALE CUSTOMERS.
System.out.println("Displaying female customers");
for(int i=0;i<3;i++)
{
aa=s.get((10*i)+2);
if(aa.charAt(0)=='f')
{System.out.println(s.get(10*i));
}}
System.out.println("Displaying male customers");
for(int i=0;i<3;i++)
{
bb=s.get((10*i)+2);
if(bb.charAt(0)=='m')
{System.out.println(s.get(10*i));
}
}


//TO DISPLAY CUSTOMER DETAILS COUNTRY WISE
System.out.println("Total number of Customers country wise is");

Map<String,Integer> m = new HashMap<String,Integer>();

for(int i=0;i<3;i++)
{
String temp= s.get((10*i)+6);
if(m.containsKey(temp))
{
m.put(temp,m.get(temp)+1);
}
else
{
m.put(temp,1);
}
}

for(Map.Entry<String,Integer>entry:m.entrySet())
{
System.out.println(entry.getKey()+"\t\t"+entry.getValue());
}


//TO DISPLAY CUSTOMERS WHOSE AGE IS GREATER THAN 18
int age;
String agea;

for(int i=0;i<3;i++)
{agea=s.get((10*i)+3);
age=Integer.parseInt(agea);
if(age>18)
{System.out.println("Displaying customer details where age is greater than 18");
int k=0;
while(k<9) //9 is (columns-1)
{
System.out.println(s.get((10*i)+k));
k++;
}
}
}



//TO DISPLAY CUSTOMERS WITH NO PHONE NO

String pp;
for(int i=0;i<3;i++)
{pp=s.get((10*i)+8);
if(pp==null)
{System.out.println("Displaying customer Details with no phone number");
int x=0;
while(x<9) //9 is (columns-1)
{
System.out.println(s.get((10*i)+x));
x++;
}
}
}


}
catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}}

