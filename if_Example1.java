import java.util.Scanner;
public class if_Example1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(j==0)
{
System.out.println("division by zero error");
}
else
{
System.out.println(i+"division by "+j+"is:"+(i/j));
}
}
}
