//To check whether the number is prime or not
import java.io.*;
public class Prime
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,n,c=0;
System.out.println("Enter the number");
n=Integer.parseInt(in.readLine());
for(a=1;a<=n;a++)
{
if(n%a==0)
c=c+1;
}
if(c==2)
System.out.println("Prime");
else
System.out.println("Not prime");
}
}
