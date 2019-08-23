package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader{

    
    public static void main(String[] args) throws  Exception {
        URL url = new URL("https://github.com:443/CrkJohn/ECIGMA");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); 
        String inputLine = null;
        System.out.println("Protocolo : "+ url.getProtocol());
    	System.out.println("Authority : "+ url.getAuthority());
    	System.out.println("Host : "+ url.getHost());
    	System.out.println("Port : "+ url.getPort());        
        System.out.println("Path : "+ url.getPath());
    	System.out.println("Query : "+ url.getQuery());
    	System.out.println("File : "+ url.getFile());
        System.out.println("Reference : "+ url.getRef()); 

        /*try{
            while((inputLine= br.readLine().trim())!=null){
                System.out.println(inputLine);
            }
        }catch(IOException x){
            System.err.println(x);
        } 
        */   
    }







}