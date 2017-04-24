//Daniel Vorster
//VRSDAN004
//23 April 2017
//InsertAVL Class - insertions only.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * InsertAVL is a program made specifically for input speed testing.
 * @author DanielVorster
 */
public class InsertAVL
{
    /**
     * 
     * @param args This applications accepts a single argument in the form of a numeric String. It dictates the repetitions.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Instant start = Instant.now();
        AVLTree<Entry> tree = new AVLTree<Entry>();
        int ins = 0;
                
        if(args.length < 1){
            System.out.println("Please add arguments: number of reps.");
        
            System.exit(0);
        }
        
        for (int i = 0; i < Integer.parseInt(args[0]); i++)
        {
            
        
      
        BufferedReader td = new BufferedReader(new FileReader ("querydata"));
        
        //Populate testData list with testdata file.
        
       
        String temp = td.readLine();
        
        while (temp != null){
            //Add data
             
            tree.insert(new Entry(temp));
            ins++;
            temp = td.readLine(); 
        }
        
    }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken over reps: "+ timeElapsed.toMillis()/Integer.parseInt(args[0]) +" milliseconds");
        System.out.println("Time per operaton: "+ (timeElapsed.toNanos()/Integer.parseInt(args[0]))/ins +" nanoseconds");
        System.out.println("Total time: " + timeElapsed.toMillis() + " milliseconds");
    }
    
}
