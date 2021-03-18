import java.util.List;


import java.util.ArrayList;

/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        AddressBook b = new AddressBook();
        
        // ask user what they want to do

        // ask for info if necessary

        Contact c1 = new Contact("Joe");


        // print single Contact
        // call get() from AddressBook
        System.out.println(c1);


        // print the entire AddressBook list

        System.out.println(b);
    }
}