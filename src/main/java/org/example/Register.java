package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;
import static org.example.Utils.utils.enterText;


    public class Register extends Utils {

        private By yourpersonaldetails = By.className("title");
        private By gender = By.id("gender-female");
        private By FirstName = By.id("FirstName");
        private By LastName = By.id("LastName");
        private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
        private By monthDropList = By.xpath("//select[@name='DateOfBirthMonth']");
        private By yearDropList = By.xpath("//select[@name='DateOfBirthYear']");
        private By Email = By.id("Email");
        private By CompanyName = By.xpath("//input[@name='Company']");
        private By Password = By.id("Password");
        private By ConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
        String emailtimeStamp="Test"+timeStamp()+"@gmail.com";
        private By Register=By.id("register-button");
        private By logout=By.className("ico-logout");

        public void personalDetails() {
            System.out.println(getTextFromElement(yourpersonaldetails));
            ClickOnElement(gender);
            enterText(FirstName, "Nimisha");
            enterText(LastName, "Pindoria");
            SelectByVisibleText(dayDropList, "7");
            SelectByVisibleText(monthDropList, "March");
            SelectByVisibleText(yearDropList, "1995");
            enterText(Email,emailtimeStamp);
            enterText(CompanyName, "Eurocom");
            enterText(Password, "nimisha123");
            enterText(ConfirmPassword, "nimisha123");
            ClickOnElement(Register);
            //ClickOnElement(logout);
        }


        public void logout() {
            ClickOnElement(logout);
        }
    }

