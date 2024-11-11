/**
I created a Rectangle class as one of my basic shapes that implements the DrawingObject.
This rectangle object serves as the frame of my contentPane.
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

public class Rectangle implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;

public Rectangle(double x, double y, double w, double h, Color Color){
    this.x = x;
    this.y = y;
    this.width = w;
    this.height = h;
    this.color = Color;
}
    public void draw(Graphics2D g2d){
    Rectangle2D.Double r = new Rectangle2D. Double(x,y,width,height);
    g2d.setColor(color);
    g2d.fill(r);
    }
}

