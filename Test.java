import java.util.Scanner;
class Number{
public int addition(int a,int b)
public int multiplication(int a,int b)
public int subtract(int a,int b)
public int division(int a,int b)
int c=a+b;
int c=a*b;
int c=a-b;
intc=a/b;
int c=a%b;
return c;
}//
}//Number
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int num1=sc.nextInt();
int num2=sc.nextInt();
Number ob=new Number();
int res=0;
res=ob.addition(num1,num2);
res=ob.multiplication(num1,num2);
res=ob.subtrate(num1,num2);
res=ob.division(num1,num2);
res=ob.moduies(num1,num2);
System.out.println(num1+"+"+num2+"-"+);
}
}
