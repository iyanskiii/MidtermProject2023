/**
I created a cheeks class that implements the DrawingObject interface.
The drawn object circle serves as the cheek of my object Kirby.
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

import java.awt.*;
import java.awt.geom.*;

public class Cheeks implements DrawingObject {
    private double x; 
    private double y;
    private double size;
    private Color color;
    
    public Cheeks(double x, double y, double size, Color color){
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;    
    }
    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double lcheeks = new Ellipse2D.Double(x+size*.05,y-size*.10,size,size);
        Ellipse2D.Double rcheeks = new Ellipse2D.Double(x-size*.05,y,size,size);
        g2d.setColor(new Color(246,149,130));
        // g2d.fill(mata); 
        g2d.fill(lcheeks);
        g2d.fill(rcheeks);
        
    }

}
