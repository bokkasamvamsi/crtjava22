import java.util.*;
class Reverse
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
r=r*10+d;
}
System.out.println(r);
}
}