import java.io.*;
import java.util.*;
class Transaction_write
{
public static void main(String[] args)
{
try
{
 List<String> s = new ArrayList<String>();
BufferedWriter f=new BufferedWriter(new FileWriter("E:\\madhu\\Transaction.txt"));
String cid[]=new String[5];
String pid[]=new String[5];
int price[]=new int[5];
int quant[]=new int[5];
int tot[]=new int[5];
int dis[]=new int[5];
String date[]=new String[5];
String type[]=new String[5];

Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("enter Product Details");
System.out.println("enter ProdID");
pid[i]=sc.next();
System.out.println("enter Price");
price[i]=sc.nextInt();
System.out.println("enter Customer ID");
cid[i]=sc.next();
System.out.println("enter Quantity");
quant[i]=sc.nextInt();
System.out.println("enter date in format ddmmyyyy");
date[i]=sc.next();
System.out.println("enter totalprice");
tot[i]=sc.nextInt();
System.out.println("enter product type");
type[i]=sc.next();
System.out.println("enter Discount percentage out of 100");
dis[i]=sc.nextInt();
f.write(cid[i]+"\t"+pid[i]+"\t"+price[i]+"\t"+quant[i]+"\t"+tot[i]+"\t"+date[i]+"\t"+dis[i]+"\t"+type[i]);
f.newLine();
}
String st;


f.close();
}

catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}
}