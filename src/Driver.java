//Daniel Vorster
//VRSDAN004
//09 April 2017
//Driver class

import java.io.IOException;
import java.util.Scanner;



/**
 * Driver class provides a simple interface for running the programs.
 * @author DanielVorster
 * Driver class provides a simple interface for running the programs.
 */
public class Driver
{
    
    /**
     * Driver class provides a simple interface for running the 3 programs. Programs are run with a parameter, dictating the number of repetitions.
     */
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter option followed by space, then param:\n(1): SearchAVL\n(2): SearchIt\n(3): InsertAVL\n(4): InsertIt\n(5): QueryFileGenerator. Note: Param = no. file entries.");
        String[] ans = s.nextLine().split(" ");
        
        if(ans.length < 2){
            System.out.println("Please enter a param.");
            Driver.main(null);
            System.exit(0);
        }
        
        switch(ans[0]){
            case "1": 
                SearchAVL.main(new String[]{ans[1]});
                break;
            case "2":
                SearchIt.main(new String[]{ans[1]});
                break;
            case "3":
                InsertAVL.main(new String[]{ans[1]});
                break;
            case "4":
                InsertIt.main(new String[]{ans[1]});
                break;
            case "5":
                QueryFileGenerator.main(new String[]{ans[1]});
                break;
                       
            
            
        }
    }
}
