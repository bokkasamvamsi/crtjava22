import java.util.*;
class Loop3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r=1,n;
System.out.println("Enter n value");
n=s.nextInt();
while(n>=1)
{
r=r*n;
n=n-1;
}
System.out.println(r);
}
}