package aufrichtig.dictionary;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class ScrabbleFrame extends JFrame {

    private JTextField wordField;
    private JLabel answerLabel;
    private ScrabbleDictionary dictionary;

    public ScrabbleFrame() {
        setSize(400, 300);
        setTitle("Scrabble Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        wordField = new JTextField();
        wordField.setPreferredSize(new Dimension(160, 40));
        JButton checkButton = new JButton("Check");

        checkButton.addActionListener(actionEvent -> {
            try {
                checkWord();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });

        answerLabel = new JLabel();
        answerLabel.setPreferredSize(new Dimension(100, 40));
        add(wordField);
        add(checkButton);
        add(answerLabel);

        try {
            dictionary = new ScrabbleDictionary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkWord() throws FileNotFoundException {
        boolean isInDictionary = dictionary.isValid(wordField.getText());
        if (isInDictionary) {
            answerLabel.setBackground(Color.GREEN);
        } else {
            answerLabel.setBackground(Color.RED);
        }
        answerLabel.setText(String.valueOf(isInDictionary));
    }

    public static void main(String[] args) {
        ScrabbleFrame frame = new ScrabbleFrame();
        frame.setVisible(true);
    }
}