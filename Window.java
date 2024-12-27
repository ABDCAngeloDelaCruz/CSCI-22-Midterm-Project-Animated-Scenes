/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the Window object in the kitchen.
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

public class Window implements DrawingObject {
    private Square sqr;
    private Line line1, line2, frame1, frame2, frame3, frame4;
    private Sun sun;

    /**Instantiates the shapes (squares, lines, and the Sun) needed to form the Window. */
    public Window(double x, double y, double size){
        sqr = new Square(x, y, size, Color.WHITE);
        line1 = new Line(x, y+size/2, x+size, y+size/2, 3, Color.BLACK);
        line2 = new Line(x+size/2, y, x+size/2, y+size, 3, Color.BLACK);
        frame1 = new Line(x, y, x+size, y, 4, Color.GRAY);
        frame2 = new Line(x, y+size, x+size, y+size, 4, Color.GRAY);
        frame3 = new Line(x, y, x, y+size, 4, Color.GRAY);
        frame4 = new Line(x+size, y, x+size, y+size, 4, Color.GRAY);
        sun = new Sun(x+size*0.15,y+size*0.15,size*0.5);
        
    }

    /**Draws Window and the sun "behind" it */
    @Override
    public void draw(Graphics2D g2d) {
        sqr.draw(g2d);
        sun.draw(g2d);
        line1.draw(g2d);
        line2.draw(g2d);
        frame1.draw(g2d);
        frame2.draw(g2d);
        frame3.draw(g2d);
        frame4.draw(g2d);
    }
    
}
