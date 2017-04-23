//Daniel Vorster
//VRSDAN004
//23 April 2017
//InsertIt Class


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;


/**
 * SearchIt searches for entries in a data file using a query file. It makes use of a Binary Search Tree.
 * @author DanielVorster
 */
public class InsertIt {
    static Tree<Entry> tree = new Tree<Entry>();
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Instant start = Instant.now();
        //Populate lists
        
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
            tree.addLeaf((Entry)new Entry(temp));
            temp = td.readLine();  
        }
        
             
            
    }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken over reps: "+ timeElapsed.toMillis()/Integer.parseInt(args[0]) +" milliseconds");
        System.out.println("Total time: " + timeElapsed.toMillis() + " milliseconds");
    }
    
    
    
    
    
}
