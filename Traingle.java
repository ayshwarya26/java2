Class Triangle
{
public static void main(String args[])
{
int i,j;
int k=0;
for(i=0;i<3;i++)
{
for(j=0;j<3-i;j++)
{
System.out.print("  ");
}
while(k!=2*i-1)
{System.out.print("* ");
}
System.out.println();
}}}
