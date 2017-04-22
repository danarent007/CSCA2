
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M315T3R
 */
public class SearchAVL
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
                AVLTree<Entry> tree = new AVLTree<Entry>();
                
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
            
            if (tmp == null && args[0].equals("1")) 
            {
                System.out.println("Not found");  
            }
            else if(args[0].equals("1")){
                System.out.println(tmp.data.getName() + " || " + tmp.data.getNumber() + " || " + tmp.data.getAddress());
            }
            temp = qd.readLine();  
        }
    }
    }
    
}
