/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gozayan_url_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Ismail Hossain
 */
public class Gozayan_url_test {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        WebDriver driver = new ChromeDriver();
        driver.get("https://gozayaan.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.close();
    }
    
}