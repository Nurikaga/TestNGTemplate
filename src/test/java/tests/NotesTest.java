package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NotesPage;

public class NotesTest extends BaseTest {
    private NotesPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
            driver.findElement(By.xpath("//nav/a[text()='Notes']")).click();
            page = new NotesPage(driver);
        }
        @Test(testName = "Validate header name")
    public void test01(){
        String actual = "Multiple Windows";
        String expected = page.headerText.getText();
            System.out.println(page.headerText.getText());
            Assert.assertEquals(expected, actual);
        }
        @Test(testName= "CSS Selectors header")
    public void test02(){
        page.menuIcon.click();
        page.CSSLine.click();
        String expectedText = "To find element that doesn’t contain specific attribute";
        String actualText =
        }
    }
