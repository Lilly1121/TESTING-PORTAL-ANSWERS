package com.example;
 import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
 /**
 * Unit test for simple App.
 */
 public class AppTest 
 {
 public static WebDriver driver;
@Test
 public void shouldAnswerWithTrue() throws MalformedURLException, InterruptedException
 {
ChromeOptions co = new ChromeOptions();
// WebDriverManager.chromedriver().setup();
// WebDriver driver = new ChromeDriver();
driver= new RemoteWebDriver(new URL("http://localhost:4444/"),co);
driver.get("https://www.shoppersstop.com");
Thread.sleep(8000);
driver.findElement(By.className("user-icon")).click();
driver.manage().window().maximize();
// String tit =driver.getTitle();
// String src =driver.getPageSource();
driver.navigate().to("https://www.google.com");
driver.navigate().back();
driver.close();
}
 }
