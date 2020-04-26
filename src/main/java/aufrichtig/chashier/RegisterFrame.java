package aufrichtig.chashier;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RegisterFrame extends JFrame {

    private JButton twentyButton;
    private JButton tenButton;
    private JButton fiveButton;
    private JButton oneButton;
    private JButton quarterButton;
    private JButton dimeButton;
    private JButton nickelButton;
    private JButton pennyButton;

    private JLabel priceTextLabel;
    private JLabel priceLabel;
    private JLabel amountTextLabel;
    private JLabel amountLabel;
    private JButton clearButton;
    private JButton payButton;

    private JLabel registerTextLabel;
    private JLabel registerLabel;
    private JLabel changeTextLabel;
    private JLabel changeLabel;

    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;

    private JLabel errors;
    
    private int newTwent;
    private int newTen;
    private int newFive;
    private int newOne;
    private int newQuart;
    private int newDime;
    private int newNick;
    private int newPenn;

    private int num;
    private double price;

    private double amountPaid = 0;

    public RegisterFrame() throws NotEnoughChangeException {

        Cashier cashier = new Cashier();

        Random rand = new Random();

        num = rand.nextInt(10000);
        price = num / 100;

        setSize(1000, 200);
        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        twentyButton = new JButton("Twenty Dollars");
        tenButton = new JButton("Ten Dollars");
        fiveButton = new JButton("Five Dollars");
        oneButton = new JButton("One Dollar");
        quarterButton = new JButton("Quarter");
        dimeButton = new JButton("Dime");
        nickelButton = new JButton("Nickel");
        pennyButton = new JButton("Penny");

        priceTextLabel = new JLabel("Price:");
        priceLabel = new JLabel(String.valueOf(price));
        amountTextLabel = new JLabel("Amount:");
        amountLabel = new JLabel(String.valueOf(amountPaid));
        clearButton = new JButton("Clear");
        payButton = new JButton("Pay");

        registerTextLabel = new JLabel("Register:");
        registerLabel = new JLabel(String.valueOf(cashier.getRegAmount()));
        changeTextLabel = new JLabel("Change:");
        changeLabel = new JLabel(String.valueOf(cashier.getChange()));

        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 8));

        topPanel.add(twentyButton);
        topPanel.add(tenButton);
        topPanel.add(fiveButton);
        topPanel.add(oneButton);
        topPanel.add(quarterButton);
        topPanel.add(dimeButton);
        topPanel.add(nickelButton);
        topPanel.add(pennyButton);

        middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1, 6));
        middlePanel.add(priceTextLabel);
        middlePanel.add(priceLabel);
        middlePanel.add(amountTextLabel);
        middlePanel.add(amountLabel);
        middlePanel.add(clearButton);
        middlePanel.add(payButton);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 4));
        bottomPanel.add(registerTextLabel);
        bottomPanel.add(registerLabel);
        bottomPanel.add(changeTextLabel);
        bottomPanel.add(changeLabel);

        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        Cash custCash = new Cash();

        twentyButton.addActionListener(actionEvent -> {
            newTwent += 1;
            custCash.setTwentyDollar(newTwent);
            amountPaid += 20;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        tenButton.addActionListener(actionEvent -> {
            newTen += 1;
            custCash.setTwentyDollar(newTen);
            amountPaid += 10;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        fiveButton.addActionListener(actionEvent -> {
            newFive += 1;
            custCash.setTenDollar(newFive);
            amountPaid += 5;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        oneButton.addActionListener(actionEvent -> {
            newOne += 1;
            custCash.setFiveDollar(newOne);
            amountPaid += 1;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        quarterButton.addActionListener(actionEvent -> {
            newQuart += 1;
            custCash.setQuarter(newQuart);
            amountPaid += .25;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        dimeButton.addActionListener(actionEvent -> {
            newDime += 1;
            custCash.setDime(newDime);
            amountPaid += .1;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        nickelButton.addActionListener(actionEvent -> {
            newNick += 1;
            custCash.setNickel(newNick);
            amountPaid += .05;
            amountLabel.setText((String.valueOf(amountPaid)));
        });
        pennyButton.addActionListener(actionEvent -> {
            newPenn += 1;
            custCash.setPenny(newPenn);
            amountPaid += .01;
            amountLabel.setText((String.valueOf(amountPaid)));
        });

        clearButton.addActionListener(actionEvent -> {
            custCash.setTwentyDollar(0);
            custCash.setTenDollar(0);
            custCash.setFiveDollar(0);
            custCash.setDollar(0);
            custCash.setQuarter(0);
            custCash.setDime(0);
            custCash.setNickel(0);
            custCash.setPenny(0);
            amountPaid = 0;
            amountLabel.setText(String.valueOf(amountPaid));
        });

        payButton.addActionListener(actionEvent -> {
            try {
                cashier.pay(price, custCash);
                registerLabel.setText(String.valueOf(cashier.getRegAmount()));
                changeLabel.setText(String.valueOf(cashier.getChange()));
            } catch (NotEnoughChangeException e) {
                e.printStackTrace();
            }
        });

    }
    public static void main(String[] args) throws NotEnoughChangeException{
        RegisterFrame registerFrame = new RegisterFrame();
        registerFrame.setVisible(true);
    }
}
