/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * TableData.java
 * Dalton Ream 
 * Declare and intialize methods in order to use them for the interface
 */

package Model;
import java.util.ArrayList;

public interface TableData
{

    public void loadTable(); // calls method to print out table

    public ArrayList getTable(); // calls method to print persons ArrayList

    public ArrayList<String> getHeaders(); // calls method to print out headers

    public ArrayList<String> getLine(int line); // calls method to print out selected line 

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine); // calls method to print out selected lines

}
