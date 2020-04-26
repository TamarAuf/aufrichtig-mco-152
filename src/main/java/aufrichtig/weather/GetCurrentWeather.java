package aufrichtig.weather;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetCurrentWeather {
    public static void main(String[] args) throws IOException {
        WeatherFrame weatherFrame = new WeatherFrame();

        URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?zip=" + weatherFrame.zipEntry +
                ",us&appid=b6907d289e10d714a6e88b30761fae22");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream in = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Gson gson = new Gson();
        CurrentWeather currentWeather = gson.fromJson(reader, CurrentWeather.class);
    }
}
