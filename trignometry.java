// A sample program on trignometry
import java.io.*;
public class Trignometry
{
public static void main(String args[])throws IOException
{
int a,b;
double m,n,p;
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
System.out.println("Enter the first value greater than the second");
System.out.println("Enter the first angle");
a=Integer.parseInt(in.readLine());
System.out.println("Enter the second angle");
b=Integer.parseInt(in.readLine());
m=(22.0/(7.0*180))*a;
n=(22.0/(7.0*180))*b;
p=(Math.tan(m)-Math.tan(n))/(1+(Math.tan(m)*Math.tan(n)));
System.out.println("The value of expression is="+p);
}
}
