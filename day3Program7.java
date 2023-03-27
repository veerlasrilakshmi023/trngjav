import java.util.Scanner;
class day3Program7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int res=0;
if(num2==0)System.out.println("INVALID");
else
{        
System.out.println(num1+"/" +num2+" ="+res);
}
}
}