import java.util.Scanner;
class A{
public int findLargest(int a,int b,int c){
int max=0;
if(a>b&&a>c)max=a;
if(b>a&&b>c)max=b;
if(c>a&&c>b)max=c;
return max;
}
}
class TestProgram5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
A ob=new A();
int res=ob.findLargest(n1,n2,n3);
System.out.println(res);
}
}