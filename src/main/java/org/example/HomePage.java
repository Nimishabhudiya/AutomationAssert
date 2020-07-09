package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;
import static org.example.Utils.utils.ClickOnElement;


    public class HomePage extends Utils{

        private By search=By.id("small-searchterms");
        private By SearchButton= By.xpath("//input[@class='button-1 search-box-button']");
        public void searchField(){
            enterText(search,"Electronics");
            ClickOnElement(SearchButton);
        }
        private By register=By.className("ico-register");
        public void ClickOnRegister(){
            ClickOnElement(register);}
        public void getTextofRegister(){
            System.out.println(getTextFromElement(register));}

        private By clickCurrency=By.id("customerCurrency");
        private By selectEuroCurrency=By.xpath("//div[@class='currency-selector']//option[2]");
        private By giftCard=By.xpath("//ul[@class='top-menu notmobile']/li[7]");
        public void selectCurrency(){
            ClickOnElement(clickCurrency);
            ClickOnElement(selectEuroCurrency);

        }
        public void giftCard(){
            ClickOnElement(giftCard);}

        }


