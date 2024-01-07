import java.util.*;
class Primeno3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,n;
n=s.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
break;
}
System.out.print(i);
if(i==n)
System.out.print("prime no");
else
System.out.print("not a prime no");
}
}
