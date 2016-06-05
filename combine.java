package netdemo;

public class combine
{

	public static void main(String[] args)
	{
		new Thread(new send()).start();
		new Thread(new rece()).start();
	}
}
