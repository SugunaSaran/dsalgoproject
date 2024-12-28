package Utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
	public static void captureScreenshot(String screenshotName) {
        // Get WebDriver instance from ThreadLocal
        WebDriver driver = DriverFactory.getDriver();  // Use your DriverFactory or similar class
        
        if (driver instanceof TakesScreenshot) {  // Ensure that the WebDriver instance can take screenshots
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);
            
            // Define the directory to store the screenshot
            String targetDirectory = "target/screenshots/";
            File targetFile = new File(targetDirectory + screenshotName + ".png");

            try {
                // Ensure the directory exists
                File directory = new File(targetDirectory);
                if (!directory.exists()) {
                    boolean created = directory.mkdirs();  // Create directories if they don't exist
                    if (!created) {
                        System.out.println("Failed to create directory: " + targetDirectory);
                    }
                }

                // Copy the screenshot to the target location
                FileUtils.copyFile(sourceFile, targetFile);
                System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Driver does not support taking screenshots");
        }
    }

}
