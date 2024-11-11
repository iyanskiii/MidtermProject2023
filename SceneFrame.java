/**
This is a class on where I constructed my animation.
@author Ian Roque J. Ferol (222612)
@version March 9, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class SceneFrame extends JPanel {  
    private int width;
    private int height;
    private JFrame frame;
    private SceneCanvas scenecanvas;
    private Timer time;
    private StarUpnDown movement;

    public SceneFrame(int w, int h){
        width =w;
        height = h;
        frame= new JFrame();
        scenecanvas = new SceneCanvas(1024,768);
        movement = new StarUpnDown();
        time = new Timer(25,movement);
        time.start();
    }
    private class StarUpnDown implements ActionListener{ //class that implement action listener.//inner class

        @Override
        public void actionPerformed(ActionEvent ae){
            scenecanvas.getStar1().upnDown();   //calling the methods in scenecanvas and returning the same methods of star.
            scenecanvas.getStar2().upnDown();   //method chaining
            scenecanvas.getStar3().upnDown();
            scenecanvas.getKirbyFace().leftNRight();
            scenecanvas.repaint();
            // scenecanvas.repaint();     //updating all the screen so that the stars would appear.
        }
    }   
    public void setUpGUI(){
        Container cp = frame.getContentPane();
        frame.setTitle("Midterm Project - Ferol, Ian Roque - 222612");
        cp.add(scenecanvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    }
    //Source: Waleed Lugod helped me on importing javax.swing.Timer and constructing Inner Class StarUpnDown.
