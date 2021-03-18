/**
 * Write a description of class Contact here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contact
{
    private String last, first, work, mobile, email;
    
    /**
     * 
     * @param first
     * 
     * Constructs a Contact object with a first name and sets all other fields to blank.
     */
    public Contact(String first)
    {
        this.first = first;
        last = "";
        work = "";
        mobile = "";
        email = "";

        // this(first, "", "", "", "");
    }
    
    /**
     * 
     * @param first
     * @param last
     * @param work
     * @param mobile
     * @param email
     * 
     * Constructs a Contact object with the given information.
     */
    public Contact(String first, String last, String work, String mobile, String email)
    {
        // this.last is the class variable
        // last is the local variable
        this.first = first;  
        this.last = last;
        this.work = work;
        this.mobile = mobile;
        this.email = email;
    }
    
    /**
     * 
     * @return last name of this Contact
     */
    public String getLastName()
    {
        return last;
    }
    
    /**
     * 
     * @return first name of this Contact
     */
    public String getFirstName()
    {
        return first;
    }
    
    /**
     *  
     * @param c 
     * @return Returns true if this Contact is the same as Contact c. Returns false otherwise.
     */
    public boolean equals(Contact c)
    {
        String f = first; // object that called method
        // String f = getFirstName();  // object that called method
        String f2 = c.getFirstName();  // name of object c

        return false;
    }
    
    @Override
    public String toString()
    {
        String s = "";
        s += "-------------------------\n";
        s += "| " + first + " " + last + "\t\t|\n";
        s += "| M: " + mobile + "\t\t|\n";
        s += "| W: " + work + "\t\t|\n";
        s += "| E: " + email + "\t|\n";
        s += "-------------------------\n";
        
        return s;
    }
}