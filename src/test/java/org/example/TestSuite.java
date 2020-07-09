package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestSuite extends BrowserSetup{

        HomePage homePage=new HomePage();
        Register registerPage=new Register();
        Computer computer=new Computer();
        Electronics electronics=new Electronics();

        @Test
        public void OpenHomepage() {

            homePage.ClickOnRegister();
            String registersuccessfully = driver.findElement(By.className("page-title")).getText();
            Assert.assertEquals(registersuccessfully, "Register");
            System.out.println("user able to register successfully");
           // homePage.getTextofRegister();
            registerPage.personalDetails();
        }
        @Test
                public void logout(){
            homePage.ClickOnRegister();
            registerPage.personalDetails();
            registerPage.logout();
            String WelcomeMessage=driver.findElement(By.className("div[class=\"topic-block-title\"] h2")).getText();
            Assert.assertEquals(WelcomeMessage,"Welcome to our store");
            System.out.println("user able to log out successfully");

        }




            @Test
            public void searchField() {

                homePage.searchField();
            }
            @Test
            public void selectCurrency() {

                homePage.selectCurrency();
            }
            @Test
            public void giftCard(){

            homePage.giftCard();
        }
        @Test
        public void Computer() {
            computer.Computer();
            String desktop=driver.findElement(By.cssSelector("div[class='page-title'] h1")).getText();
            Assert.assertEquals(desktop,"Desktops");
            System.out.println("user successfully on desktop page");

        }
        @Test
    public void addReview() throws InterruptedException {
            homePage.ClickOnRegister();
            registerPage.personalDetails();
            computer.Computer();
            computer.addReview();
            String Review=driver.findElement(By.cssSelector("div[class='result'")).getText();
            Assert.assertEquals(Review,"Product review is successfully added.");
            System.out.println("user successfully on review page");


        }
        @Test
    public void EmailaFriend(){
            homePage.ClickOnRegister();
            registerPage.personalDetails();
            computer.Computer();
            computer.EmailaFriend();
            String EmailaFriend=driver.findElement(By.cssSelector("div[class='result']")).getText();
            Assert.assertEquals(EmailaFriend,"Your message has been sent.");
            System.out.println("user email is sent");


        }
        @Test
    public void Electronics(){
            electronics.Electronics();
        }
        @Test
    public void lastproduct() {
            electronics.Electronics();
            electronics.lastproduct();
            String checklist = driver.findElement(By.cssSelector("div[class='no-data']")).getText();
            Assert.assertEquals(checklist, "You have no items to compare.");
            System.out.println("clear checklist");
        }
        @Test
    public void addcart(){
            electronics.Electronics();
            electronics.addcart();






        }




        }


