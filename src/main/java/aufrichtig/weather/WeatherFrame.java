package aufrichtig.weather;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class WeatherFrame extends JFrame{
    private JLabel zipLabel;
    private JTextField zip;
    private JButton getWeath;
    private JLabel loc;
    private JLabel temp;
    private JLabel descrip;
    private JLabel main;

    private JPanel topPanel;
    private JPanel bottomPanel;

    private String location;

    protected String zipEntry;

    public WeatherFrame() {
        setSize(400, 400);
        setTitle("Weather Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        CurrentWeather currentWeather = new CurrentWeather();


        zipLabel = new JLabel("Enter Zip Code");
        zip = new JTextField();
        zipEntry = zip.getText();
        getWeath = new JButton("Weather");
        loc = new JLabel("Location: " + currentWeather.name);
        temp = new JLabel("Temperature: " + String.valueOf(currentWeather.main.temp));
        descrip = new JLabel("Description: " + currentWeather.weather[0].description);
        main = new JLabel("Main: " + currentWeather.weather[0].main);

        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 3));
        topPanel.setSize(200, 200);
        topPanel.add(zipLabel);
        topPanel.add(zip);
        topPanel.add(getWeath);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,4));
        topPanel.setSize(200, 200);
        bottomPanel.add(loc);
        bottomPanel.add(temp);
        bottomPanel.add(descrip);
        bottomPanel.add(main);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);

        getWeath.addActionListener(actionEvent -> {
            try {
                GetCurrentWeather getCurrentWeather = new GetCurrentWeather();
            } catch (IOException e) {
                loc.setText("Error. Try again.");
            }
        });
    }

    public static void main(String[] args) {
        WeatherFrame weatherFrame = new WeatherFrame();
        weatherFrame.setVisible(true);
    }
}
