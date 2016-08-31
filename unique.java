import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;
int a[]=new int[n];
for(i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
 int tmp=0;
 for(j=0;j<n;j++)
 {
   if(i!=j)
   {
   if(a[i]==a[j])
   {
     break;
   }
   }
 }
 if(j==n)
 {
  System.out.println(a[i]);
  break;
 }
}
}
}