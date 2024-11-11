/**
I created a Face class as one of my composite shapes that implements the DrawingObject interface.
It consists of a basic shape oval and circle. 
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

public class Face implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    private Circle c1;
    private Cheeks lc;
    private Cheeks rc;
    private Ear l_ear;
    private Ear r_ear;
    private Oval l_eye;
    private Pupils l_pupil;
    private Pupils r_pupil;
    private Legs left_leg;
    private Legs right_leg;
    private Iris iris;
    private Iris iris2;
    private Mouth bibig;
    private double xvelocity;
    private double changeposition;

    public Face(double x, double y, double size, Color Color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        xvelocity = 3;
        changeposition =0;
        c1 = new Circle(400,200,350,new Color(248, 185,170));
        lc = new Cheeks(439,350,50, new Color(246,149,130)); 
        rc = new Cheeks(660,350,50, new Color(246,149,130));
        l_ear = new Ear(100,50,50,new Color(253,230,126));
        r_ear = new Ear(100,50,50,new Color(253,230,126));
        l_eye = new Oval(75,100,60,new Color(40,46,120));
        l_pupil = new Pupils(510,290,30,(Color.WHITE));
        r_pupil = new Pupils(610,290, 30, (Color.WHITE));
        left_leg = new Legs(470,500,60, new Color(187,151,199));
        iris = new Iris (510,340,40, new Color(97,180,217));
        iris2 = new Iris(610,340,40, new Color(97,180,217));
        bibig = new Mouth(545,400,40,(Color.WHITE));

    }
    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform(); //so that shape will rendered in a different position
        g2d.translate(changeposition, 0);
        l_ear.draw(g2d);
        r_ear.draw(g2d);
        left_leg.draw(g2d);
        c1.draw(g2d);
        l_eye.draw(g2d);
        l_pupil.draw(g2d);
        r_pupil.draw(g2d);
        iris.draw(g2d);
        iris2.draw(g2d);
        bibig.draw(g2d);
        lc.draw(g2d);
        rc.draw(g2d);
        g2d.setTransform(reset);
    }
    public void leftNRight(){
        if (changeposition >= +50 || changeposition <=-10){
            xvelocity = -xvelocity;
        }
        changeposition += xvelocity;
    }
}
