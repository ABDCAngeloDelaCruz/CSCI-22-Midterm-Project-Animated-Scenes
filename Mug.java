/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to draw the Mug in the kitchen. Also used for controlling its position
    whenever the button is clicked.
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

public class Mug implements DrawingObject {
    private double x;
    private double initX;
    private double y;
    private double width;
    private double height;
    private Color color;

    /**Assigns the initial values for the body of the cup as well as its color */
    public Mug(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.initX = x;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**Draws the Mug in the Kitchen. Also creates instantiations of the shapes needed to form the Mug */
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double cupbody = new Rectangle2D.Double(x,y,width,height);
        Ellipse2D.Double cuphead = new Ellipse2D.Double(x,y-0.1*height,width,height*0.2);
        Circle inner = new Circle(x+width/3, y+0.15*height,height*0.7,new Color(255, 233, 208));
        Circle outer = new Circle(x+width/2,y+0.15*height,height*0.7, color);

        outer.draw(g2d);
        inner.draw(g2d);
        g2d.setColor(color);
        g2d.fill(cupbody);
        g2d.setColor(Color.BLACK);
        g2d.fill(cuphead);
    }

    /**Moves the mug to whichever horizontal direction */
    public void moveMug(double m){
        x+=m;
    }

    /**Returns the initial x position of the Mug */
    public double getInitX(){
        return initX;
    }

    /**Resets the x position of the Mug to what r is */
    public void resetX(double r){
        x = r;
 
    }

    /**Returns the current x position of the Mug */
    public double getMugX(){
        return x;
    }
}
