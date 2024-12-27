/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class creates steam. Particularly, it was used to draw it on top of the pan.
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

public class Steam implements DrawingObject{
    private Line line1, line2, line3, line4;
    private Color color;

    /**Instantiates the shapes (or lines) needed to create the illusion of what seems like steam */
    public Steam(double x1, double y1, double spacing){
        color = new Color(178,190,181);
        line1 = new Line(x1, y1, x1, y1-20, 5, color);
        line2 = new Line(x1+spacing, y1, x1+spacing, y1-20, 5, color);
        line3 = new Line(x1+2*spacing, y1, x1+2*spacing, y1-20, 5, color);
        line4 = new Line(x1+3*spacing, y1, x1+3*spacing, y1-20, 5, color);
    }

    /**Draws the steam */
    @Override
    public void draw(Graphics2D g2d) {
        line1.draw(g2d);
        line2.draw(g2d);
        line3.draw(g2d);
        line4.draw(g2d);
    }

}
