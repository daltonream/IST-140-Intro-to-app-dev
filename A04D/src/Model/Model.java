/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Model.java
 * Dalton Ream
 * takes in the number of lines to be displayed, and where to start
 */
package Model;


import java.util.ArrayList;

public class Model
{ 
    protected FootballPlayerData fpData = new FootballPlayerData(); // Instantiates FootballPlayer Data object
   
    public static ArrayList<ArrayList<String>> lines;

    public Model()
    { 

        fpData.setFirstLineToDisplay(0);
        fpData.setLinesBeingDisplayed(20); 
        
        
    }
    
public FootballPlayerData getFpData(){
return fpData;
}

}

