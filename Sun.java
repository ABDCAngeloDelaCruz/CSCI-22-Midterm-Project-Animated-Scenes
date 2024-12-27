/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This draws the sun object in the kitchen.
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

public class Sun implements DrawingObject{
    private Circle circ1, circ2;

    /**Instantiates the circles needed to create the Sun as well as its two colors. */
    public Sun(double x, double y, double size){
        circ1 = new Circle(x, y, size, new Color(255,204,51));
        circ2 = new Circle(x+size*0.075, y+size*0.075, size*0.85, new Color(255, 228, 132));
    }

    /**Draws the Sun object on the SceneCanvas */
    @Override
    public void draw(Graphics2D g2d) {
        circ1.draw(g2d);
        circ2.draw(g2d);
    }
    
}
