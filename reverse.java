import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x;
int rev=0;
while(n>0)
{
x=n%10;
n=n/10;
rev=rev*10+x;
}
System.out.print(rev);
}
}