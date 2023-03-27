class Student{
int id;
String name;
Student()//default constructor
{
id=0;
name=null;
Student(int i,string s);//Parameterised constructor
id=i;
name=s;
}
}
class TestStudent8{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
System.out.println(s1,id);
System.out.println(s1,id);
System.out.println(s2,name);
System.out.println(s2,name);
}
}







