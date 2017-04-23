//Daniel Vorster
//VRSDAN004
//09 April 2017
//Entry datatype class

/**
 * Entry object to hold name, address and telephone number of an entry.
 * @author DanielVorster
 */
public class Entry implements Comparable{
    private String name;
    private String address;
    private String number;

    public Entry(){
        
    }
    
    /**
     * Creates Entry object from unformatted String
     * @param data Unformatted String from text input file
     * 
     */
    public Entry(String data){
        String[] tmp = data.split("\\|");
        this.address = tmp[0];
        this.name = tmp[2];
        this.number = tmp[1];
    }
    /**
     * Create a new Entry
     * @param name Takes the name value for the object and uses it as the key.
     * @param address Takes the address value for the object.
     * @param number Takes the cell/phone number for the object.
     */
    public Entry(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    
    /**
     * Get the name stored in the Entry.
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    

    /**
     * Get the address stored in the Entry.
     * @return Returns the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get the cell/phone number stored in the Entry.
     * @return Returns the cell/phone number.
     */
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name;
    }
    
   


    @Override
    public int compareTo(Object o) {
        return(this.name.compareTo(o.toString()));
    }
    
    
    
 
    
}

