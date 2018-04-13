/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7thsem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SNEHAL
 */
public class Project7thsem {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //Scanner sc=new Scanner(new FileReader("D://project.txt"));
        File f=new File("D:/project2.txt");
        if(!f.exists())
            f.createNewFile();
        FileWriter fr=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fr);
        //String[] sp;
        bw.write("niki");
        
        /*while(sc.hasNext())
        {
            String a=sc.nextLine();
            if(a.contains("http"))
            {
                System.out.println("yes");
                sp=a.split(" ");
                for(String s:sp)
                {
                    System.out.println(s);
                    if(!s.contains("http"))
                        bw.write(s);
                }
            }
            
        }*/
    }
}
