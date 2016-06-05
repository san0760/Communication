package netdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class rece1 
{
	public static void main(String[] args)
	{
		System.out.println("rece1.....run");
		DatagramSocket ds;
		try
		{
			ds=new DatagramSocket(10002);
			byte[] buf=new byte[1024*1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			BufferedOutputStream buos=new BufferedOutputStream(new FileOutputStream("1.txt"));
			buos.write(dp.getData());
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}
}
