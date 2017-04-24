//Daniel Vorster
//VRSDAN004
//23 April 2017
//SearchAVL Class

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
 * SearchAVL is the main application in this package. It searches for all matches in querydata and tesdata, and returns the result.
 * @author DanielVorster
 */
public class SearchAVL
{
    
    /**
     * 
     * @param args The argument here dictates the number of repetitions.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
                AVLTree<Entry> tree = new AVLTree<Entry>();
        Instant start = Instant.now();        
        if(args.length < 1){
            System.out.println("Please add arguments: number of reps.");
        
            System.exit(0);
        }
        
        for (int i = 0; i < Integer.parseInt(args[0]); i++)
        {
            
        
      
        
        BufferedReader td = new BufferedReader(new FileReader ("testdata"));
        BufferedReader qd = new BufferedReader(new FileReader ("querydata"));
        
        //Populate testData list with testdata file.
        String temp = td.readLine();
        while (temp != null){
            //Add data
             
            tree.insert(new Entry(temp));
            temp = td.readLine(); 
        }
        
        //Search through tree
        temp = qd.readLine();
        Entry result = null;
        
        while (temp != null){
            Entry tempEnt = new Entry();
            tempEnt.setName(temp);
            
            BinaryTreeNode<Entry> tmp = tree.find(tempEnt);
            
            if (tmp == null) 
            {
                System.out.println("Not found");  
            }
            else {
                System.out.println(tmp.data.getName() + " || " + tmp.data.getNumber() + " || " + tmp.data.getAddress());
            }
            temp = qd.readLine();  
        }
    }
        
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken over reps: "+ timeElapsed.toMillis()/Integer.parseInt(args[0]) +" milliseconds");
        System.out.println("Total time: " + timeElapsed.toMillis() + " milliseconds");
    }
    
}
