import java.util.Scanner;
class Day2Program09
{public static void main(String  args[])
{Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int num1=sc.nextInt();//20
int num2=sc.nextInt();//10
int i=0;
while(i<5)
{
System.out.println("1:Addition");
System.out.println("2:Substraction");
System.out.println("3:Multiplication");
System.out.println("4:Division");
System.out.println("5:Modulus Division");
int choice=sc.nextInt();
i=i+1;
switch(choice)
{
case 1:{System.out.println(num1+"+"+num2+"="+(num1+num2));break;}
case 2:{System.out.println(num1+"-"+num2+"="+(num1-num2));break;}
case 3:{System.out.println(num1+"*"+num2+"="+(num1*num2));break;}
case 4:{System.out.println(num1+"/"+num2+"="+(num1/num2));break;}
case 5:{System.out.println(num1+"%"+num2+"="+(num1%num2));break;}
}
}
}
}















