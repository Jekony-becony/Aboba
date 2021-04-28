package ru.deliveryClub;

import Aboba.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WeBDriverSettings {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        DriverUtils.initDriver();
        driver = DriverUtils.getDriver();
    }
    @AfterTest
    public void exit() {
        DriverUtils.destroyDriver();
    }
}
