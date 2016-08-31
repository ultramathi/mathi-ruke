import java.util.*;
class reversal
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  StringBuffer s1=new StringBuffer(s);
  s1.reverse();
  String result=s1.toString();
  System.out.println(result);
}
}