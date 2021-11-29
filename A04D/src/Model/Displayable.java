/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Displayable.java
 * Dalton Ream 
 * Declare and intialize methods in order to use them for the interface
 */

    package Model;

public interface Displayable
{
  public int getFirstLineToDisplay(); 
  public int getLineToHighlight(); 
  public int getLastLineToDisplay(); 
  public int getLinesBeingDisplayed(); 

  public void setFirstLineToDisplay(int firstLine); 
  public void setLineToHighlight(int highlightedLine); 
  public void setLastLineToDisplay(int lastLine); 
  public void setLinesBeingDisplayed(int numberOfLines); 
}
    
