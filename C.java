class A{
public void funA1(){
System.out.println("funA1 method of classA called");
}//funA1()
}//A
class B{
public void funB1(){
System.out.println("funB1 method of classB called");
}//funB1()
}//B
class C{
public static void main(String args[]){
A obA=new A();
obA.funA1();
B obB=new B();
obB.funB1();
}
}