package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.ClickOnElement;

public class Electronics extends Utils {

    private By Electronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    private By camera = By.cssSelector("a [title='Show products in category Camera & photo']");
    private By compare=By.cssSelector("div [class='buttons'] input:nth-child(2)");
    private By comparelist=By.cssSelector("div.product-grid > div > div:nth-child(3) > div > div.details > div.add-info > div.buttons > input.button-2.add-to-compare-list-button");
    private By productcomparision=By.cssSelector("a[href='/compareproducts']");
    private By clearlist=By.cssSelector("div [class='clear-list']");
    private By addcart1=By.cssSelector("input[class='button-2 product-box-add-to-cart-button']");
    //private By addcart2=By.cssSelector("value=div[class='add-to-card-panel'] input:nth-child(3)");
   // private By shoppingcart=By.cssSelector("div [id='topcartlink'] span:nth-child(2)");
    //private By termsofservice=By.cssSelector("div [id='termsofservice']");
   // private By checkout=By.cssSelector("div [id='checkout']");



    public void Electronics() {
        ClickOnElement(Electronics);
        ClickOnElement(camera);
        ClickOnElement(compare);

    }
    public void lastproduct(){
        ClickOnElement(Electronics);
        ClickOnElement(camera);
        //ClickOnElement(compare);
        ClickOnElement(comparelist);
        ClickOnElement(productcomparision);
       ClickOnElement(clearlist);
    }
    public void addcart() {
        ClickOnElement(Electronics);
        ClickOnElement(camera);
        ClickOnElement(addcart1);
        //ClickOnElement(addcart2);
        //ClickOnElement(shoppingcart);
       // ClickOnElement(termsofservice);
       // ClickOnElement(checkout);

    }







    }
