import java.util.Scanner;
public class print3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int num=sc.nextInt();
while(i<=num)
{
System.out.print(i);
if(i<num)
System.out.print(",");
i=i+1;
}
}
}