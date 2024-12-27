/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023
    
    This class is used to instantiate all the shapes implementing the DrawingObject interface.
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
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    private Color bgColor;
    private ArrayList<DrawingObject> drawObjects;

	/**Assigns the Canvas' background parameters.
	Creates an ArrayList of DrawingObject with which we could store our shapes in.
	*/
    public SceneCanvas(Color bgc){
        width = 1024;
        height = 768;
        bgColor = bgc;
        setPreferredSize(new Dimension(width, height));

        drawObjects = new ArrayList<>();
        drawObjects.add(new Background(0, 0, width, height, bgColor));
        drawObjects.add(new Countertop(300, 512, 1024, 256, new Color(100,149,237), new Color(196,99,22)));
        drawObjects.add(new Mug(950, 512-256*0.4, 40, 50, Color.RED));
        drawObjects.add(new Window(420, 150,250));
        drawObjects.add(new Stovetop(680, 430, 100, 30));
        drawObjects.add(new Pan(690,384,80,30));
        drawObjects.add(new Steam(715, 370, 10));
        drawObjects.add(new Refrigerator(20, 256, 260, 464, new Color(128,0,32)));
        drawObjects.add(new Cabinet(720, 100, 250, 200, new Color(184,161,131)));
        drawObjects.add(new Triangle(150, 400, 40, Color.MAGENTA));
        drawObjects.add(new Hexagon(170, 480, 30, Color.RED));
        drawObjects.add(new Star(120, 580, 40, Color.BLUE));
        drawObjects.add(new Triangle(210, 650, 40, Color.CYAN));
        drawObjects.add(new Hexagon(180, 320, 30, new Color(64,127,127)));
        drawObjects.add(new Star(100, 300, 40, Color.PINK));
        drawObjects.add(new Star(50,680,35, new Color(165,198,99)));
    }

	/**Draws each of the shape stores in drawObjects*/
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        for (DrawingObject dObj: drawObjects){
            dObj.draw(g2d);
        }
    }

	/**Returns the Mug from the ArrayList of drawObjects for use in the SceneFrame*/
    public Mug getMug(){
        return (Mug) drawObjects.get(2);
    }
}
