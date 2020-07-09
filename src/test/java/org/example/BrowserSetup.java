package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup extends BasePage {
    @Before
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","src\\Resource\\Browser\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demo.nopcommerce.com/");
        System.out.println("user successfully landed on homepage");
    }
    @After

    public void CloseBrowser(){
        //driver.close();
    }

}
    


