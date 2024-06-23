/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gozayan_html_check;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ismail Hossain
 */
public class Gozayan_html_check {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException, Exception {
     URL url = new URL("https://gozayaan.com/"); // replace with the website you want to test
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode!= 200) {
            throw new Exception("Failed to connect to website");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
        reader.close();
    }
}