//A sample food project on restaurant management system
import java.util.*;
public class Reverse_management
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int vstr,tvstr=0,nvstr=0,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,totalamt=0,d,totald=0,damt=0,ch;
double vat=0;
String str="",ans,choice="Y";
System.out.println("Welcome to Multi Cuisine Restaurant!!!!!!!!!!!!!!!!");
System.out.println("Press 1 for Starter");
System.out.println("Press 2 for Main Course");
System.out.println("Press 3 for Cool with Deserts");
System.out.println();
System.out.println("Enter your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Welcome to Starter Menu!!!!!!!");
System.out.println("Enter 'VS' for veg starter and 'NVS' for non veg starter");
str=in.next();
if(str.equalsIgnoreCase("VS"))
{
System.out.println("STARTERS\t\t\tPRICE IN RS.");
System.out.println("1.Paneer tikka\t\t\t110");
System.out.println("2.Veg kebabt\t\t\t110");
System.out.println("3.Hara bhara kebabt\t\t\t110");
System.out.println("4.Spring roll\t\t\t150");
System.out.println("5.American corn ball\t\t\t150");
System.out.println("6.Cripsy american ball\t\t\t140");
System.out.println("7.Cripsy baby corn\t\t\t140");
System.out.println("8.Cripsy mushroom\t\t\t120");
System.out.println("9.Crispy chilly potato\t\t\t120");
System.out.println("10.Crispy chilly chana\t\t\t150");
System.out.println();
while(choice.equalsIgnoreCase("Y"));
{
System.out.println("Choose your starter from above list by entering number");
vstr=in.nextInt();
System.out.println("Enter total no of starters you need");
tvstr=in.nextInt();
if(vstr>=1&&vstr<=3)
amt=tvstr*110;
if(vstr==4||vstr==5)
amt=tvstr*150;
if (vstr==6||vstr==7)
amt=tvstr*140;
if (vstr==8||vstr==9)
amt=tvstr*120;
if (vstr==10)
amt=tvstr*150;
tamt=tamt+amt;
System.out.println("Do you want to place moreorder?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NVS"))
{
System.out.println("Non vegetarian Starter:");
System.out.println();
System.out.println("NON VEG STARTERS\t\t\tPRICE IN RS");
System.out.println("1.Chicken tikka\t\t\t170");
System.out.println("2.Murg kebab\t\t\t170");
System.out.println("3.Murg chilli kebab\t\t\t160");
System.out.println("4.Chicken kebab\t\t\t180");
System.out.println("5.Tangdi kebab\t\t\t180");
System.out.println("6.Murg tandoori\t\t\t190");
System.out.println("7.Fish tikka\t\t\t190");
System.out.println("8.Chilli chicken\t\t\t160");
System.out.println("9.Drums of heaven\t\t\t180");
System.out.println("10.Sanghai chicken\t\t\t180");
while(choice.equalsIgnoreCase("Y"));
{
System.out.println("Choose your starter by entering number");
nvstr=in.nextInt();
System.out.println("Enter total no of starters you need");
tnvstr=in.nextInt();
if(nvstr==1||nvstr==2)
amt=tnvstr*170;
if(nvstr==3)
amt=tnvstr*160;
if(nvstr==4||nvstr==5)
amt=tnvstr*180;
if(nvstr==6||nvstr==7)
amt=tnvstr*190;
if(nvstr==8)
amt=tnvstr*160;
if(nvstr==9||nvstr==10)
amt=tnvstr*180;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
System.out.println("**************Multi cuisine restaurant********************");
System.out.println("******************Bill*********************");
System.out.println("Total cost:Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("14.5%");
System.out.println("Total vat=Rs."+vat);
System.out.println("AMOUNT TO BE PAID"=Rs.+(tamt+vat));
System.out.println();
break;
case 2:
System.out.println("Main Course:Indian and Chinese Dishes");
System.out.println("Enter 'V' for Indian veg dishes,'NV' for Indian non veg dishes and 'c' for chinese dishes");
str=in.next();
if(str.equalsIgnoreCase("V"))
{
System.out.println("Welcome to indian veg dishes");
System.out.println("Indian Veg Dishes\t\t\tPrice in Rs");
System.out.println("1.shahi paneer\t\t\t 180");
System.out.println("2.Navratan korma\t\t\t180");
System.out.println("3.Kadahi Paneer\t\t\t150");
System.out.println("4.Malai Kofta\t\t\t140");
System.out.println("5.Kadahi vegetable\t\t\t140");
System.out.println("6.vegetable pakeesa\t\t\t140");
System.out.println("7.Shabnam curry\t\t\t150");
System.out.println("8.Makai corn palak\t\t\t150");
System.out.println("9.veg pulao\t\t\t110");
System.out.println("10.Kashmiri pulao\t\t\t140");
System.out.println("11.Butter naan\t\t\t40");
System.out.println("12.Stuffed kulcha\t\t\t60");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your main veg course by entering the no");
vfd=in.nextInt();
System.out.println("How many plates do you want to place from above list?");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
amt=tvfd*180;
if(vfd==3)
amt=tvfd*150;
if(vfd==4||vfd==5||vfd==6||vfd==10)
amt=tvfd*140;
if(vfd==7||vfd==8)
amt=tvfd*150;
if(vfd==9)
amt=tvfd*110;
if(vfd==10)
amt=tvfd*140;
if(vfd==11)
amt=tvfd*40;
if(vfd==12)
amt=tvfd*60;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NV"));
{
System.out.println("Welcome to Indian non veg dishes");
System.out.println("Indian non veg dishes\t\t\tPrice in Rs");
System.out.println("1.Chicken tikka Masala\t\t\t180");
System.out.println("2.Chicken tikka Labadar\t\t\t180");
System.out.println("3.Chicken barta\t\t\t150");
System.out.println("4.Kadahi chicken\t\t\t160");
System.out.println("5.Muglai chicken\t\t\t160");
System.out.println("6.Murg navratan korma\t\t\t160");
System.out.println("7.Mutton rogan josh\t\t\t170");
System.out.println("8.Prawn malai curry\t\t\t170");
System.out.println("9.Fish sarsowala\t\t\t190");
System.out.println("10.Fish daniawala\t\t\t190");
System.out.println("11.chicken do myasa\t\t\t140");
System.out.println("12.Murg masallam\t\t\t160");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Main Non veg Course by entering the number");
vfd=in.nextInt();
System.out.println("How many plates do you want to place from above list");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
amt=tvfd*180;
if(vfd==3)
amt=tvfd*150;
if(vfd==4||vfd==5||vfd==6)
amt=tvfd*160;
if(vfd==7||vfd==8)
amt=tvfd*170;
if(vfd==9||vfd==10)
amt=tvfd*190;
if(vfd==11)
amt=tvfd*140;
if(vfd==12)
amt=tvfd*160;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("C"));
{
System.out.println("Welcome to chinese dishes");
System.out.println("Chinese Dishes\t\t\tPrice in Rs");
System.out.println("1.Scezwan fried rice\t\t\t240");
System.out.println("2.Scezwan chicken\t\t\t280");
System.out.println("3.Chilly chicken\t\t\t280");
System.out.println("4.Chicken noodles\t\t\t210");
System.out.println("5.Veg hakka noodles\t\t\t190");
System.out.println("6.Chicken manchurian\t\t\t190");
System.out.println("7.Paneer manchurian\t\t\t190");
System.out.println("8.Chilly paneer\t\t\t240");
System.out.println("9.Sanghai fried rice\t\t\t240");
System.out.println("10.Chicken Fried Rice\t\t\t210");
System.out.println("11.kimchi rice veg\t\t\t210");
System.out.println("12.Veg fried rice\t\t\t210");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your main course by entering the number");
fd=in.nextInt();
Sysem.out.println("How many plates do you want");
tfd=in.nextInt();
if(fd==1||fd==8||fd==9)
amt=tfd*240;
if(fd==2||fd==3)
amt=tfd*280;
if(fd==4||fd==10||fd==11||fd==12)
amt=tfd*210;
if(fd==5||fd==6||fd==7)
amt=tfd*190;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
System.out.println();
System.out.println("*********Multi cuisine restaurant********");
System.out.println("**********Bill*******);
System.out.println("Total cost:Rs."+totalamt);
vat=Math.round(14.5/100.0*totalamt);
System.out.println("VAT=14%");
System.out.println("total vat=Rs."+amt);
System.out.println("Amount to be paid:Rs."+(totalamt+vat));
System.out.println();
break;
case 3:
System.out.println("Cool with Deserts");
System.out.println("Deserts\t\t\tPrice in Rs");
System.out.println();
System.out.println("1.Softy pineapple\t\t\t110");
System.out.println("2.Crunchy chocolate\t\t\t110");
System.out.println("3.Walnut brownie\t\t\t90");
System.out.println("4.chocolate dougnut\t\t\t90");
System.out.println("5.Marble cake\t\t\t70");
System.out.println("6.Mocha magic\t\t\t90");
System.out.println("7.Black Forest\t\t\t90");
System.out.println("8.Mango shake\t\t\t80");
System.out.println("9.Pineapple shake\t\t\t80");
System.out.println("10.Tooty fruity\t\t\t120");
while(choice.equalsIgnoreCase("Y"));
{
System.out.println("Choose your desert by entering no");
d=in.nextInt();
System.out.println("Enter total no of items you need to buy");
totald=in.nextInt();
if(d==1||d==2)
damt=totald*110;
if(d==3||d==4||d==6||d==7)
damt=totald*90;
if(d==5)
damt=totald*70;
if(d==8||d==9)
damt=totald*80;
if(d==10)
damt=totald*120;
totalamt=totalamt+damt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
System.out.println();
System.out.println("*******Multi cuisine restaurant*********");
System.out.println("*******Bill*********");
System.out.println("Total cost=Rs."+totalamt);
vat=Math.round(14.5/100.0*totalamt);
System.out.println("Vat=14.5%");
System.out.println("Total vat=Rs."+vat));
break;
default:
System.out.println("You have entered wrong choice");
System.out.println("To exit multi cuisine restaurant world,enter the word 'quit'");
ans=in.next();
if(ans.equals("quit")||ans.equals("QUIT")||ans.equals("Quit"))
{
System.out.println("THANKS FOR COMING");
System.out.println("YOUR PLEASURE OUR COMFORT");
System.out.println("VISIT AGAIN");
System.out.println();
}
}
}



















































































































