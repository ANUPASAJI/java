//to display G.C.D of two numbers
import java.util.Scanner;
public class GCD
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int n,n1,n2,t=0;
System.out.println("Enter two differnt numbers");
n1=in.nextInt();
n2=in.nextInt();
while(n1%n2!=0)
{
t=n1&n2;
n1=n2;
n2=t;
}
System.out.println(" GCD of two numbers:"+n2);
}
}
