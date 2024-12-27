/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This draws the line for whichever class uses it.
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
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private float thickness;
    private Color color;

    /**Assigns the initial values for the parameters of the line */
    public Line(double x1, double y1, double x2, double y2, float thickness, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.thickness = thickness;
        this.color = color;
    }

    /**Draws the line, colors it, and gives the appropriate thickness */
    @Override
    public void draw(Graphics2D g2d) {
        Line2D.Double line = new Line2D.Double(x1,y1,x2,y2);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(line);
    }
}
