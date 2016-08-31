import java.util.*;
class charno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer();
String str="";
int i,j;
//int p=0,nmbr=0;
for(i=0;i<s.length();i++)
{
if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
{
str=str+s.charAt(i);
}
else if(s.charAt(i)>=48 && s.charAt(i)<=57)
{
int  p=0;
int nmbr=0;
for(j=i;j<s.length();j++)
{
if(s.charAt(j)>=48 && s.charAt(j)<=57)
{
nmbr*=10;
p=s.charAt(j)-48;
nmbr+=p;
}
else
{
i=j-1;
for(j=0;j<nmbr;j++)
{
sb.append(str);
}
str="";
break;
}
}
//System.out.println(nmbr);
for(j=0;j<nmbr;j++)
{
sb.append(str);
}
}
}
String output=new String(sb);
System.out.println(output);
}
}