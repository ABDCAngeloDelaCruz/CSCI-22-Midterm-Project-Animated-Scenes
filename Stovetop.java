/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class creates the stovetop in the kitchen.
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

public class Stovetop implements DrawingObject{
    private Flame flame;
    private Rectangle2D.Double stove;
    private Ellipse2D.Double ring;
    private Circle knob;
    private Line knobHandle;

    /**Instantiates the shapes needed such as the flame, circle, line, ellipse, and rectangle for the 
     * creation of the stovetop.
     */
    public Stovetop(double x, double y, double width, double height){
        stove = new Rectangle2D.Double(x,y,width,height);
        flame = new Flame(x+width/4.5, y-height*0.1, height*0.45, new Color(0,94,136));
        ring = new Ellipse2D.Double(x+width/6, y-height*0.25, width/3*2, width*0.12);
        knob = new Circle(x+width*0.4, y+height*0.2, width*0.2, new Color(15,4,4));
        knobHandle = new Line(x+width*0.43, y+height*0.2+width*0.1, x+width*0.57, y+height*0.2+width*0.1, 2, Color.WHITE);
    }

    /**Draws the stovetop object and sets its color. */
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(161,157,148));
        g2d.fill(stove);
        g2d.setColor(Color.BLACK);
        g2d.fill(ring);
        flame.draw(g2d);
        knob.draw(g2d);
        knobHandle.draw(g2d);
    }

    
}
