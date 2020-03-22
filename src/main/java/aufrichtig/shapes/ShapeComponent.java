package aufrichtig.shapes;

import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent {
    private String shape;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        g.translate(centerX, centerY);
        switch(shape){
        case "one": drawOne(g);
        case "two": drawTwo(g);
        case "three": drawThree(g);
        case "four": drawFour(g);
    }}

    private void drawOne(Graphics g) {

    }
    private void drawTwo(Graphics g) {

    }
    private void drawThree(Graphics g) {

    }
    private void drawFour(Graphics g) {

    }
    public void setShapeOne(){
        shape = "one";
        repaint();
    }
    public void setShapeTwo(){
        shape = "two";
        repaint();
    }
    public void setShapeThree(){
        shape = "three";
        repaint();
    }
    public void setShapeFour(){
        shape = "four";
        repaint();
    }
}


