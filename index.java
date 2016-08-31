import java.util.*;
class index
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]==i)
System.out.println(i);
}
}
}