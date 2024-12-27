/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the Refrigerator in the kitchen.
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

public class Refrigerator implements DrawingObject{
    private Rectangle2D.Double body;
    private Line line1, line2, line3, line4, line5, handle1, handle2;
    private Color color;

    /**Instantiates the shapes needed to create the Refrigerator. Similar to the Cabinet class. */
    public Refrigerator(double x, double y, double width, double height, Color color){
        this.color = color;
        body = new Rectangle2D.Double(x,y,width,height);
        line1 = new Line(x, y, x, y+height, 5, Color.BLACK);
        line2 = new Line(x+width, y, x+width, y+height, 5, Color.BLACK);
        line3 = new Line(x, y, x+width, y, 5, Color.BLACK);
        line4 = new Line(x, y+height, x+width, y+height, 5, Color.BLACK);
        line5 = new Line(x, y+height/3, x+width, y+height/3, 5, Color.BLACK);

        handle1 = new Line(x+width/6, y+height/3/3, x+width/6, y+height/3*2/3, 5, Color.GRAY);
        handle2 = new Line(x+width/6, y+height/2, x+width/6, y+height*3/4, 5, Color.GRAY);
    }

    /**Draws the Refrigerator object on the SceneCanvas*/
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(body);
        line1.draw(g2d);
        line2.draw(g2d);
        line3.draw(g2d);
        line4.draw(g2d);
        line5.draw(g2d);
        handle1.draw(g2d);
        handle2.draw(g2d);
    }


}
