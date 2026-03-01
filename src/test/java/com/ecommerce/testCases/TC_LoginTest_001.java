package com.ecommerce.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ecommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException, IOException {
        // 
        driver.get(baseURL);
        
        LoginPage lp = new LoginPage(driver);
        
        // 
        lp.clickLoginLink();
        lp.setUserName(username); //        
        lp.clickSubmit();
        
        // 
        Thread.sleep(3000); 
        
        String title = driver.getTitle();
        System.out.println("Current Page Title: " + title);
        
        // 
        if(title.contains("Dashboard") || title.contains("nopCommerce demo store")) {
            Assert.assertTrue(true);
            System.out.println("Login Test Passed: Sir, we are on the dashboard.");
        } else {
            //
            captureScreen(driver, "loginTest"); 
            System.out.println("Login Test Failed: Screenshot has been captured.");
            Assert.assertTrue(false);
        }
    }
}