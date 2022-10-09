package tests;

import base.BaseTest;
import data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NotesPage;

public class HomeTest extends BaseTest {
    private HomePage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver.findElement(By.xpath("//a[@href='#/home']")).click();
        page = new HomePage(driver);
    }

    @Test
    public void test01() {
        String expected = "Automation with Selenium";
        String actual = driver.findElement(By.id("title")).getText();
        Assert.assertEquals(expected, actual);

    }

    @Test(testName = "Validate header name")
    public void test02() {
        String expected = "Automation with Selenium";
        String actual = page.headerTitle.getText();
        System.out.println(page.headerTitle.getText());
        Assert.assertEquals(expected, actual);
    }

    @Test( dataProvider = "websites", dataProviderClass = DataProviders.class)
    public void test03(String webSites) {
//        String expectedWebsites = "PHP Travel, Mercury tours, InternetE-commerce, Passion Tea Company, Saucedemo, Shopping Cart";
//        Assert.assertTrue(page.websites.contains(expectedWebsites));

    }
    }

