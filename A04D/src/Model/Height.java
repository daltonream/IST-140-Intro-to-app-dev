/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Height.java
 * Dalton Ream
 * Declare calculate and display the heights of the football players
 */
package Model;


public class Height{ 
    private int feet; // feet of football player 
    private int inches;// inches of football player 

    public Height (int feet1, int inches1) { // constructor 
        
        feet = feet1; // set feet1 to feet
        inches = inches1; // set inches1 to inches 
        
    }
    public Height(){ // empty constructor 
    
       this(0,0);
      
    }
    
    /** 
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
     // prints out proper height notation ex) 6'2" 
    @Override
    public String toString(){
        
        return getFeet() + "'" + getInches() + "\"";
    }

}

