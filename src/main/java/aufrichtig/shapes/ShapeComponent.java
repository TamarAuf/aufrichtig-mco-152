package aufrichtig.shapes;

import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        g.translate(centerX, centerY);

        drawStar(g);
    }

    private void drawStar(Graphics g) {
        g.drawLine(-100, -100, 0, 75);
        g.drawLine(0, 75, 275, 275);
        g.drawLine(275, 275, -50, 59);
        g.drawLine(-50, 59, 275, 59);
        g.drawLine(275, 59, -100, -100);
    }
}


