class Test
{
	static int num = 0;
	Test()
	{
		num = num + 10;
		System.out.println("Number = " + num);
	}
}
 
public class Static
{
	public static void main(String args[]){
		Test obj1 = new Test();
		Test obj2 = new Test();
		Test obj3 = new Test();
		Test obj4 = new Test();		
	}
}