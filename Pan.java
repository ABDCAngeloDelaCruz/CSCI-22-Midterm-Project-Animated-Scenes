/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw pans in the kitchen.
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

public class Pan implements DrawingObject{
    private Rectangle2D.Double rect1;
    private Rectangle2D.Double rect2;

    /**Instantiates two rectangles to create the shape of the pan */
    public Pan(double x, double y, double width, double height){
        rect1 = new Rectangle2D.Double(x,y,width,height);
        rect2 = new Rectangle2D.Double(x-width/2,y+height/6,width/2,height/6);
    }

    /**Draws the pan in the kitchen */
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fill(rect1);
        g2d.fill(rect2);
    }
    
}
