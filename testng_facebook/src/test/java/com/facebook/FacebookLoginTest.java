package com.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @BeforeTest
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFacebookLogin() throws IOException {
        File file = new File("C:/Users/Welcome/eclipse-workspace/testng_facebook/Datas/demo.xlsx");
        FileInputStream fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            String expectedResult = row.getCell(2).getStringCellValue();

            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);
            driver.findElement(By.name("login")).click();

            String actualResult;
            if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
                actualResult = "Successful login";
            } else {
                actualResult = "Failed login";
            }

            row.createCell(3).setCellValue(actualResult);
        }

        fis.close();
        FileOutputStream fos = new FileOutputStream(file);
        workbook.write(fos);
        fos.close();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}