/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@psu.edu
 *
 * IntialFrame.java
 * Dalton Ream + Professor Bartell
 * Instantiates center panel and adds it to display 
 */
package View;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class CenterPanel extends JPanel
{
  
    private ArrayList<JButton> footballPlayer = new ArrayList<>();
    private ArrayList<JButton> headerButton = new ArrayList<>();
    
    public CenterPanel()
    {
        super();
        
        setBackground(Color.blue);
      
    }

    
public void createDisplay(int columns, int rows){              // this takes in width for grid
                                                                // and also the height to create grid
                                      
                                 
                
        int gridColumns = columns + 1;                         //added one to include header in grid   
            
           
            GridLayout panel = new GridLayout(gridColumns,rows,3,3); 
            for (int i = 0; i<rows; i++){
                JButton headerButtons = new JButton();
                getHeaderButton().add(headerButtons);
                add(headerButtons);
            }
            
            for(int k=0; k<columns*rows; k++){               // the amount of footbal buttons will be rows*columns 
                JButton footballButtons = new JButton();            
                getFootballPlayer().add(footballButtons);
                
                add(footballButtons);
       }
            
          setLayout(panel);       
}

public void buttonInfo(ArrayList<ArrayList<String>> footballPlayers, ArrayList<String>  headers){   
                                                        // this passes the attributeNames arrayList and the footballPlayer arrayList 
                                                        //inside it will loop through and derive info accordinly 

                                                        
         
       int j = 0; 
        
       for(int k = 0; k<footballPlayers.size(); k++){ 

            for(int i =0; i < headers.size(); i++){
               
              
                getHeaderButton().get(i).setBackground(Color.gray); 
                getHeaderButton().get(i).setText(headers.get(i));
                getHeaderButton().get(i).setPreferredSize(new Dimension(250, 35));
              
              
                getFootballPlayer().get(j).setBackground(Color.white); //setting color to white for fun
                getFootballPlayer().get(j).setText(footballPlayers.get(k).get(i));
                getFootballPlayer().get(j).setPreferredSize(new Dimension(250, 35));
               j++;                                 // instead of having a seperate loop, i made another variable
                                                    // that will be able to go though the footballPlayer arraylist
                                                    // without getting a out of bounds error. 
             
           } 
       }
   }

    /**
     * @return the footballPlayer
     */
    public ArrayList<JButton> getFootballPlayer() {
        return footballPlayer;
    }

    /**
     * @param footballPlayer the footballPlayer to set
     */
    public void setFootballPlayer(ArrayList<JButton> footballPlayer) {
        this.footballPlayer = footballPlayer;
    }

    /**
     * @return the headerButton
     */
    public ArrayList<JButton> getHeaderButton() {
        return headerButton;
    }

    /**
     * @param headerButton the headerButton to set
     */
    public void setHeaderButton(ArrayList<JButton> headerButton) {
        this.headerButton = headerButton;
    }
    

}  
