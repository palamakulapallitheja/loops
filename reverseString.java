import java.util.Scanner;
public class reverseString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n;
String rev="";
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rev=rev+n.charAt(i);
}
System.out.print(rev);
}
}