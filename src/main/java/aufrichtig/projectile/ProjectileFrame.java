package aufrichtig.projectile;

import javax.swing.*;
import java.awt.*;

public class ProjectileFrame extends JFrame{

    private JTextArea projectileCoords;
    private JTextField velocity;
    private JTextField angle;
    private JButton calculateButton;
    private JLabel velocityLabel;
    private JLabel angleLabel;

    private JPanel leftPanel;

    public ProjectileFrame(){
        setSize(300, 400);
        setTitle("Projectile");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        projectileCoords = new JTextArea();
        velocity = new JTextField();
        angle = new JTextField();
        calculateButton = new JButton("Calculate");
        velocityLabel = new JLabel("Velocity");
        angleLabel = new JLabel("Angle (degrees)");

        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3,2));
        leftPanel.add(velocityLabel);
        leftPanel.add(velocity);
        leftPanel.add(angleLabel);
        leftPanel.add(angle);
        leftPanel.add(calculateButton);

        add(projectileCoords, BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);

    }

    public static void main(String[] args) {
        new ProjectileFrame().setVisible(true);
    }
}