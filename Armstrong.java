import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,r=0,d,x;
System.out.println("Enter n value");
n=s.nextInt();
x=n;
while(n>0)
{
d=n%10;
n=n/10;-
r=r+d*d*d;
}
if(r==x)
{
System.out.println("Armstrong no");
}
else
{
System.out.println("Not an Armstrong no");
}
}
}
