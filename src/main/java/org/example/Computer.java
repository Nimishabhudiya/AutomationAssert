package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;

public class Computer extends Utils {
    private By Computer = By.xpath("//ul[@class='top-menu notmobile']/li");
    private By Desktop = By.cssSelector("h2 [title='Show products in category Desktops']");
    private By Firstproduct=By.cssSelector("a[title='Show details for Build your own computer']");
    private By addYourReview=By.cssSelector("div[class='product-review-links'] a:nth-child(3)");
    private By reviewTitle=By.id("AddProductReview_Title");
    private By reviewText=By.id("AddProductReview_ReviewText");
    private By rating=By.id("addproductrating_3");
    private By submitReview=By.cssSelector("div[class='buttons'] input");
    private By emailafriend=By.cssSelector("div[class='email-a-friend']");
    private By Friendemail=By.id("FriendEmail");
    String emailTimestamp="Test"+timeStamp()+"@gmail.com";
    //private By emailaddress=By.id("YourEmailAddress");
    private By personalmessage=By.id("PersonalMessage");
    private By sendemail=By.cssSelector("div[class='buttons']");

    public void Computer() {
        ClickOnElement(Computer);
        ClickOnElement(Desktop);
        ClickOnElement(Firstproduct);


    }
    public void addReview() throws InterruptedException {
        ClickOnElement(addYourReview);
      //  Thread.sleep(4000);
        enterText(reviewTitle,"gift");
        enterText(reviewText,"gift for you");
        ClickOnElement(rating);
        ClickOnElement(submitReview);


    }
    public void EmailaFriend(){
        ClickOnElement(emailafriend);
        enterText(Friendemail,"mmm@gmail.com");
        //enterText(emailaddress, emailTimestamp);
        enterText(personalmessage,"hope you well");
        ClickOnElement(sendemail);


    }


}