package netdemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class send1 
{
	public static void main(String[] args)
	{
		System.out.println("send1.....run");
		DatagramSocket ds;
		try
		{
			ds=new DatagramSocket();
			BufferedInputStream bufr=new BufferedInputStream(new FileInputStream("0.txt"));
			byte[] buf=new byte[1024*1024];
			int ch=0;
			while((ch=bufr.read(buf))!=-1)
			{
				DatagramPacket dp=new DatagramPacket(buf, ch, InetAddress.getByName("10.12.74.169"), 10002);
				ds.send(dp);
			}			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}
}
