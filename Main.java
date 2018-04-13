/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use_facebook4j;
import facebook4j.*;
import facebook4j.auth.AccessToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SNEHAL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FacebookException, IOException {
        // TODO code application logic here
        
        File file = new File("D:/projectnew.txt");
        if(!file.exists())
            file.createNewFile();
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
       Facebook fb = new FacebookFactory().getInstance();
       fb.setOAuthAppId("", "");
       //String tk = "CAACEdEose0cBAEoDNKKewS8vDdnSsq5xwzbSeXKFgdYrBKeMnlhwLwDRbySNwSBC5BFJAjJqgsCdFsDtvTL7mFPuI8W4MeEhT0Vw2Lpx4Eq4MUrWGhQuACxnZBDyZBXU5I2ty0LIPGaPWfHG47vAGephpSgzMNvZAlQDhKD6u3bjod07SIiZBVsiMUNLyyyfnpPTDqVQnwZDZD" ;
       String tk = "950008355091625|z-s3PCV-f2nxKqW0BAgNNRW9G-Q";
       AccessToken at = new AccessToken(tk);
       fb.setOAuthAccessToken(at);
       String[] s =  {"ndtv","TimesofIndia","bbcindia","hindustantimes","thehindu","cnnibn","cnbc","ZeeNews","TIMESNOW","DDNewsLive","IndiaToday","ForbesIndia"};
      //String[] s = {"ndtv"};
       ResponseList<Post> feeds;
       
    for(int i=0;i<s.length;i++)
    {    
        
      feeds = fb.getFeed(s[i]);
      System.out.println(s[i]+":"+feeds.size());
       for(int j=0;j<feeds.size();j++)
       {
          
             Post p = feeds.get(j);
           String msg = p.getMessage();
          // System.out.println(msg);
           bw.append(msg);
           
         
       }
    }
       bw.close();
       /* System.out.println("New without http");
   FileReader fr = new FileReader("D:/projectnew.txt");
   BufferedReader br = new BufferedReader(fr);
   FileWriter fw1 = new FileWriter("D:/final.txt");
   BufferedWriter bw1 = new BufferedWriter(fw);
   while(br.readLine()!=null)
   {
       String t = br.readLine();
       System.out.println(t);
       if(t.contains("http"))
       {
           String[] temp = t.split("http");
           t=temp[0];
       }
       System.out.println(t);
       bw1.write(t);
   }*/
    }
    
}
