package netdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class sockerserver
{

	public static void main(String[] args) throws IOException
	{
		ServerSocket ss=new ServerSocket(10003);
		Socket s=ss.accept();
		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
//		PrintStream ps=new PrintStream(s.getOutputStream(),true);
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String st=null;
		while((st=bufr.readLine())!=null)
		{
			String a=st.toUpperCase();
//			ps.print(a+"\r\n");
			bufw.write(a+"\r\n");
			bufw.flush();
			System.out.println(s.getInetAddress()+st);
		
			
		}
	}

}
