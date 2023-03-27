import java.util.Scanner;
class day4Program2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num/2*2==num)System.out.println("EVEN");
if(num/2*2!=num)System.out.println("ODD");
}
}