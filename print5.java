import java.util.Scanner;
public class print5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int product=1;
for(int i=1;i<=num;i++)
{
product=product*i;
}
System.out.print(product);
}
}