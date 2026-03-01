package com.ecommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {
        File src = new File("./Configurations/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getUserEmail() {
        // 
        String email = pro.getProperty("useremail");
        return email;
    }

    public String getPassword() {
        // 
        String password = pro.getProperty("password");
        return password;
    }

    public String getBrowser() {
        String br = pro.getProperty("browser");
        return br;
    }
}