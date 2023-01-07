@FunctionalInterface
interface Abc
{
	void show();
}
public class LambdaExpression {

	public static void main(String[] args) 
	{
		Abc obj = () -> System.out.println("Im Akhil");
		obj.show();

	}

}
