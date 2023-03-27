class Student{
int id;
String name;
Student()//default constructor0
{
id=0;
name=null;
}
Student(int i)//constructor 1
{
id=i;
name=null;
}
Student(String s)//constructor 2
{
id=0;
name=s;
}
Student(int i,String s)//Parameterised constructor 3
{
id=i;
name=s;
}
void displayObject()
{
System.out.println("id"+id+" "+"Name:"+name);
}
}
class TestStudent9{
public static void main(String args[]){
Student s1=new Student();//default constructor 0
Student s2=new Student();//constructor 1
Student s3=new Student("Ram");
Student s4=new Student(10434,"Sita");
s1.displayObject();
s2.displayObject();
s3.displayObject();
s4.displayObject();
}
}







