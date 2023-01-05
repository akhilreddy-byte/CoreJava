public class Constructor
{
    int num;
    boolean isStudent;
    String str;
    Constructor(boolean boolean1)
    {
    System.out.println("One argument constructor called.");
       isStudent = boolean1;
    }               
    Constructor(int n, String s)
    {
     System.out.println("Two argument constructor called.");
     num = n;
     str = s;
    }    
    Constructor(boolean boolean1, int n, String s)
    {
      System.out.println("Three argument constructor called.");
      isStudent = boolean1;
      num = n;
      str = s;
     }
    public static void main(String args[])
    {
    	Constructor obj1 = new Constructor(true);
    	System.out.println("isStudent = " + obj1.isStudent);
    	System.out.println("num = " + obj1.num);
    	System.out.println("str = " + obj1.str); 

      
    	Constructor obj2 = new Constructor(10, "point");
    	System.out.println("isStudent = " + obj2.isStudent);
    	System.out.println("num = " + obj2.num);
    	System.out.println("str = " + obj2.str);

       
       Constructor obj3 = new Constructor(false, 20, "point");
       	System.out.println("isStudent = " + obj3.isStudent);
       	System.out.println("num = " + obj3.num);
       	System.out.println("str = " + obj3.str);
     }
}
