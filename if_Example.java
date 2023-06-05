import java.util.Scanner;
public class if_Example
{
public static void main(String args[])
{
int min;
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(i<j)
{
System.out.println("minimum number is"+j);
}
else
{
System.out.println("minimum number is"+i);
}
}
}