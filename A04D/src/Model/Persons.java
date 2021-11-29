/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Person.java
 * Dalton Ream 
 * Declare and intialize all atributes regarding persons
 */
package Model;


public class Persons {
    private String name; // Persons name as an String 
    private int weight; // Persons weight as an int 
    private Height height;// persons eight in the Height class
    private String hometown; // Persons hometown as a string 
    private String highschool;  // Persons player high school as a string
    
    
    public Persons (String firstName, int weightInPounds, Height height1, String hometownLIT, String highschoolLIT){
        name = firstName; // setting firstName = to name
        weight = weightInPounds; // setting weightInPounds = to weight 
        height = height1; //setting height1 = height
        hometown = hometownLIT; // setting homeTownLIT = to hometown 
        highschool = highschoolLIT; // setting highschoolLIT = to highschool
    }
     public Persons() {
        this("Walter" ,290, null, "N/A","N/A");// defualt constructor 
     
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    /**
     * @return the highschool
     */
    public String getHighschool() {
        return highschool;
    }

    /**
     * @param highschool the highschool to set
     */
    public void setHighSchool(String highschool) {
        this.highschool = highschool;
    }
    
    public Height getHeight() {
        
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }
    
        /**
     * @return the heightCalculations
     */
    public int getHeightCalculations() {
        
        int feetToInches= height.getFeet() * 12;
        int combinedInches = feetToInches + height.getInches();
        
        return combinedInches; 
    }
     // prints out all the information about a person 
    @Override
    public String toString(){
        
       return getName() + " who is from  " + getHometown() + " and went to " + getHighschool() 
             + " is "+ getHeight() + " and weighs " + getWeight();

    }
}
