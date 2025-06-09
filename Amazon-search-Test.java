package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

    public static void main(String[] args) {

        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in");

        // Locate search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Bluetooth Earphones");

        // Click search
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        // Print page title
        System.out.println("Page Title After Search: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
