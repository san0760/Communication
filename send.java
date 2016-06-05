package netdemo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class send implements Runnable
{

	public void run()
	{
	
			System.out.println("·¢ËÍ¶Ë×´Ì¬£ºrun¡£¡£¡£¡£¡£¡£¡£");
			DatagramSocket ds;
			try
			{
				ds = new DatagramSocket();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String line=null;
				while((line=br.readLine())!=null)
				{
					byte[] buf=line.getBytes();
					DatagramPacket dp=new DatagramPacket(buf, buf.length, InetAddress.getByName("255.255.255.255"),10001);
					ds.send(dp);
					if("over".equals(line))
						break;
				}
			
			} catch (SocketException e)
			{
				
				e.printStackTrace();
			}
			catch (UnknownHostException e)
			{
				
				e.printStackTrace();
			} catch (IOException e)
			{
				
				e.printStackTrace();
			}
		
		
	}

}
