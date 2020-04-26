package aufrichtig.shapes;

import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent {
    private String shape;
    private int y = 0;
    private int rotation = 0;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        g.translate(centerX, centerY+y);


        switch (shape) {
            case "one":
                drawOne(g);
                repaint();
            case "two":
                drawTwo(g);
                repaint();
            case "three":
                drawThree(g);
                repaint();
            case "four":
                drawFour(g);
                repaint();
        }
    }

    public void drawOne(Graphics g) {
        g.drawLine(-300, -210, 200, -210);
        g.drawLine(200, -210, -50, -90);
        g.drawLine(-50, -90, 10, -50);
        g.drawLine(10, -50, -140, 0);
        g.drawLine(-140, 0, -70, 40);
        g.drawLine(-70, 40, -240, 100);

        g.drawOval(98, 27, 25, 25);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 80, 150);
        g.drawLine(100, 100, 120, 150);
        g.drawLine(100, 50, 70, 90);
        g.drawLine(100, 50, 130, 90);
    }

    private void drawTwo(Graphics g) {
        g.drawLine(-300, -210, 200, -210);
        g.drawLine(200, -210, -50, -90);
        g.drawLine(-50, -90, 10, -50);
        g.drawLine(10, -50, -140, 0);
        g.drawLine(-140, 0, -70, 40);
        g.drawLine(-70, 40, -240, 100);

        g.drawOval(45, -120, 40, 40);
        g.drawLine(65, -80, 110, 11);
        g.drawLine(65, -80, 4, -66);
        g.drawLine(4, -66, -40, -82);
        g.drawLine(65, -80, 53, -24);
        g.drawLine(53, -24, -19, -14);
        g.drawLine(110, 11, 7, 11);
        g.drawLine(7, 11, -95, 28);
        g.drawLine(110, 11, 105, 90);
        g.drawLine(105, 90, 180, 100);
        g.drawLine(180, 100, 174, 114);
    }

    private void drawThree(Graphics g) {
        g.drawLine(-300, -210, 200, -210);
        g.drawLine(200, -210, -50, -90);
        g.drawLine(-50, -90, 10, -50);
        g.drawLine(10, -50, -140, 0);
        g.drawLine(-140, 0, -70, 40);
        g.drawLine(-70, 40, -240, 100);

        g.drawOval(170, -155, 40, 40);
        g.drawLine(180, -115, 200, -210);
        g.drawLine(180, -115, 280, -40);
        g.drawLine(180, -115, 100, -45);
        g.drawLine(100, -45, 50, -135);
        g.drawLine(50, -135, -30, -75);
        g.drawLine(100, -45, 92, 60);
        g.drawLine(92, 60, 195, 97);
        g.drawLine(195, 97, 180, 116);

    }

    private void drawFour(Graphics g) {
        Thread thread = new Thread() {
            public void run() {
                super.run();
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        Graphics2D g2d = (Graphics2D) g;
        g2d.rotate(Math.toRadians(rotation));
        y++;
        rotation++;
        g.drawOval(98, -473, 25, 25);
        g.drawLine(100, -450, 100, -400);
        g.drawLine(100, -400, 80, -350);
        g.drawLine(100, -400, 120, -350);
        g.drawLine(100, -450, 70, -410);
        g.drawLine(100, -450, 130, -410);

    }

    public void setShapeOne() {
        shape = "one";
        repaint();
    }

    public void setShapeTwo() {
        shape = "two";
        repaint();
    }

    public void setShapeThree() {
        shape = "three";
        repaint();
    }

    public void setShapeFour() {
        shape = "four";
        repaint();
    }
}


