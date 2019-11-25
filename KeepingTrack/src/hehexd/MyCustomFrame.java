package hehexd;

/**
 * A code stub/template for a simple GUI
 * - This file describes the main window
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;


public class MyCustomFrame extends JFrame
{
    private JButton upbutton, downbutton;
    private JLabel countLabel, trendLabel;
    private JTextField countTextField, trendTextField;
    private JPanel panel;
    private JComponent component;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final int COMPONENT_WIDTH = 400;
    private static final int COMPONENT_HEIGHT = 400;
    
    // Constructor
    public MyCustomFrame()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createComponents()
    {
        // Create the GUI components
        
        // Create the buttons
        upbutton = new JButton("Up");
        downbutton = new JButton("Down");
        // Connect the listeners (event handlers) to the buttons
        upbutton.addActionListener(new upButtonListener());
        downbutton.addActionListener(new downButtonListener());
        
        // Create the label
        countLabel = new JLabel("Count: ");
        trendLabel = new JLabel("Trend");
        
        // Create text fields
        countTextField = new JTextField(10);
        trendTextField = new JTextField(10);
        
        // Create the component (which we will use draw things)
        component = new MyCustomComponent();
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        // Create the panel and add the GUI components to the panel
        panel = new JPanel();
        panel.add(countLabel);
        panel.add(countTextField);
        panel.add(trendLabel);
        
        panel.add(trendTextField);
        panel.add(upbutton);
        panel.add(downbutton);
        panel.add(component);
        //panel.setBackground(Color.RED);
        
        // Add the panel to the frame
        this.add(panel);
    }
    
    
    // Event handlers
    
    class upButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Clicked 1");
        }
    }
    
    class downButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Clicked 2");
        }
    }
    
}

