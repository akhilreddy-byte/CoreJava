class He implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
class Hm implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args)
	{
		He obj1=new He();
		Hm obj2=new Hm();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e) {}
		t2.start(); 
	}

}
