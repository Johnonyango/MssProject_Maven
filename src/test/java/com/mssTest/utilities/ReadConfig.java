package com.mssTest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties;

    public ReadConfig() {
        File src = new File("./Configurations/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            properties = new Properties();
            properties.load(fis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getApplicationUrl(){
        String url = properties.getProperty("baseUrl");
        return url;
    }
    public String getUserName(){
        String username = properties.getProperty("username");
        return username;
    }
    public String getPassword(){
        String password = properties.getProperty("password");
        return password;
    }
    public String getChromePath(){
        String chromePath = properties.getProperty("chromePath");
        return chromePath;
    }
    public String getGeckoDriverPath(){
        String geckoDriverPath = properties.getProperty("geckoDriverPath");
        return geckoDriverPath;
    }
}
