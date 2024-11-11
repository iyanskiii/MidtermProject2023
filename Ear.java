/**
I created an ear class that implements the DrawingObject interface.
The drawn object circle serves as the ear of my object Kirby.
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
public class Ear implements DrawingObject {
    private double x; 
    private double y;
    private double size;
    private Color color;
    
    public Ear(double x, double y, double size, Color color){
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;    
    }

    @Override
        public void draw(Graphics2D g2d) {
            
        Path2D.Double leftE = new Path2D.Double();
        leftE.moveTo(x+size*6.17,y+size*5.40);
        leftE.curveTo(x+size*5.2,y+size*4.6,x+size*4.4,y+size*9,x+size*6.18,y+size*7.35);
        g2d.setColor(new Color(253,200,84));
        g2d.fill(leftE);
        g2d.setColor(Color.BLACK);
        g2d.draw(leftE);

        Path2D.Double rightE = new Path2D.Double();
        rightE.moveTo(x+size*12.35,y+size*5.5);
        rightE.curveTo(x+size*14.4,y+size*4.6,x+size*14,y+size*9,x+size*12.8,y+size*7.36);
        g2d.setColor(new Color(253,200,84));
        g2d.fill(rightE);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightE);
    }
}