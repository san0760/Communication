package netdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class rece implements Runnable
{

	public void run()
	{
		System.out.println("接收端状态：run。。。。。。。");
		DatagramSocket ds;
		try
		{
			ds = new DatagramSocket(10001);
			while(true)
			{
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String text=new String(dp.getData(), 0, dp.getLength());
				System.out.println(dp.getAddress()+":"+text);
				if(text.equals("over"))
					System.out.println(dp.getAddress()+"退出会话");
			}
		} catch (SocketException e)
		{
			
			e.printStackTrace();
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
		
	}

}
