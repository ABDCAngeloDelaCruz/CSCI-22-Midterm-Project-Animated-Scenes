/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the countertop in the Kitchen.
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

public class Countertop implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color1, color2;
    private Rectangle2D.Double rect1, rect2;

    /**Assigns the position, width, height, and colors of the countertop */
    public Countertop(double x, double y, double width, double height, Color color1, Color color2){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color1 = color1;
        this.color2 = color2;
    }

    /**Draws the countertop of the Kitchen */
    @Override
    public void draw(Graphics2D g2d) {
        rect1 = new Rectangle2D.Double(x,y,width,height);
        rect2 = new Rectangle2D.Double(x,y-height*.2,width,height*.2);

        g2d.setColor(color1);
        g2d.fill(rect1);
        g2d.setColor(color2);
        g2d.fill(rect2);
    }
    
}
