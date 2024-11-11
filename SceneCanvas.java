/**
I created a class SceneCanvas that extends JComponent.
This is where I drew all of the elements of my animated scene.
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
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {  //where you will draw the outwork

    private int width;  
    private int height; 
    private Star s1;  
    private Star s2;
    private Star s3;
    private Line linya;
    private Line linya2;
    private Line linya3;
    private Face kirby;
    private Line linyaBorder;
    private Square sq1;
    private Square sq2;
    private Square sq3;
    private Square sq4;
    private Square sq5;
    private Square sq6;
    private Square sq7;


    private ArrayList<DrawingObject> drawingObjects;
    // ArrayList<DrawingObject> kirbyList;
    public SceneCanvas(int w, int h){  //constructor
         width = w;
         height = h;
         setPreferredSize(new Dimension(1024,768));
         s1 = new Star(200,100,70,new Color(253,210,46)); //2nd star
         s2 = new Star(100,190,60,new Color(253,210,46));  //1st star
         s3 = new Star(320,150,80,new Color(253,210,46));  //3rd star
         kirby = new Face(400,200,350,new Color(248, 185,170));
         linya = new Line(116,0,10,(Color.WHITE));
         linya2 = new Line(218,0,4,(Color.WHITE));
         linya3 = new Line(341,0,6.5,(Color.WHITE));
         linyaBorder = new Line(5,5,40,(Color.BLACK));
         sq1 = new Square(0,617,150,(new Color(205,99,41)));
         sq2 = new Square(150,617,150,(new Color (205,99,41)));
         sq3 = new Square(300,617,150,(new Color(205,99,41)));
         sq4 = new Square(450,617,150,(new Color(205,99,41)));
         sq5 = new Square(600,617,150,(new Color(205,99,41)));
         sq6 = new Square(750,617,150,(new Color(205,99,41)));
         sq7 = new Square(850,617,150,(new Color(205,99,41)));

         drawingObjects = new ArrayList<DrawingObject>();  
         drawingObjects.add(new Rectangle (0,0,1024,768,new Color(12,129,162)));
         drawingObjects.add(s1);
         drawingObjects.add(s2);
         drawingObjects.add(s3);
         drawingObjects.add(kirby);
    }
    @Override
    protected void paintComponent(Graphics g){  //overriding the extended paintcomponent//where you will draw color
        Graphics2D g2d = (Graphics2D) g;  
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        g2d.setRenderingHints(rh);

        for (int i = 0; i<drawingObjects.size(); i++){
            drawingObjects.get(i).draw(g2d);
        }
        sq1.draw(g2d);
        sq2.draw(g2d);
        sq3.draw(g2d);
        sq4.draw(g2d);
        sq5.draw(g2d);
        sq6.draw(g2d);
        sq7.draw(g2d);
        linya.draw(g2d);
        linya2.draw(g2d);
        linya3.draw(g2d);  
    }
    public Star getStar1(){
        return s1;
    }
    public Star getStar2(){
        return s2;
    }
    public Star getStar3(){
        return s3;
    }
    public Face getKirbyFace(){
        return kirby;
    }
}
//Source: Bryan Francisco helped me on constructing arraylist. 