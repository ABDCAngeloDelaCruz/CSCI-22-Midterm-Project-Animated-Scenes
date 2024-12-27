/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the star shape.
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
import java.awt.geom.*;;

public class Star implements DrawingObject {
    private double x;
    private double y;
    private Triangle tri1;
    private Triangle tri2;
    private Color color;
    private double sideLength;

    /**Initializes the values for the position of the star and its size (sideLength). 
     * Instantiates the triangles needed to create the star (Star of David).
     */
    public Star(double x, double y, double sideLength, Color color){
        this.x=x;
        this.y=y;
        this.sideLength=sideLength;
        this.color=color;
        tri1 = new Triangle(x, y, sideLength, color);
        tri2 = new Triangle(x, y, sideLength, color);
    }

    /**Draws the star object. */
    @Override
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();

        tri1.draw(g2d);
        g2d.rotate(Math.toRadians(180),x+sideLength/2,y-sideLength*0.5/Math.sqrt(3));
        tri2.draw(g2d);

        g2d.setTransform(reset);;
    }
    
}
