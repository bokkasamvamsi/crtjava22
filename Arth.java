import java.util.*;
class Arth
{
public static void main(String arge[])
{
Scanner s=new Scanner(System.in);
int a,b,r;
System.out.println("Enter two numbers");
a=s.nextInt();
b=s.nextInt();
System.out.println("1.Addition\n2.Subtraction\n3.Multiplacation\n4.Division");
System.out.println("Enter your choice");
int ch=s.nextInt();
switch(ch)
{
case 1:
	r=a+b;
	System.out.println("Sum="+r);
	break;
case 2:
	r=a-b;
	System.out.println("Sub="+r);
	break;
case 3:
	r=a*b;
	System.out.println("Mul="+r);
	break;
case 4:
	r=a/b;
	System.out.println("Div="+r);
	break;
default:
	System.out.println("invalid choice");
}
}
}
