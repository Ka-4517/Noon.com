package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addCredentials()
    {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }

    public void clickOnLoginButton()
    {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
