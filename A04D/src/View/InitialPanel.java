/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@psu.edu
 *
 * IntialFrame.java
 * Dalton Ream + Professor Bartell
 * Instantiates initial panel and adds it to display 
 */
package View;


import java.awt.*;
import javax.swing.*;


public class InitialPanel extends JPanel { 
    private CenterPanel Cp;


    public InitialPanel()
    {
        super();
        setSize(2000, 1000);
        setVisible(true);
       setBackground(Color.darkGray);
        Cp = new CenterPanel();
        add(Cp, "Center");
           
}

    /**
     * @return cp the cp to set
     */
    public CenterPanel getCp()
    {
        return Cp;
    }

    /**
     * @param ip the cp to set
     */
    public void setCp(CenterPanel Cp)
    {
        this.Cp = Cp;
    }
    


}
