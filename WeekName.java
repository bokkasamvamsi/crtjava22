import java.util.*;
class weekNames
{
public static void main(String arge[])
{
Scanner s=new Scanner(System.in);
int a;
a=s.nextInt();
switch(a)
{
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wensday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
default:
System.out.println("invalid");
break;
}
}
}