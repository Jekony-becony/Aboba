package ru.deliveryClub;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public  class FirstClass extends WeBDriverSettings{

    @Test
    public void firstTesr() {
        driver.get("https://www.delivery-club.ru/");
    String tittle = driver.getTitle();

    Assert.assertTrue(tittle.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));}

}
