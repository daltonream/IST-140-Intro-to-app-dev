/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * TableManager.java
 * Dalton Ream 
 * Declare and intialize methods in order to use them for the interface
 */
package Model;

import java.util.ArrayList;

public interface TableMember
{

    public String  getAttribute(int n); // calls method to print out football player attributes

    public ArrayList<String> getAttributes(); // calls method that created array list of football player attributes 

    public String getAttributeName(int n); // calls method to print out football player attributes name

    public ArrayList<String> getAttributeNames();// calls method that created array list of football player attributes name
}
