package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.InputMap;

public class ReadPage {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			URL url = new URL("https://github.com:443/CrkJohn");
			PrintWriter writer = new PrintWriter("resultado.html");
			URLConnection con = url.openConnection();
			BufferedReader readUrl = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = readUrl.readLine()) != null) {
                writer.println(inputLine);
           }
			
			writer.close();
		}catch(MalformedURLException e){
			System.out.println("URL ERRONEA");
		}
		
	}

}