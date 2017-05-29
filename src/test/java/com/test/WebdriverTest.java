package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.soap.Text;
import java.util.List;

public class WebdriverTest{
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://litecart-2.0.1/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.tagName("button")).click();

    }

    @Test
    public void testSideBarAppearance1() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=appearance]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String template = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(template.equals(" Template"));
    }

    @Test
    public void testSideBarAppearance2() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=appearance]")).click();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-logotype")).click();
        //wait.until(ExpectedConditions.visibilityOf(element));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        String logotype = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(logotype.equals(" Logotype"));
    }

    @Test
    public void testSideBarCatalog(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String catalog = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(catalog.equals(" Catalog"));

    }

    @Test
    public void testSideBarCatalogPG(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-product_groups")).click();
        String pGroup = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(pGroup.equals(" Product Groups"));

    }

    @Test
    public void testSideBarCatalogOG(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-option_groups")).click();
        String oGroup = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(oGroup.equals(" Option Groups"));

    }


    @Test
    public void testSideBarCatalogManufacturers(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-manufacturers")).click();
        String manufacturers = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(manufacturers.equals(" Manufacturers"));

    }


    @Test
    public void testSideBarCatalogSuppliers(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-suppliers")).click();
        String suppliers = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(suppliers.equals(" Suppliers"));

    }


    @Test
    public void testSideBarCatalogDS(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-delivery_statuses")).click();
        String dStatus = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(dStatus.equals(" Delivery Statuses"));

    }


    @Test
    public void testSideBarCatalogSOS(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-sold_out_statuses")).click();
        String sOS = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(sOS.equals(" Sold Out Statuses"));

    }

    @Test
    public void testSideBarCatalogQU(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-quantity_units")).click();
        String qUnits = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(qUnits.equals(" Quantity Units"));

    }


    @Test
    public void testSideBarCatalogCSV(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv")).click();
        String csv = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(csv.equals(" CSV Import/Export"));

    }

    @Test
    public void testSideBarCountries() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=countries]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String countries = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(countries.equals(" Countries"));
    }


    @Test
    public void testSideBarCurrencies() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=currencies]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String currencies = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(currencies.equals(" Currencies"));
    }


    @Test
    public void testSideBarCustomers() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String customers = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(customers.equals(" Customers"));
    }


    @Test
    public void testSideBarCustomersCSV(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv")).click();
        String csv = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(csv.equals(" CSV Import/Export"));

    }

    @Test
    public void testSideBarCustomersNewsletter(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-newsletter")).click();
        String newsletter = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(newsletter.equals(" Newsletter"));

    }


    @Test
    public void testSideBarGeoZones() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=geo_zones]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String gZones = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(gZones.equals(" Geo Zones"));
    }


    @Test
    public void testSideBarLanguages() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=languages]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String languages = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(languages.equals(" Languages"));
    }

    @Test
    public void testSideBarLanguagesStorageEncoding() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=languages]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-storage_encoding")).click();
        String languages = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(languages.equals(" Storage Encoding"));
    }


    @Test
    public void testSideBarModules() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=modules]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h1")));
        String languages = driver.findElement(By.cssSelector("h1")).getAttribute("innerText");
        assert(languages.equals(" Job Modules"));
    }










    @After
    public void stop(){
        driver.quit();
    }




}