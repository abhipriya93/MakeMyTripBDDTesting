package org.MakeMyTrip.Flight.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class WebDriverManagement {
   public WebDriver driver;
   Properties prop;
   public WebDriver WebDriverInitialise(Properties props)
   {
       if (driver==null) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.get(props.getProperty("url"));
       }
       return driver;
   }

    public WebDriver getDriver()
    {
        return driver;
    }

   public Properties init_prop()
   {
       try {
           FileInputStream fis = new FileInputStream("./src/test/resources/config/LiveEnv.properties");
           prop = new Properties();
           prop.load(fis);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       return prop;
   }
}
