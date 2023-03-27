import java.util.Scanner;
class day4Program4
{
//method definition
public static void  fun1 (int a , int b){

int res =a+b;
System.out.println(res);
}//fun1
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
fun1(num1,num2);//function/method call
}
}