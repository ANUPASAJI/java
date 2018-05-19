//to display pattern as per user's choice
import java.util.Scanner;
public class Pattern
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int i,j,p,k;
char ch;
String st;
System.out.println("Enter a token as word for pattern  printing");
st=in.next();
p=st.length();
System.out.println("Enter your choice:");
k=in.nextInt();
switch(k)
{
case 1:
System.out.println("Pattern:");
for(i=0;i<p;i++)
{
for(j=0;j<=p;j++)
{
ch=st.charAt(j);
System.out.print(ch);
}
System.out.println();
break;
case 2:
System.out,println("Pattern:");
for(i=p;i>=1;i--)
{
for(j=0;j<i;j++)
{
ch=st.charAt(j);
System.out.print(ch);
}
System.out.println();
break;
default:
System.out.println("Wrong choice!!!!!!!!");
}
}
}
