class Student{
int id;
String name;
String course;
Student()//default constructor0
{
id=0;
name=null;
course=null;
}
Student(int i)//constructor 1
{
id=i;
name=null;
course=null;
}
Student(String s)//constructor 2
{
id=0;
name=s;
course=null;
}
Student(int i,String s)//Parameterised constructor 3
{
id=i;
name=s;
course=null;
}
Student(int i,String c)//Parameterised constructor 4
{
id=0;
name=null;
course=c;
}
Student(int i,String s,String c)//Parameterised constructor 5
{
id=i;
name=s;
cource=c;
}
void displayObject()
{
System.out.println("id:"+id+" "+"Name:"+name+"Course:"+course);
}
}
class TestStudent10{
public static void main(String args[]){
Student s1=new Student();//default constructor 0
Student s2=new Student(5);//constructor 1
Student s3=new Student("Ram");
Student s4=new Student(10434,"Sita");
Student s5=new Student("Srilu","ECE");
Student s6=new Student(10434,"Srilu","ECE");

s1.displayObject();
s2.displayObject();
s3.displayObject();
s4.displayObject();
s5.displayObject();
s6.displayObject();
}
}







