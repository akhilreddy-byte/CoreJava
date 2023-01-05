
class Student 
{
    String name = "Akhil";
}

class CollegeStudent extends Student 
{
    String className = "Reddy";
}

class McaStudent extends CollegeStudent
{
    String semester = "Mogulla";
    public void showDetail()
    {
       System.out.println("Student name = " + name);
       System.out.println("Student class name = " + className);
       System.out.println("Student semester = " + semester);
    }
}

public class Inheritance 
{
    public static void main(String args[])
    {   
          McaStudent obj = new McaStudent(); 
          obj.showDetail();
    }
}