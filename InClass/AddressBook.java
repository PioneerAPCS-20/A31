import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class AddressBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddressBook
{
    private List<Contact> book;
    
    /**
     * Constructs AddressBook object (initializes List as an ArrayList)
     */
    public AddressBook()
    {
        
    }
    
    /**
     * 
     * @param c
     * 
     * Add Contact c into this AddressBook (alphabetically)
     */
    public void add(Contact c)
    {        
        // {B, F, K, P, T} add M
        // M is after B
        // M is after F
        // M is after K 
        // M is before P, so add(3, P)
        // {B, F, K, M, P, T}

        // Use compareTo to compare Strings alphabetically
        
        
        // loop i=0 i<book.size()
           // use compareTo
           // add if it comes before Contact at i
           // return
        
        // if nothing was added, add it to the end.
    }
    
    /**
     * 
     * @param fn
     * @param ln
     * 
     * Removes Contact with given first and last name. Prints error message if Contact does not exist.
     */
    public void remove(String fn, String ln)
    {
    	// use getIndex to get the index where the Contact with the given
        // first and last names is in the List.
    }
    
    /**
     * 
     * @param fn
     * @param ln
     * @return Contact with given first and last name. Returns null if not found.
     */
    public Contact get(String fn, String ln)
    {
    	// very similar to remove
    }
    
    /**
     * 
     * @param fn
     * @param ln
     * @return index of Contact with given first and last name. Returns -1 if not found.
     * 
     * Uses binary search.
     */
    public int getIndex(String fn, String ln)
    {
    	int lo = 0;
        int hi = book.size() - 1;
        while (lo <= hi) 
        {
            int mid = lo + (hi - lo) / 2;
            if(ln.compareTo(book.get(mid).getLastName()) < 0) 
            {
                hi = mid - 1;
            }
            
            else if(ln.compareTo(book.get(mid).getLastName()) > 0)
            {
                lo = mid + 1;
            }
            
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    /**
     * Prints all Contacts in this AddressBook.
     */
    public void printList()
    {
    	
    }
    
    @Override
    public String toString()
    {
        String s = "Number of contacts: " + book.size() + "\n";
        
        for(Contact c: book)
        {
            s += c;
            s += "\n";
        }
        
        return s;
    }
}
