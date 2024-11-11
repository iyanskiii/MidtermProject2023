/**
I created a Legs class that implements the DrawingObject interface.
The drawn object oval serves as the legs of my object Kirby.
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

public class Legs implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;

    public Legs(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double left_leg = new Path2D.Double();
        left_leg.moveTo(470,500);
        left_leg.curveTo(400,700,550,600,570,500);
        g2d.setColor(new Color(187,151,199));
        g2d.fill(left_leg);     
        g2d.setColor(Color.BLACK);
        g2d.draw(left_leg);
        
        Path2D.Double right_leg = new Path2D.Double();
        right_leg.moveTo(700,500);
        right_leg.curveTo(700,600,700,700,575,500);
        g2d.setColor(new Color(187,151,199));
        g2d.fill(right_leg);     
        g2d.setColor(Color.BLACK);
        g2d.draw(right_leg);
        
    }
}
