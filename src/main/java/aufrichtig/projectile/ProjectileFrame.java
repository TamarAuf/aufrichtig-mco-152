package aufrichtig.projectile;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class ProjectileFrame extends JFrame{

    private JLabel projectileCoords;
    private JTextField velocity;
    private JTextField angle;
    private JTextField time;
    private JButton calculateButton;
    private JLabel velocityLabel;
    private JLabel angleLabel;
    private JLabel timeLabel;

    private JPanel leftPanel;

    public ProjectileFrame(){
        setSize(500, 400);
        setTitle("Projectile");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        projectileCoords = new JLabel();
        velocity = new JTextField();
        angle = new JTextField();
        time = new JTextField();
        calculateButton = new JButton("Calculate");
        velocityLabel = new JLabel("Velocity");
        angleLabel = new JLabel("Angle (degrees)");
        timeLabel = new JLabel("Time");

        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4,2));
        leftPanel.add(velocityLabel);
        leftPanel.add(velocity);
        leftPanel.add(angleLabel);
        leftPanel.add(angle);
        leftPanel.add(timeLabel);
        leftPanel.add(time);
        leftPanel.add(calculateButton);
        leftPanel.add(projectileCoords);

        add(leftPanel, BorderLayout.WEST);

        calculateButton.addActionListener(actionEvent -> {
            try {
                Projectile projectile = new Projectile(Double.parseDouble(angle.getText()),
                        Double.parseDouble(velocity.getText()));
                projectile.increaseTime(Double.parseDouble(time.getText()));
                projectileCoords.setText(String.valueOf(projectile));
            }
            catch(Exception e){
                projectileCoords.setText("You must enter all values correctly.");
            }
        });

    }

    public static void main(String[] args) {
        new ProjectileFrame().setVisible(true);
    }
}