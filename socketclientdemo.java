package netdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class socketclientdemo
{

	public static void main(String[] args) throws IOException, IOException
	{
		Socket s=new Socket("127.0.0.1",10003);
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
//		PrintStream ps=new PrintStream(s.getOutputStream(),true);
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=buf.readLine())!=null)
		{
//			ps.print(line+"\r\n");
			bufw.write(line+"\r\n");
			bufw.flush();
			String st=bufr.readLine();
			System.out.println(st);
			
		}
	
		
		
		
		
	}

}
