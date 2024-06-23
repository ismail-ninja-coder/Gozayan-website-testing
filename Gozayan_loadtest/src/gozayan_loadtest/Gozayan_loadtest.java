/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gozayan_loadtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Ismail Hossain
 */
public class Gozayan_loadtest {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
         // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver-win64\\chromedriver.exe");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize window

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        // List of URLs to test
        String[] urls = {"https://gozayaan.com/", "https://gozayaan.com/emi-policy", "https://gozayaan.com/?search=flight"};

        // Loop through each URL and measure page load time
        for (String url : urls) {
            long startTime = System.currentTimeMillis();
            driver.get(url);
            long loadTime = System.currentTimeMillis() - startTime;
            System.out.println("Page load time for " + url + ": " + loadTime + " milliseconds");
        }

        // Close the browser
        driver.quit();
    }
    
}


