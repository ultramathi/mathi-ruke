import java.util.*;
class firstrepeat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,j,k=0,tmp=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
tmp=a[i];
k=9;
break;
}
}
if(k==9)
break;
}
System.out.println(tmp);
}
}