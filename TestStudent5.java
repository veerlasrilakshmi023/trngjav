class Student{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation(){System.out.println(rollno+" "+name);}
}
class TestStudent5{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(111,"Jittu");
s2.insertRecord(222,"Tharun");
s3.insertRecord(333,"Sunil");
s1.displayinformation();
s2.displayinformation();
s3.displayinformation();
}
}







