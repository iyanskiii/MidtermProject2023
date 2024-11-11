/**
This is one of the required classes that implements the DrawingObject interface.
The line object serves as the stick of the star.
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

public class Line implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;
    private float thickness;

    public Line(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }
    @Override
    public void draw(Graphics2D g2d){
        Line2D.Double line = new Line2D.Double(x,y,x,y+size*16.8);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(line);

        Line2D.Double line2 = new Line2D.Double(x,y,x,y-size);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(line2);
        
        Line2D.Double line3 = new Line2D.Double(x,y,x,y+size*10.07);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(line3);

        Rectangle2D.Double r = new Rectangle2D.Double(10,10, 1000,750); //creating 2D Rectangle object. pwede mo i zero x at y, tas call mo width at height para maging solid color bg.    
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(new Color(252,204,168));
        g2d.setStroke(new BasicStroke(20));
        g2d.draw(r);
    }
}
