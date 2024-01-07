import java.util.*;
class Vowles
{
public static void main(String arge[])
{
Scanner s=new Scanner(System.in);
char ch;
ch=s.next().charAt(0);
switch(ch)
{
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':
System.out.println("Vowels");
break;
default:
System.out.println("Consonant");
}
}
}