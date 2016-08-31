import java.util.*;
class reversing
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  vowel v=new vowel();
  String str=sc.nextLine();
  System.out.println(v.vowelrem(str));
 }
}
class vowel
{
 public String vowelrem(String a)
 {
  StringBuffer str=new StringBuffer(a);
  System.out.println(str.reverse());
  int i,asci;
  for(i=0;i<str.length();i++)
  {
     asci=str.charAt(i);
    if(asci>=97 &&asci<=122)
      asci=asci-96;
    else if(asci>=65 && asci<=90)
      asci=asci-64;
    switch(asci)
    {
      case 1:str.delete(i,i+1);
             i--;
               break;
      case 5:str.delete(i,i+1);
             i--;
               break; 
      case 9:str.delete(i,i+1);
             i--;
               break;
      case 15:str.delete(i,i+1);
               i--;
               break;
      case 21:str.delete(i,i+1);
              i--;
               break;
    }
  }
  a=str.toString();
  return a;
 }
}