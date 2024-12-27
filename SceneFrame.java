/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023
    
    This class is used to set up what would be the JFrame which contains all the drawings in the SceneCanvas.
	Also has methods for interacting with the button.
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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame {
    private JFrame frame;
    private JButton button;
    private SceneCanvas sceneCanvas;

	/**Instantiates the frame, button, and the SceneCanvas*/
    public SceneFrame(){
        frame = new JFrame();
        button = new JButton("Move the Mug");
        sceneCanvas = new SceneCanvas(new Color(255, 233, 208));
    }

	/**Sets up the GUI and adds the buttons and SceneCanvas in it */
    public void setUpGUI(){
        Container cp = frame.getContentPane();
        frame.setTitle("Midterm Project - Dela Cruz, Angelo - 222086");

        cp.add(sceneCanvas, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

	/**For setting up the ButtonListener*/
    public void setUpButtonListener(){
        ButtonListener btn = new ButtonListener();
        button.addActionListener(btn);
    }

	/**Makes it so that when you press the button in the JFrame, the Mug in the SceneCanvas will move to the left
	If it runs out of space, it will return to its original x position.
	*/
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(sceneCanvas.getMug().getMugX()<320){
                sceneCanvas.getMug().resetX(sceneCanvas.getMug().getInitX());
            }
            else{
                sceneCanvas.getMug().moveMug(-15);
                sceneCanvas.repaint();
            }
        }
    } 
}
