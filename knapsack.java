import java.util.*;
class knapsack
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of values:");
    int n=sc.nextInt();
    int sum,coin=0,i;
    int[] v=new int[n];
    for(i=0;i<n;i++)
      v[i]=sc.nextInt();
    System.out.println("sum:");
    sum=sc.nextInt();
    Arrays.sort(v);
   for(i=n-1;(i>=0) && (sum!=0);i--)
   {
     while(sum!=0)
     {
        if(sum>=v[i])
        {
          sum=sum-v[i];
          coin++;
        }
        else
        {
          break;
        }
     }
   }
   System.out.println(coin);
   }
}