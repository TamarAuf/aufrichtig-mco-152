package aufrichtig.shapes;
import javax.swing.*;
import java.awt.*;
public class ShapesFrame extends JFrame{
    private ShapeComponent shapeComponent;
    private JPanel leftPanel;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    public ShapesFrame() {

        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Shapes");

        setLayout(new BorderLayout());

        shapeComponent = new ShapeComponent();

        buttonOne = new JButton("First");
        buttonTwo = new JButton("Second");
        buttonThree = new JButton("Third");
        buttonFour = new JButton("Fourth");

        buttonOne.addActionListener(actionEvent ->{
            shapeComponent.setShapeOne();
        });
        buttonTwo.addActionListener(actionEvent ->{
            shapeComponent.setShapeTwo();
        });
        buttonThree.addActionListener(actionEvent ->{
            shapeComponent.setShapeThree();
        });
        buttonFour.addActionListener(actionEvent ->{
            shapeComponent.setShapeFour();
        });

        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4,1));
        leftPanel.setPreferredSize(new Dimension(100,800));

        leftPanel.add(buttonOne);
        leftPanel.add(buttonTwo);
        leftPanel.add(buttonThree);
        leftPanel.add(buttonFour);
        add(leftPanel, BorderLayout.WEST);

    }
    public static void main(String[] args){
        new ShapesFrame().setVisible(true);
    }
}
