/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This draws the flame for the Stovetop class.
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

public class Flame implements DrawingObject{
    private Triangle tri1, tri2, tri3, tri4;

    /**Instantiates the shapes (triangles) needed to create the flame shape */
    public Flame(double x, double y, double side, Color color){
        tri1 = new Triangle(x,y,side,color);
        tri2 = new Triangle(x+side,y,side,color);
        tri3 = new Triangle(x+2*side, y, side, color);
        tri4 = new Triangle(x+3*side, y, side, color);
    }

    /**Draws the flame for the Stovetop class */
    @Override
    public void draw(Graphics2D g2d) {
        tri1.draw(g2d);
        tri2.draw(g2d);
        tri3.draw(g2d);
        tri4.draw(g2d);
    }
    
}
