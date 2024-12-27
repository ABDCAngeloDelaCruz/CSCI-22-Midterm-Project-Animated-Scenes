/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the triangles for whichever class wants to use it.
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

public class Triangle implements DrawingObject{
    private double x;
    private double y;
    private double sideLength;
    private Color color;

    /**Assigns the initial values like position, side length, and color of the triangle  */
    public Triangle(double x, double y, double sideLength, Color color){
        this.x=x;
        this.y=y;
        this.sideLength=sideLength;
        this.color=color;
    }

    /**Draws the triangle using Path2D and a bit of Geometry and Algebra */
    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double tri = new Path2D.Double();
        tri.moveTo(x, y);
        tri.lineTo(x+sideLength, y);
        tri.lineTo(x+sideLength/2,y-sideLength*Math.sqrt(3)/2);
        tri.closePath();
        g2d.setColor(color);
        g2d.fill(tri);
    }
    
}
