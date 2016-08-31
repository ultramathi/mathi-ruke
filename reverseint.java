import java.util.*;
class reverseint
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int d=n,sum=0,k=0;
while(d!=0)
{
sum=sum*10;
k=d%10;
sum=sum+k;
d=d/10;
}
System.out.println(sum);
}
}