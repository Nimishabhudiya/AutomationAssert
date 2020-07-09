package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.openqa.grid.common.SeleniumProtocol.WebDriver;

public class Utils {

    public static class utils extends BasePage {

        //to click on elements
        public static void ClickOnElement(By by) {
            driver.findElement(by).click();
        }

        //to enter text
        public static void enterText(By by, String text) {
            driver.findElement(by).sendKeys(text);

        }

        //to get text from element
        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        //to select from droplist by visible text
        public static void SelectByVisibleText(By by, String name) {
            new Select(driver.findElement(by)).selectByVisibleText(name);

        }

        //for creating timestamp to use in email
        public static String timeStamp() {
            DateFormat format = new SimpleDateFormat("DDMMYYHHMMSS");
            return format.format(new Date());
        }

        //to wait for element to be invisible
        public static void waitForElementToBeInvisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        public static void waitForElementToBevisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        //to wait for a element to be display
        public static void waitForElementToBeDisplay(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        }


        // to select from droplist by index
        public static void selectByIndex(By by, int numb) {
            new Select(driver.findElement(by)).selectByIndex(numb);


            //to do scroll down page

































































        }
        }
    }


