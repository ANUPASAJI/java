//Calculator
import java.io.*;
public class Menu
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,s,c,m,n;
double d;
System.out.println("Enter the numbers");
a=in.nextInt();
b=in.nextInt();
System.out.println("Enter 1.Addition 2.Subtraction 3.Multiplication 4.Division");
System.out.println("Enter your choice");
n=in.nextInt();
switch(n)
{
case 1:
s=a+b;
System.out.print("The sum of two numbers="+s);
break;
case 2:
c=a-b;
System.out.print("The difference of two numbers="+c);
break;
case 3:
m=a*b;
System.out.print("The product of two numbers are="+m);
break;
case 4:
d=a/b;
System.out.print("The quotient is="+d);
break;
default:
System.out.print("Invalid Choice");
break;
}
}
}
