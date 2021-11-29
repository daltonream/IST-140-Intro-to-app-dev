/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@psu.edu
 *
 * IntialFrame.java
 * Dalton Ream + Professor Bartell
 * Instantiates initial Frame and adds it to display 
 */

package View;


import javax.swing.*;

public class IntialFrame extends JFrame 
{

    private InitialPanel ip;


    public IntialFrame()
    {
        super("A04D");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(2000, 1000);
        setVisible(true);
        
        
        
    }
    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }

    /**
     * @return the ip
     */
    public InitialPanel getIp()
    {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }
    

    
}
