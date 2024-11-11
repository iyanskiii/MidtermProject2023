/**
I created a Mouth class that implements the DrawingObject interface.
The drawn object circle serves as the mouth of my object Kirby.
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

public class Mouth implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;

    public Mouth(double x, double y, double size, Color Color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double mouth = new Path2D.Double();
        mouth.moveTo(x,y);
        mouth.curveTo(x+size*.125,y+size*1.5,x+size*.879,y+size*2,x+size*1.5,y);
        g2d.setColor(Color.WHITE); 
        g2d.fill(mouth);       

    }
}

