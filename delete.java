import java.util.*;
class delete
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
long k=sc.nextLong();
long sum=n;
long a=0;
ArrayList ls=new ArrayList();
while(sum!=0)
{
a=sum%10;
ls.add(a);
sum=sum/10;
}
Collections.sort(ls);
Iterator it=ls.iterator();
long count=0;
long ans=0;
long k1=ls.size()-k;
while(it.hasNext())
{
if(count<k1)
{
ans=ans*10;
long b=(long)it.next();
ans=ans+b;
count++;
}
else
break;
}
System.out.println(ans);
}
}