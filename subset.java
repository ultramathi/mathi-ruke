import java.util.*;
class subset
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int a1[]=new int[n1];
int i,j,k=0;
for(i=0;i<n1;i++)
{
a1[i]=sc.nextInt();
}
int n2=sc.nextInt();
int a2[]=new int[n2];
for(i=0;i<n2;i++)
{
a2[i]=sc.nextInt();
}
for(i=0;i<n1;i++)
{
k=0;
for(j=0;j<n2;j++)
{
if(a1[i]==a2[j])
{
k=2;
break;
}
}
if(k==2)
{
continue;
}
else
{
System.out.println("false");
break;
}
}
if(i==n1)
System.out.println("true");
}
}