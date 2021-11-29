/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com
 */
package Model;
/*
 * FootballPlayerData.java
 * Dalton Ream
 * derives all elements from the XML and returns selected records
 */
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData, Displayable
{ 
    
    
    private ArrayList<FootballPlayer> players; // creates a Football Player ArrayList 
    private int firstLineNum, lastLineNum, linesBeingDisplayed, lineToHigh;

    public FootballPlayerData()
    {
        
        players = new ArrayList<>();
        loadTable(); // calls loadTable to dervie information from XML named "FootballPlayerTable.xml"
       
    }
    
    public void ReadPlayersFromXML()
    { 
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp); // if value is not null out inside players ArrayList

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    System.out.println("end of file");
                    break; // if there are no more elements break out of try - catch and inform user 
                }
            }
            decoder.close();
        } catch (Exception xx) {xx.printStackTrace();}
    }
    
    
     @Override
     public void loadTable(){ // calls ReadPlayersFromXML
        ReadPlayersFromXML();        
     }
     
     @Override
     public  ArrayList<String> getHeaders(){ // returns getAttributes from FootballPlayer
         FootballPlayer header = new FootballPlayer();
    return  header.getAttributeNames();
    }

     @Override
    public ArrayList getTable(){ // return the players arrayList
    return players;
  }
    
    @Override
    public ArrayList<String> getLine(int line){
         return players.get(line).getAttributes(); // returns the selected record from user 
        
    }
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine){ // returns the selected records from the user 
       ArrayList <ArrayList<String>> footballPlayers = new ArrayList<>();
       if (firstLine<lastLine){  // enter if the firstLine is less the the lastLine
        for (int i = firstLine; i <= lastLine; i++) { 
            
            footballPlayers.add(getLine(i));
            }
        }
       else {
       footballPlayers.add(getLine(firstLine));
       System.out.println("ERROR: First line can not be greater than second line"); // informs user that the firstLine has to be less than the lastLine
       }
        
       
       
       return footballPlayers;
    }
    
       /**
     * @return the firsLineNum
     */
       @Override
  public int getFirstLineToDisplay() {
      
      return firstLineNum;
     }
  
  
       @Override
  public void setFirstLineToDisplay(int firstLine) { //sets the correct first line to display without going out of bounds
      
      int maxArray = getTable().size();
      int minArray = 0;
      
      if(firstLine >  maxArray){
          
      this.firstLineNum = maxArray -getLinesBeingDisplayed();
      
      }
      
      else if (firstLine<minArray){
          
      this.firstLineNum = minArray;
      
      }
      
      else if(firstLine> 104 && firstLine<124){
      
      this.firstLineNum = maxArray - getLinesBeingDisplayed();
          
      }
      
      else{
      
      this.firstLineNum = firstLine;
          
      }
  }
  
     @Override
  public int getLastLineToDisplay() { //gets the correct last line to display
      
           
      int maxArray = getTable().size();
      int minArray = 0;
      
      if(getFirstLineToDisplay()==minArray){
      
      setLastLineToDisplay(getLinesBeingDisplayed()-1);
          
      }
      
      else{
      
      setLastLineToDisplay(getLinesBeingDisplayed() + getFirstLineToDisplay()-1);//something else happens here
      
      }
      
      
      if(maxArray < lastLineNum || maxArray==lastLineNum){
          
          System.out.println("Out of Bounds");
          
      return lastLineNum; // i had lastLineNum instead of firstLineNum
      
      }
      
      else{
          
      return lastLineNum;
      
      }
  //(Model.lines.size() - 1); 
 
  }
  
    
     @Override
  public void setLastLineToDisplay(int lastLine){ //sets the last line to display
      
      this.lastLineNum = lastLine;
  }
  
  
     /**
     * @return linesBeingDisplayed
     */
    @Override
  public int getLinesBeingDisplayed(){

  return linesBeingDisplayed;//Model.lines.size(); //
  }
  
    
  @Override
  public void setLinesBeingDisplayed(int numberOfLines) { //sets the number of lines to be displayed
      
      if (numberOfLines<= 0 ){
      
      this.linesBeingDisplayed = 10; //if user enters 0 This will be a defualt
      
      }else if(numberOfLines> getTable().size()){
      this.linesBeingDisplayed = getTable().size(); // user enters a number greater than the table size
      this.firstLineNum = 0;                         // it will return all the football players
                                                     // then have to set first line to 0 so 
                                                     // no other error is thrown
      }
      
      else{
 
      this.linesBeingDisplayed = numberOfLines;   
      }
  }
  
       /**
     * @return lineToHigh
     */
    @Override
  public int getLineToHighlight(){
      
  return lineToHigh;
  
  }
  
  
     @Override
  public void setLineToHighlight(int highlightedLine) { //sets the line to HighLight
      
      this.lineToHigh = highlightedLine;
      
  }

  

}
