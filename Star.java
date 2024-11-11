/**
I created a Star class as one of my composite shapes that implements the DrawingObject interface.
It consists of a basic shape pentagon and triangle.
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

public class Star implements DrawingObject  {
    private double x; 
    private double y;
    private double yvelocity;
    private double size;
    private double yorigin;
    private Color color;

    public Star(double x, double y, double size, Color color){
        this.x =x;
        this.y = y;
        this.size = size;
        this.color = color;
        yvelocity = 1;
        yorigin = y;
    }
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double p1 = new Path2D.Double();  //creating pentagon
        p1.moveTo(x,y);
        p1.lineTo(x+size*.66,y);
        p1.lineTo(x+size*.65,y+size*.5);
        p1.lineTo(x+size*.24,y+size*.77);
        p1.lineTo(x+size*.26,y+size*.8);
        p1.lineTo(x-size*.07,y+size*.5);
        p1.closePath();
        g2d.setColor(new Color(253,210,46));
        g2d.fill(p1);

        //creating triangles
        Path2D.Double p2 = new Path2D.Double();  //creating triangles
        p2.moveTo(x+size*.02,y+size*.5);
        p2.lineTo(x-size*.53,y+size*.08);
        p2.lineTo(x-size*.01,y+size*.02);
        p2.closePath();
        g2d.fill(p2);

        Path2D.Double p3 = new Path2D.Double();
        p3.moveTo(x+size*.01,y+size*.02);
        p3.lineTo(x+size*.26,y-size*.5);
        p3.lineTo(x+size*.54,y);
        p3.closePath();
        g2d.fill(p3);

        Path2D.Double p4 = new Path2D.Double();
        p4.moveTo(x+size*.52,y-size*0.02);
        p4.lineTo(x+size*1.06,y+size*0.05);
        p4.lineTo(x+size*.61,y+size*.46);
        p4.closePath();
        g2d.fill(p4);

        Path2D.Double p5 = new Path2D.Double();
        p5.moveTo(x+size*.65,y+size*.48);
        p5.lineTo(x+size*.94,y+size);
        p5.lineTo(x+size*.21,y+size*.75);
        p5.closePath();
        g2d.fill(p5);

        Path2D.Double p6 = new Path2D.Double();
        p6.moveTo(x-size*.14,y+size*.35);
        p6.lineTo(x-size*.29,y+size);
        p6.lineTo(x+size*.28,y+size*.75);
        p6.closePath();
        g2d.fill(p6); 
    }
    public void upnDown(){
        if (y>= yorigin+50 || y<= yorigin-5){
            yvelocity = -yvelocity;
        }
        y+= yvelocity;
    }
}