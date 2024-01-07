import java.util.*;
class Loop4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,r=0,d;
System.out.println("Enter n value");
n=s.nextInt();
while(n>0)
{
d=n%10;
n=n/10;
r=r+d;
}
System.out.println(r);
}
}