//Daniel Vorster
//VRSDAN004
//09 April 2017
//SearchIt Class


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * SearchIt searches for entries in a data file using a query file. It makes use of a Binary Search Tree.
 * @author DanielVorster
 */
public class SearchIt {
    static Tree<Entry> tree = new Tree<Entry>();
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
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
        
        //Search through tree
        temp = qd.readLine();
        Entry result = null;
        
        while (temp != null){
            result = tree.find(temp);
            if (result == null) 
            {
                System.out.println("Not found");  
            }
            else{
                System.out.println("" + result.getName() + " || " + result.getNumber() + " || " + result.getAddress());
            }
            temp = qd.readLine();  
        }
        
       
            
    }
    }
    
    
    
    
    
}
