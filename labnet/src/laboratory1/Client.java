package laboratory1;

import java.util.Random;
import java.net.*;
import java.io.*;

public class Client {

  public static void main(String[] args)throws Exception{
    Socket socket=null;
    try {
        InetAddress server_address =InetAddress.getByName("localhost");
        socket = new Socket(server_address,1900);

        BufferedReader in =
        new BufferedReader(
          new InputStreamReader(
            socket.getInputStream()));
      
        PrintWriter out =
        new PrintWriter(
          new BufferedWriter(
            new OutputStreamWriter(
              socket.getOutputStream())),true);
        
//        BufferedReader reader = new BufferedReader(
//	            new InputStreamReader(System.in));
		
		//System.out.println("Numbers (divided by a space): ");
		//String output = reader.readLine();
		//out.println(output);
		String str = "";
		Random random = new Random();
        int nr1 = random.nextInt(99) + 1; 
        int nr2 = random.nextInt(99) + 1; 
        str = nr1 + " " + nr2;
        String str2 = in.readLine(); //trimite mesaj
		System.out.println(str+"%");
		//out.println("END");
    }
    catch (Exception ex){	
    	ex.printStackTrace();
    }
    finally{
      socket.close();
    }
  }
}

