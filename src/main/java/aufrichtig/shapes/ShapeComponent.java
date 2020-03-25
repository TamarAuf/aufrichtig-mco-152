package aufrichtig.shapes;
import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent {
    private String shape = "one";

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
        }
    }

    public void drawOne(Graphics g) {
        g.drawLine(-280,-110,200,-110);
        g.drawLine(200,-110,-20,50);
        g.drawLine(-20,50,0,0);
        g.drawLine(0,0,-80,-20);
        g.drawLine(-80,-20,-10,-40);
        g.drawLine(-10,-40, -200, -100);

        g.drawOval(100,0,8,8);
        g.drawLine(100,-8,100,-25);
        g.drawLine(100,-8,105,-18);
        g.drawLine(100,-8,95,-18);
        g.drawLine(100,-25,110,-45);
        g.drawLine(100,-25,110,-45);

    }
    private void drawTwo(Graphics g) {
        g.drawLine(-210,110,200,110);
        g.drawLine(200,110,-20,-50);
        g.drawLine(-20,-50,0,0);
        g.drawLine(0,0,-80,20);
        g.drawLine(-80,20,-10,40);
        g.drawLine(-10,40, -200, 100);

    }
    private void drawThree(Graphics g) {
        g.drawLine(-280,-110,200,-110);
        g.drawLine(200,-110,-20,50);
        g.drawLine(-20,50,0,0);
        g.drawLine(0,0,-80,-20);
        g.drawLine(-80,-20,-10,-40);
        g.drawLine(-10,-40, -200, -100);

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


