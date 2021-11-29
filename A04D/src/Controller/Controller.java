/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Controller.java
 * Dalton Ream
 * passes the rows and colmns to create the grid to methods in CenterPanel
 * also passes the attribute ArrayList and attributeName Arraylist to populate the gird
 * Allows the user to scroll and also highlight the headers. 
 */

package Controller;

import Model.Model;
import View.View; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class Controller 
{
  Model model;
  View view;

public Controller(Model m, View v)
{
  model = m;
  view = v;
  view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size()); // first one returns the columns or number of FBPlayers
                                                                                                            // second returns the headers or the attribute names
  
                                                                                                            
  
  view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); // first returns the arraylist of footballPlayers
   addScrolling();                                                                                                                                                      // second returns the arraylist of Headers 

  
}

private void addScrolling()
{
    view.getIf().getIp().getCp().addMouseWheelListener(
            new MouseWheelListener()
       {    
            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                int units = e.getUnitsToScroll();
                

                    int currentPosition = model.getFpData().getLastLineToDisplay() + units;
                    int maxPosition  = model.getFpData().getTable().size(); 
                
                    
                                                                                            // If units is positive then goes into 
                                                                                            // first else then if less then incrememtns by 1
                                                                                            // else the user is trying to scroll back
                                                                                            // decreases by 1
                
                if(units > 0){                                                                                  
                                                                                                                
                    
                   if(currentPosition < maxPosition){
           
                        model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units);
                
                        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); 
                          
                       
                   }
                   else{
                       
                    model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay());

                    view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); 
                       
                   
                   
                   }
                }
                else{
                model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units); 
                
                view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); 
                       
                
                }
            
            }
            
    
    }
    );
    
    for(int i = 0; i< model.getFpData().getHeaders().size(); i++){
        int k = i;
        view.getIf().getIp().getCp().getHeaderButton().get(i).addActionListener(
        new ActionListener()
        {
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
            
            if (event.getSource() == view.getIf().getIp().getCp().getHeaderButton().get(k)){
            
                // this is going through and resetting the color of the Jbuttons and at the end
                // highlighting the one that is selected.
                view.getIf().getIp().getCp().getHeaderButton().get(0).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(1).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(2).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(3).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(4).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(5).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(6).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(k).setBackground(Color.yellow);
            }
            
            }
        
        
        
        }
        
        );
        
        
    }
}



}