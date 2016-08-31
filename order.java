import java.util.*;
class order
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int i;
String str[]=s.split(" ");
StringBuffer sb=new StringBuffer();
for(i=(str.length-1);i>=0;i--)
sb.append(str[i]+" ");
String output=new String(sb);
output.trim();
System.out.println(output);
}
}