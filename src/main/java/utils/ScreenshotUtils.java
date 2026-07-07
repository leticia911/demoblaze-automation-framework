package utils;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtils {

    private ScreenshotUtils() {
    }

    public static String capture(
            WebDriver driver,
            String testName) {

        if (driver == null) {
            return null;
        }

        if (!(driver instanceof TakesScreenshot)) {
            return null;
        }

        String timestamp =
                LocalDateTime.now()
                        .format(
                                DateTimeFormatter.ofPattern(
                                        "yyyyMMdd_HHmmss"));

        String path =
                "screenshots/"
                        + testName
                        + "_"
                        + timestamp
                        + ".png";

        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);

        File destination =
                new File(path);

        try {

            FileUtils.copyFile(
                    source,
                    destination);

        } catch (IOException e) {

            throw new RuntimeException(
                    "No fue posible guardar el screenshot.",
                    e);

        }

        return destination.getAbsolutePath();

    }
}