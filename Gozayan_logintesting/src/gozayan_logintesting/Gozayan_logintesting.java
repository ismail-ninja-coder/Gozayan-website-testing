/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gozayan_logintesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Ismail Hossain
 */
public class Gozayan_logintesting {

   /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gozayaan.com/account/signin");
        driver.manage().window().maximize();

        // Enter email and password
        driver.findElement(By.id("email")).sendKeys("ismailh2099@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Gozayan1111@");

        // Click on the login button
        driver.findElement(By.id("submitBtn")).click();

        // Wait for the dashboard page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Specify timeout duration using Duration object
        wait.until(ExpectedConditions.titleContains("Dashboard"));

        // Verify if login was successful
        String actual = driver.getTitle();
        String expected = "Dashboard";

        if (actual.contains(expected)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }

        // Close the browser
        driver.quit();
    }

}
