/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com
 */
package Model;
/*
 * FootballPlayer.java
 * Dalton Ream + Professor Bartell
 * Declare and intialize all atributes regarding football players and which some atrributes extends persons 
 */

import java.util.ArrayList;

public class FootballPlayer extends Persons implements TableMember{
    
    private int number; // football player number as an int 
    private String position; // football player posotion as a string 
    //ArrayList footballNames = new ArrayList();

     

    public FootballPlayer(String firstName, Height height1, int weightInPounds, String hometownLIT, String highschoolLIT, int numberCurrent, String positionCurrent){// OffensiveLine positionCurrent
        
        
        // all of these are setting equal to parameters in the constructor 
        super(firstName, weightInPounds, height1, hometownLIT, highschoolLIT);// attributes assicated with teh persons class
        number = numberCurrent; // setting numberCurrent = to number 
        position = positionCurrent; //setting positionCurrent = to current 

    }
    
    public FootballPlayer() {
        this("N/A", null, 0, "N/A", "N/A", 0, "N/A");// defualt constructor 
    
    }
    
     
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    //prints all the information about football player extending from person 
    @Override
    public String toString(){
       return super.toString() + " , is number " + getNumber() + " and he is the " +  getPosition();
    }
    
   //prints out the attributes regarding football player
    @Override
    public String getAttribute(int n){
        return getAttributes().get(n);
    }
    //creates array in order to print out attributes
    @Override
    public  ArrayList<String> getAttributes(){
        ArrayList footballAttributes = new ArrayList(); //creates new arrayList 
        footballAttributes.add(getName()); // adds name to arrayList
        footballAttributes.add(String.valueOf(getHeight())); // adds height to arrayList
        footballAttributes.add(String.valueOf(getWeight())); //adds weight to arrayList
        footballAttributes.add(getHometown()); // adds hometown to arrayList
        footballAttributes.add(getHighschool()); // adds highschool to arrayList
        footballAttributes.add(String.valueOf(getNumber())); // adds number to arraylist
        footballAttributes.add(getPosition()); // adds position to arrayList
        return footballAttributes;
    }
    
    //prints out the attributes name regarding football player
    @Override
    public String getAttributeName(int n){
        return getAttributeNames().get(n);
    }
    
    //creates array in order to print out attributes name
    @Override
    public ArrayList<String> getAttributeNames(){
          ArrayList footballNames = new ArrayList();// creastes new arrayList 
        footballNames.add("Name");
        footballNames.add("Height");
        footballNames.add("Weight");
        footballNames.add("Hometown");
        footballNames.add("HighSchool");
        footballNames.add("Number");
        footballNames.add("Position");
        return footballNames;
    }
}
