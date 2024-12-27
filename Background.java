/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is for instantiating the background of the SceneCanvas.
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

public class Background implements DrawingObject{
    private Rectangle2D background;
    private double x;
    private double y;
    private Color color;

    /**instantiates the background object as well as the color of the background*/
    public Background(double x, double y, double width, double height, Color color){
        background = new Rectangle2D.Double(x,y,width,height);
        this.color = color;
    }

    /**Draws the background of the SceneCanvas */
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(background);
    }
    

}
