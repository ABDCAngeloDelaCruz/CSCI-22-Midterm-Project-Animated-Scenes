/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is for drawing the Cabinet in the SceneCanvas.
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

public class Cabinet implements DrawingObject {
    private Rectangle2D rect;
    private Line line1, line2, line3, line4, line5;
    private Circle knob1, knob2;
    private Color color;

    /**Instantiates the needed object for the drawing of the cabinet in the SceneCanvas such as 
     * rectangles, lines, and circles. Also instantiates its color.
    */
    public Cabinet(double x, double y, double width, double height, Color color){
        rect = new Rectangle2D.Double(x,y,width,height);
        line1 = new Line(x, y, x+width, y, 3, Color.BLACK);
        line2 = new Line(x,y+height,x+width,y+height,3,Color.BLACK);
        line3 = new Line(x,y,x,y+height,3,Color.BLACK);
        line4 = new Line(x+width,y,x+width,y+height,3,Color.BLACK);
        line5 = new Line(x+width/2,y,x+width/2,y+height,3,Color.BLACK);
        this.color = color;
        
        knob1 = new Circle(x+width*0.3, y+height*0.6, width/8, new Color(144,82,0));
        knob2 = new Circle(x+width*0.57, y+height*0.6, width/8, new Color(144,82,0));
    }

    /**Draws the Cabinet in the SceneCanvas */
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(rect);

        line1.draw(g2d);
        line2.draw(g2d);
        line3.draw(g2d);
        line4.draw(g2d);
        line5.draw(g2d);
        knob1.draw(g2d);
        knob2.draw(g2d);
    }
    
}
